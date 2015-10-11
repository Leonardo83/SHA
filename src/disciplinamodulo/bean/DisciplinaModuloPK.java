/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplinamodulo.bean;

import disciplina.bean.DisciplinaBean;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Embeddable;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import modulo.bean.ModuloBean;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author KERNEL
 */
@Embeddable
public class DisciplinaModuloPK implements Serializable {

    @ManyToOne
    @JoinColumn(name = "disciplina_id")
    @Cascade(CascadeType.REMOVE)
    private DisciplinaBean disciplina;

    @ManyToOne
    @JoinColumn(name = "modulo_id")
    @Cascade(CascadeType.REMOVE)
    private ModuloBean modulo;

    public DisciplinaBean getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(DisciplinaBean disciplina) {
        this.disciplina = disciplina;
    }

    public ModuloBean getModulo() {
        return modulo;
    }

    public void setModulo(ModuloBean modulo) {
        this.modulo = modulo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 83 * hash + Objects.hashCode(this.disciplina);
        hash = 83 * hash + Objects.hashCode(this.modulo);
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
        final DisciplinaModuloPK other = (DisciplinaModuloPK) obj;
        if (!Objects.equals(this.disciplina, other.disciplina)) {
            return false;
        }
        if (!Objects.equals(this.modulo, other.modulo)) {
            return false;
        }
        return true;
    }

   
    
}
