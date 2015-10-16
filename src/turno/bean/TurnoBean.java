/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turno.bean;

import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "turnos")
public class TurnoBean implements Serializable {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_turnos", sequenceName = "turnos_id_seq")
    @GeneratedValue(generator = "seq_turnos")
    private Integer id;
    
    @Column(name = "tipo_turno")
    private String tipoTurno;

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
     * @return the tipoTurno
     */
    public String getTipoTurno() {
        return tipoTurno;
    }

    /**
     * @param tipoTurno the tipoTurno to set
     */
    public void setTipoTurno(String tipoTurno) {
        this.tipoTurno = tipoTurno;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + Objects.hashCode(this.id);
        hash = 79 * hash + Objects.hashCode(this.tipoTurno);
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
        final TurnoBean other = (TurnoBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.tipoTurno, other.tipoTurno)) {
            return false;
        }
        return true;
    }
    
}
