package entitie;
// Generated 02-oct-2015 16:45:10 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Municipio generated by hbm2java
 */
@Entity
@Table(name="municipio"
    ,schema="public"
)
public class Municipio  implements java.io.Serializable {


     private int idMunicipio;
     private String nombre;
     private String estado;
     private Set<MunicipioCalle> municipioCalles = new HashSet<MunicipioCalle>(0);

    public Municipio() {
    }

	
    public Municipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }
    public Municipio(int idMunicipio, String nombre, String estado, Set<MunicipioCalle> municipioCalles) {
       this.idMunicipio = idMunicipio;
       this.nombre = nombre;
       this.estado = estado;
       this.municipioCalles = municipioCalles;
    }
   
     @Id 

    
    @Column(name="id_municipio", unique=true, nullable=false)
    public int getIdMunicipio() {
        return this.idMunicipio;
    }
    
    public void setIdMunicipio(int idMunicipio) {
        this.idMunicipio = idMunicipio;
    }

    
    @Column(name="nombre")
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="estado")
    public String getEstado() {
        return this.estado;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="municipio")
    public Set<MunicipioCalle> getMunicipioCalles() {
        return this.municipioCalles;
    }
    
    public void setMunicipioCalles(Set<MunicipioCalle> municipioCalles) {
        this.municipioCalles = municipioCalles;
    }




}


