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
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "professores")
@PrimaryKeyJoinColumn(name = "funcionario_id")
public class ProfessorBean extends FuncionarioBean {

    @OneToMany(mappedBy = "disciplina",targetEntity = DisciplinaBean.class, fetch = FetchType.LAZY)
    @Cascade(CascadeType.ALL)
    private List<DisciplinaBean> listaDisciplinas;
    
    
    private List<GradeHorariaBean> listaGradesHorarias;

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

    /**
     * @return the listaGradesHorarias
     */
    public List<GradeHorariaBean> getListaGradesHorarias() {
        return listaGradesHorarias;
    }

    /**
     * @param listaGradesHorarias the listaGradesHorarias to set
     */
    public void setListaGradesHorarias(List<GradeHorariaBean> listaGradesHorarias) {
        this.listaGradesHorarias = listaGradesHorarias;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 89 * hash + Objects.hashCode(this.listaDisciplinas);
        hash = 89 * hash + Objects.hashCode(this.listaGradesHorarias);
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
        final ProfessorBean other = (ProfessorBean) obj;
        if (!Objects.equals(this.listaDisciplinas, other.listaDisciplinas)) {
            return false;
        }
        if (!Objects.equals(this.listaGradesHorarias, other.listaGradesHorarias)) {
            return false;
        }
        return true;
    }

 

}
