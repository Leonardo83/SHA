/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplinahorariosdia.bean;

import disciplina.bean.DisciplinaBean;
import horariosDia.bean.HorariosDiaBean;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author KERNEL
 */
@Embeddable
public class DisciplinaHorariosDiaPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    @Cascade(CascadeType.REMOVE)
    private DisciplinaBean disciplina;

    @ManyToOne
    @JoinColumn(name = "horario_dia_id")
    @Cascade(CascadeType.REMOVE)
    private HorariosDiaBean horariosdia;

    public DisciplinaBean getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinaBean disciplina) {
        this.disciplina = disciplina;
    }

    public HorariosDiaBean getHorariosdia() {
        return horariosdia;
    }

    public void setHorariodia(HorariosDiaBean horariodia) {
        this.horariosdia = horariodia;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 19 * hash + Objects.hashCode(this.disciplina);
        hash = 19 * hash + Objects.hashCode(this.horariosdia);
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
        final DisciplinaHorariosDiaPK other = (DisciplinaHorariosDiaPK) obj;
        if (!Objects.equals(this.disciplina, other.disciplina)) {
            return false;
        }
        if (!Objects.equals(this.horariosdia, other.horariosdia)) {
            return false;
        }
        return true;
    }

    
}
