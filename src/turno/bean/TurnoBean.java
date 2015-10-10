/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turno.bean;

/**
 *
 * @author GRUPO KERNEL
 */
public class TurnoBean {
    private Integer id;
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
}
