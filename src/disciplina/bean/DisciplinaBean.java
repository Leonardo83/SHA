/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplina.bean;

import horariosDia.bean.HorariosDiaBean;
import java.io.Serializable;
import java.util.ArrayList;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import modulo.bean.ModuloBean;
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
    
    
    private ArrayList<ProfessorBean> listaProfessores;
    private ArrayList<ModuloBean> listaModulos;
    private ArrayList<HorariosDiaBean> listaHorariosDia;

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

    /**
     * @return the listaProfessores
     */
    public ArrayList<ProfessorBean> getListaProfessores() {
        return listaProfessores;
    }

    /**
     * @param listaProfessores the listaProfessores to set
     */
    public void setListaProfessores(ProfessorBean professor) {
        this.listaProfessores.add(professor);
    }

    /**
     * @return the listaModulos
     */
    public ArrayList<ModuloBean> getListaModulos() {
        return listaModulos;
    }

    /**
     * @param listaModulos the listaModulos to set
     */
    public void setListaModulos(ModuloBean modulo) {
        this.listaModulos.add(modulo);
    }

    /**
     * @return the listaHorariosDia
     */
    public ArrayList<HorariosDiaBean> getListaHorariosDia() {
        return listaHorariosDia;
    }

    /**
     * @param listaHorariosDia the listaHorariosDia to set
     */
    public void setListaHorariosDia(HorariosDiaBean listaHorariosDia) {
        this.listaHorariosDia.add(listaHorariosDia);
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
