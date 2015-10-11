/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package disciplinahorariosdia.bean;

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
@Table(name = "disciplina_horarios_dia")
public class DisciplinaHorariosDiaBean implements Serializable {
    
    @EmbeddedId
    private DisciplinaHorariosDiaPK disciplinahorariosdia;

    public DisciplinaHorariosDiaPK getHorariosdiadisciplina() {
        return disciplinahorariosdia;
    }

    public void setDisciplinahorariosdia(DisciplinaHorariosDiaPK horariosdiadisciplina) {
        this.disciplinahorariosdia = horariosdiadisciplina;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 97 * hash + Objects.hashCode(this.disciplinahorariosdia);
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
        final DisciplinaHorariosDiaBean other = (DisciplinaHorariosDiaBean) obj;
        if (!Objects.equals(this.disciplinahorariosdia, other.disciplinahorariosdia)) {
            return false;
        }
        return true;
    }

    
    
}
