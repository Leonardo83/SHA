/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo.bean;

import curso.bean.CursoBean;
import disciplina.bean.DisciplinaBean;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "modulos")
public class ModuloBean implements Serializable{
    @Id
    @Column(name ="id")
    @SequenceGenerator(name = "seq_modulos", sequenceName = "modulos_id_seq")
    @GeneratedValue(generator = "seq_modulos")
    private Integer id;
    
    @Column(name ="nome")
    private String nome;
    
    @Column(name ="cargahorariamodulo")
    private Integer cargaHorariaModulo;
    
    @ManyToOne
    @JoinColumn(name ="curso_id")
    @Cascade(CascadeType.REMOVE)
    private CursoBean curso;    
    
    @OneToMany(mappedBy = "disciplina", targetEntity = DisciplinaBean.class, fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private List<DisciplinaBean> listaDisciplinas;

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
     * @return the cargaHorariaModulo
     */
    public Integer getCargaHorariaModulo() {
        return cargaHorariaModulo;
    }

    /**
     * @param cargaHorariaModulo the cargaHorariaModulo to set
     */
    public void setCargaHorariaModulo(Integer cargaHorariaModulo) {
        this.cargaHorariaModulo = cargaHorariaModulo;
    }

    /**
     * @return the curso
     */
    public CursoBean getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(CursoBean curso) {
        this.curso = curso;
    }

    /**
     * @return the listaDisciplinas
     */
    public List<DisciplinaBean> getListaDisciplinas() {
        return listaDisciplinas;
    }

    /**
     * @param listaDisciplinas the listaDisciplinas to set
     */
    public void setListaDisciplinas(List<DisciplinaBean> listaDisciplinas) {
      this.listaDisciplinas = listaDisciplinas;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.id);
        hash = 89 * hash + Objects.hashCode(this.nome);
        hash = 89 * hash + Objects.hashCode(this.cargaHorariaModulo);
        hash = 89 * hash + Objects.hashCode(this.curso);
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
        final ModuloBean other = (ModuloBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        if (!Objects.equals(this.cargaHorariaModulo, other.cargaHorariaModulo)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        return true;
    }

    
   }
