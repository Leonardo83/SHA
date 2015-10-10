package funcionario;

import java.io.Serializable;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import telefone.bean.TelefoneBean;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "funcionarios")
@Inheritance(strategy = InheritanceType.JOINED)
public abstract class FuncionarioBean implements Serializable {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_funcionarios", sequenceName = "funcionarios_id_seq")
    @GeneratedValue(generator = "seq_funcionarios")
    private Integer id;
    
    @Column(name = "matricula")
    private String matricula;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "sexo")
    private String sexo;
    
    @Column(name = "cargo")
    private String cargo;
    
    @Column(name = "funcao")
    private String funcao;
    
    @Column(name = "ativo")
    private boolean ativo;
    
    @OneToMany(mappedBy = "funcionario")
    @Cascade(CascadeType.ALL)
    private List<TelefoneBean> telefones;
    

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
     * @return the matricula
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * @param matricula the matricula to set
     */
    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    /**
     * @return the nome
     */
    public String getNome() {
        return nome;
    }

    /**
     * @param nome the nome to set
     */
    public void setNome(String nome) {
        this.nome = nome;
    }

    /**
     * @return the sexo
     */
    public String getSexo() {
        return sexo;
    }

    /**
     * @param sexo the sexo to set
     */
    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    /**
     * @return the cargo
     */
    public String getCargo() {
        return cargo;
    }

    /**
     * @param cargo the cargo to set
     */
    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    /**
     * @return the ativo
     */
    public boolean isAtivo() {
        return ativo;
    }

    /**
     * @param ativo the ativo to set
     */
    public void setAtivo(boolean ativo) {
        this.ativo = ativo;
    }

    public String toString() {
        return nome;
    }

    /**
     * @return the funcao
     */
    public String getFuncao() {
        return funcao;
    }

    /**
     * @param funcao the funcao to set
     */
    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 73 * hash + Objects.hashCode(this.id);
        hash = 73 * hash + Objects.hashCode(this.matricula);
        hash = 73 * hash + Objects.hashCode(this.nome);
        hash = 73 * hash + Objects.hashCode(this.sexo);
        hash = 73 * hash + Objects.hashCode(this.cargo);
        hash = 73 * hash + Objects.hashCode(this.funcao);
        hash = 73 * hash + (this.ativo ? 1 : 0);
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
        final FuncionarioBean other = (FuncionarioBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.matricula, other.matricula)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.sexo, other.sexo)) {
            return false;
        }
        if (!Objects.equals(this.cargo, other.cargo)) {
            return false;
        }
        if (!Objects.equals(this.funcao, other.funcao)) {
            return false;
        }
        if (this.ativo != other.ativo) {
            return false;
        }
        return true;
    }

    /**
     * @return the telefones
     */
    public List<TelefoneBean> getTelefones() {
        return telefones;
    }

    /**
     * @param telefones the telefones to set
     */
    public void setTelefones(List<TelefoneBean> telefones) {
        this.telefones = telefones;
    }
    
}
