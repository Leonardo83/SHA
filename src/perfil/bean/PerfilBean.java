package perfil.bean;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "perfis")
public class PerfilBean implements Serializable{
    
    private Integer id;
    private String tipoPerfil;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the tipoPerfil
     */
    public String getTipoPerfil() {
        return tipoPerfil;
    }

    /**
     * @param tipoPerfil the tipoPerfil to set
     */
    public void setTipoPerfil(String tipoPerfil) {
        this.tipoPerfil = tipoPerfil;
    }
    
    public String toString() {
        return tipoPerfil;
    }
}
