/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplinamodulo.bean;

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
@Table(name = "disciplinas_em_modulo")
public class DisciplinaModuloBean implements Serializable {

    @EmbeddedId
    private DisciplinaModuloPK disciplinamodulo;

    public DisciplinaModuloPK getDisciplinamodulo() {
        return disciplinamodulo;
    }

    public void setDisciplinamodulo(DisciplinaModuloPK disciplinamodulo) {
        this.disciplinamodulo = disciplinamodulo;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.disciplinamodulo);
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
        final DisciplinaModuloBean other = (DisciplinaModuloBean) obj;
        if (!Objects.equals(this.disciplinamodulo, other.disciplinamodulo)) {
            return false;
        }
        return true;
    }

}
