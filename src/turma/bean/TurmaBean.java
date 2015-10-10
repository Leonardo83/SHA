/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma.bean;

import turno.bean.TurnoBean;
import modulo.bean.ModuloBean;
import curso.bean.CursoBean;

/**
 *
 * @author GRUPO KERNEL
 */
public class TurmaBean {
    private Integer id;
    private String codigo;
    private ModuloBean modulo;
    private TurnoBean turno;
    private CursoBean curso;

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
     * @return the codigo
     */
    public String getCodigo() {
        return codigo;
    }

    /**
     * @param codigo the codigo to set
     */
    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    /**
     * @return the modulo
     */
    public ModuloBean getModulo() {
        return modulo;
    }

    /**
     * @param modulo the modulo to set
     */
    public void setModulo(ModuloBean modulo) {
        this.modulo = modulo;
    }

    /**
     * @return the turno
     */
    public TurnoBean getTurno() {
        return turno;
    }

    /**
     * @param turno the turno to set
     */
    public void setTurno(TurnoBean turno) {
        this.turno = turno;
    }

    /**
     * @return the curso
     */
    public CursoBean getCurso() {
        return curso;
    }

    /**
     * @param curso the curso to set
     */
    public void setCurso(CursoBean curso) {
        this.curso = curso;
    }
}
