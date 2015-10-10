/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.bean;

import gradeHoraria.bean.GradeHorariaBean;
import funcionario.FuncionarioBean;
import disciplina.bean.DisciplinaBean;
import java.util.ArrayList;
import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "professores")
@PrimaryKeyJoinColumn(name = "funcionario_id")
public class ProfessorBean extends FuncionarioBean {

    private ArrayList<DisciplinaBean> listaDisciplinas;
    private ArrayList<GradeHorariaBean> listaGradesHorarias;

    /**
     * @return the listaDisciplinas
     */
    public ArrayList<DisciplinaBean> getListaDisciplinas() {
        return listaDisciplinas;
    }

    /**
     * @param listaDisciplinas the listaDisciplinas to set
     */
    public void setListaDisciplinas(ArrayList<DisciplinaBean> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

    /**
     * @return the listaGradesHorarias
     */
    public ArrayList<GradeHorariaBean> getListaGradesHorarias() {
        return listaGradesHorarias;
    }

    /**
     * @param listaGradesHorarias the listaGradesHorarias to set
     */
    public void setListaGradesHorarias(ArrayList<GradeHorariaBean> listaGradesHorarias) {
        this.listaGradesHorarias = listaGradesHorarias;
    }

 

}
