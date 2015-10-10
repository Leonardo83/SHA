package perfil.bean;

/**
 *
 * @author GRUPO KERNEL
 */
public class PerfilBean {
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
