package services.impl;

import entitie.Maestro;
import entitie.Persona;
import entitie.dao.MaestroDAO;
import entitie.dao.PersonaDAO;
import entitie.dao.impl.MaestroDAOImpl;
import entitie.dao.impl.PersonaDAOImpl;
import java.util.List;
import services.service;

/**
 *
 * @author willy
 */
public class ServiceImpl implements service {
    
    private final PersonaDAO personaDAO  = new PersonaDAOImpl();
    private final MaestroDAO maestroDAO = new MaestroDAOImpl();
    
    
    @Override
    public void guardarPersona(Persona persona){
        personaDAO.guardarPersona(persona);
    } 
    @Override
    public List<Maestro> listarMaestro(){
        return maestroDAO.getMaestro();
    }
    public Maestro getMaestro(int leNumero){
        return maestroDAO.getMaestro(leNumero);
    }
}
