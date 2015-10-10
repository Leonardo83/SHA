package usuario.bean;

import funcionario.FuncionarioBean;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import perfil.bean.PerfilBean;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "usuarios")
public class UsuarioBean implements Serializable{
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_usuarios", sequenceName = "usuarios_id_seq")
    @GeneratedValue(generator = "seq_usuarios")
    private Integer id;
    private String usuario;
    private String senha;
    
    @OneToOne
    @JoinColumn(name = "funcionario_id")
    @Cascade(CascadeType.REMOVE)
    private FuncionarioBean funcionario;
    
    @ManyToOne
    @JoinColumn(name = "perfil_id")
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.usuario);
        hash = 83 * hash + Objects.hashCode(this.senha);
        hash = 83 * hash + Objects.hashCode(this.funcionario);
        hash = 83 * hash + Objects.hashCode(this.perfil);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final UsuarioBean other = (UsuarioBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.usuario, other.usuario)) {
            return false;
        }
        if (!Objects.equals(this.senha, other.senha)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        if (!Objects.equals(this.perfil, other.perfil)) {
            return false;
        }
        return true;
    }
    
    
}
