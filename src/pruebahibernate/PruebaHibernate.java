package pruebahibernate;

import entitie.Maestro;
import entitie.Persona;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import services.impl.ServiceImpl;
import services.service;

/**
 *
 * @author willy
 */
public class PruebaHibernate {
     
             
    /**
     * @param args the command line arguments
     */
    private final static String ESTADO_ACTIVO = "ACTIVO";
    
    public static void main(String[] args) {
        // TODO code application logic here
        service Service = new ServiceImpl();
        try {
            Maestro maestro = Service.getMaestro(498);
            Persona persona = new Persona();
             String[] split = maestro.getLeApynom().split(" ");
             persona.setApellido(split[0]);
             persona.setNombre(armarNombre(split));
             persona.setDni(Integer.valueOf(String.valueOf(maestro.getLeDocNro())));
             persona.setCuilCuit(armarCuit(maestro.getLeCuilDav(),maestro.getLeCuilCod(),maestro.getLeDocNro()));
             persona.setEstado(ESTADO_ACTIVO);
             Service.guardarPersona(persona);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }
        private static String armarNombre(String[] split){
            String nombre = "";
            for (int i = 1; i < split.length; i++) {
                nombre = nombre.concat(split[i].trim()).concat(" ");                
            }
            return nombre;
            
        }      
       
        private static String armarCuit(Short cuildav, Short lecuilcod, Long leDocNro){
//            String saux;
//            saux = lecuilcod.toString();
//            saux = saux + "-";
//            saux = saux + String.valueOf(leDocNro);
//            saux = saux + "-";
//            saux = saux + cuildav.toString();
//            return saux;
                  
            return lecuilcod.toString().concat("-")
                    .concat(leDocNro.toString())
                    .concat("-")
                    .concat(cuildav.toString());
        }
               
    
}
