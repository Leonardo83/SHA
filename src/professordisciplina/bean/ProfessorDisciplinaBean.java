/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package professordisciplina.bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;
 
/**
 *
 * @author KERNEL
 * 
 */
@Entity
@Table(name = "professor_disciplina")
public class ProfessorDisciplinaBean implements Serializable {
    
    @EmbeddedId
    private ProfessorDisciplinaPK professordisciplina;

    public ProfessorDisciplinaPK getProfessordisciplina() {
        return professordisciplina;
    }

    public void setProfessordisciplina(ProfessorDisciplinaPK professordisciplina) {
        this.professordisciplina = professordisciplina;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + Objects.hashCode(this.professordisciplina);
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
        final ProfessorDisciplinaBean other = (ProfessorDisciplinaBean) obj;
        if (!Objects.equals(this.professordisciplina, other.professordisciplina)) {
            return false;
        }
        return true;
    }

    

}
