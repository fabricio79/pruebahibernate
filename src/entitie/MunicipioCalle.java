package entitie;
// Generated 02-oct-2015 16:45:10 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * MunicipioCalle generated by hbm2java
 */
@Entity
@Table(name="municipio_calle"
    ,schema="public"
)
public class MunicipioCalle  implements java.io.Serializable {


     private int idMunicipioCalle;
     private Calle calle;
     private Municipio municipio;

    public MunicipioCalle() {
    }

    public MunicipioCalle(int idMunicipioCalle, Calle calle, Municipio municipio) {
       this.idMunicipioCalle = idMunicipioCalle;
       this.calle = calle;
       this.municipio = municipio;
    }
   
     @Id 

    
    @Column(name="id_municipio_calle", unique=true, nullable=false)
    public int getIdMunicipioCalle() {
        return this.idMunicipioCalle;
    }
    
    public void setIdMunicipioCalle(int idMunicipioCalle) {
        this.idMunicipioCalle = idMunicipioCalle;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_calle", nullable=false)
    public Calle getCalle() {
        return this.calle;
    }
    
    public void setCalle(Calle calle) {
        this.calle = calle;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="id_municipio", nullable=false)
    public Municipio getMunicipio() {
        return this.municipio;
    }
    
    public void setMunicipio(Municipio municipio) {
        this.municipio = municipio;
    }




}

