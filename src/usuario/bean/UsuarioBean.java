package usuario.bean;

import funcionario.FuncionarioBean;
import perfil.bean.PerfilBean;

/**
 *
 * @author GRUPO KERNEL
 */
public class UsuarioBean {
    private Integer id;
    private String usuario;
    private String senha;
    private FuncionarioBean funcionario;
    private PerfilBean perfil;

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
     * @return the usuario
     */
    public String getUsuario() {
        return usuario;
    }

    /**
     * @param usuario the usuario to set
     */
    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    /**
     * @return the senha
     */
    public String getSenha() {
        return senha;
    }

    /**
     * @param senha the senha to set
     */
    public void setSenha(String senha) {
        this.senha = senha;
    }

    /**
     * @return the funcionario
     */
    public FuncionarioBean getFuncionario() {
        return funcionario;
    }

    /**
     * @param funcionario the funcionario to set
     */
    public void setFuncionario(FuncionarioBean funcionario) {
        this.funcionario = funcionario;
    }

    public PerfilBean getPerfil() {
        return perfil;
    }

    public void setPerfil(PerfilBean perfil) {
        this.perfil = perfil;
    }
    
    
}
