/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeHoraria.bean;

import java.util.ArrayList;
import modulo.bean.ModuloBean;
import professor.bean.ProfessorBean;
import turma.bean.TurmaBean;
import turno.bean.TurnoBean;

/**
 *
 * @author GRUPO KERNEL
 */
public class GradeHorariaBean {
    private Integer id;
    private TurmaBean turma;
    private ArrayList<ProfessorBean> listaProfessores;
    private ModuloBean modulo;
    private TurnoBean turno;

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
     * @return the turma
     */
    public TurmaBean getTurma() {
        return turma;
    }

    /**
     * @param turma the turma to set
     */
    public void setTurma(TurmaBean turma) {
        this.turma = turma;
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
     * @return the modulo
     */
    public ModuloBean getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(ModuloBean modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the turno
     */
    public TurnoBean getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(TurnoBean turno) {
        this.turno = turno;
    }
}
