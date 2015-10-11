/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplina.bean;

import horariosDia.bean.HorariosDiaBean;
import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import modulo.bean.ModuloBean;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import professor.bean.ProfessorBean;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "disciplinas")
public class DisciplinaBean implements Serializable {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_disciplinas", sequenceName = "disciplinas_id_seq")
    @GeneratedValue(generator = "seq_disciplinas")
    private Integer id;
    
    @Column(name = "nome")
    private String nome;
    
    @Column(name = "sigla")
    private String sigla;
    
    @Column(name = "carga_horaria")
    private Integer cargaHoraria;
    
    @OneToMany(mappedBy = "professor",targetEntity = ProfessorBean.class,fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private List<ProfessorBean> listaProfessores;
    
    
    @OneToMany(mappedBy = "modulo")
    @Cascade(CascadeType.ALL)
    private List<ModuloBean> listaModulos;
    
    
    @OneToMany(mappedBy = "horariosdia")
    @Cascade(CascadeType.ALL)
    private List<HorariosDiaBean> listaHorariosDia;

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
     * @return the sigla
     */
    public String getSigla() {
        return sigla;
    }

    /**
     * @param sigla the sigla to set
     */
    public void setSigla(String sigla) {
        this.sigla = sigla;
    }

    public List<ProfessorBean> getListaProfessores() {
        return listaProfessores;
    }

    public void setListaProfessores(List<ProfessorBean> listaProfessores) {
        this.listaProfessores = listaProfessores;
    }

    public List<ModuloBean> getListaModulos() {
        return listaModulos;
    }

    public void setListaModulos(List<ModuloBean> listaModulos) {
        this.listaModulos = listaModulos;
    }

    public List<HorariosDiaBean> getListaHorariosDia() {
        return listaHorariosDia;
    }

    public void setListaHorariosDia(List<HorariosDiaBean> listaHorariosDia) {
        this.listaHorariosDia = listaHorariosDia;
    }

  
    /**
     * @return the cargaHoraria
     */
    public Integer getCargaHoraria() {
        return cargaHoraria;
    }

    /**
     * @param cargaHoraria the cargaHoraria to set
     */
    public void setCargaHoraria(Integer cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }
}
