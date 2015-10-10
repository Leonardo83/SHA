/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefone.bean;

import funcionario.FuncionarioBean;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "telefones")
public class TelefoneBean implements Serializable{
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_telefones", sequenceName = "telefones_id_seq")
    @GeneratedValue(generator = "seq_telefones")
    private Integer id;
    
    @Column(name = "ddd")
    private String ddd;
    
    @Column(name = "numero")
    private String numero;
    
    @ManyToOne
    @JoinColumn(name = "funcionario_id")
    @Cascade(CascadeType.REMOVE)
    private FuncionarioBean funcionario;

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
     * @return the ddd
     */
    public String getDdd() {
        return ddd;
    }

    /**
     * @param ddd the ddd to set
     */
    public void setDdd(String ddd) {
        this.ddd = ddd;
    }

    /**
     * @return the numero
     */
    public String getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(String numero) {
        this.numero = numero;
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

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.ddd);
        hash = 23 * hash + Objects.hashCode(this.numero);
        hash = 23 * hash + Objects.hashCode(this.funcionario);
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
        final TelefoneBean other = (TelefoneBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.ddd, other.ddd)) {
            return false;
        }
        if (!Objects.equals(this.numero, other.numero)) {
            return false;
        }
        if (!Objects.equals(this.funcionario, other.funcionario)) {
            return false;
        }
        return true;
    }
    
}
