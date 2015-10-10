/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professordisciplina.bean;

import disciplina.bean.DisciplinaBean;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import professor.bean.ProfessorBean;

/**
 *
 * @author KERNEL
 */
@Embeddable
public class ProfessorDisciplinaPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "professor_id")
    private ProfessorBean professor;

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    private DisciplinaBean disciplina;

    public ProfessorBean getProfessor() {
        return professor;
    }

    public void setProfessor(ProfessorBean professor) {
        this.professor = professor;
    }

    public DisciplinaBean getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinaBean disciplina) {
        this.disciplina = disciplina;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.professor);
        hash = 83 * hash + Objects.hashCode(this.disciplina);
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
        final ProfessorDisciplinaPK other = (ProfessorDisciplinaPK) obj;
        if (!Objects.equals(this.professor, other.professor)) {
            return false;
        }
        if (!Objects.equals(this.disciplina, other.disciplina)) {
            return false;
        }
        return true;
    }

    
}
