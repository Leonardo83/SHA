/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horariosDia.bean;

import gradeHoraria.bean.GradeHorariaBean;
import disciplina.bean.DisciplinaBean;
import java.util.ArrayList;

/**
 *
 * @author GRUPO KERNEL
 */
public class HorariosDiaBean {
    private Integer id;
    private String diaSemana;
    private ArrayList<DisciplinaBean> listaDisciplinas;
    private GradeHorariaBean gradeHoraria;

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
     * @return the diaSemana
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * @param diaSemana the diaSemana to set
     */
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    /**
     * @return the listaDisciplinas
     */
    public ArrayList<DisciplinaBean> getListaDisciplinas() {
        return listaDisciplinas;
    }

    /**
     * @param listaDisciplinas the listaDisciplinas to set
     */
    public void setListaDisciplinas(DisciplinaBean disciplinas) {
        this.listaDisciplinas.add(disciplinas);
    }

    /**
     * @return the gradeHoraria
     */
    public GradeHorariaBean getGradeHoraria() {
        return gradeHoraria;
    }

    /**
     * @param gradeHoraria the gradeHoraria to set
     */
    public void setGradeHoraria(GradeHorariaBean gradeHoraria) {
        this.gradeHoraria = gradeHoraria;
    }
}
