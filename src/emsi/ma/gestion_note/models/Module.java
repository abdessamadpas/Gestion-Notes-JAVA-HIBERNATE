package emsi.ma.gestion_note.models;
// Generated Jan 10, 2023 1:29:41 PM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Module generated by hbm2java
 */
@Entity
@Table(name="module"
    ,catalog="gestion_note_emsi"
)
public class Module  implements java.io.Serializable {


     private int idM;
     private String libele;
     private Set<Examen> examens = new HashSet<Examen>(0);

    public Module() {
    }

	
    public Module(int idM, String libele) {
        this.idM = idM;
        this.libele = libele;
    }
    public Module(int idM, String libele, Set<Examen> examens) {
       this.idM = idM;
       this.libele = libele;
       this.examens = examens;
    }
   
     @Id 

    
    @Column(name="idM", unique=true, nullable=false)
    public int getIdM() {
        return this.idM;
    }
    
    public void setIdM(int idM) {
        this.idM = idM;
    }

    
    @Column(name="libele", nullable=false, length=25)
    public String getLibele() {
        return this.libele;
    }
    
    public void setLibele(String libele) {
        this.libele = libele;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="module")
    public Set<Examen> getExamens() {
        return this.examens;
    }
    
    public void setExamens(Set<Examen> examens) {
        this.examens = examens;
    }

    @Override
    public String toString() {
        return  libele ;
    }




}


