/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma.bean;

import turno.bean.TurnoBean;
import modulo.bean.ModuloBean;
import curso.bean.CursoBean;
import java.io.Serializable;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "turmas")
public class TurmaBean implements Serializable {

    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_turmas", sequenceName = "turmas_id_seq")
    @GeneratedValue(generator = "seq_turmas")
    private Integer id;

    @Column(name = "codigo")
    private String codigo;

    @ManyToOne
    @JoinColumn(name = "modulo_id")
    private ModuloBean modulo;

    @ManyToOne
    @JoinColumn(name = "turno_id")
    private TurnoBean turno;

    @ManyToOne
    @JoinColumn(name = "curso_id")
    private CursoBean curso;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public ModuloBean getModulo() {
        return modulo;
    }

    public void setModulo(ModuloBean modulo) {
        this.modulo = modulo;
    }

    public TurnoBean getTurno() {
        return turno;
    }

    public void setTurno(TurnoBean turno) {
        this.turno = turno;
    }

    public CursoBean getCurso() {
        return curso;
    }

    public void setCurso(CursoBean curso) {
        this.curso = curso;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 23 * hash + Objects.hashCode(this.id);
        hash = 23 * hash + Objects.hashCode(this.codigo);
        hash = 23 * hash + Objects.hashCode(this.modulo);
        hash = 23 * hash + Objects.hashCode(this.turno);
        hash = 23 * hash + Objects.hashCode(this.curso);
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
        final TurmaBean other = (TurmaBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.codigo, other.codigo)) {
            return false;
        }
        if (!Objects.equals(this.modulo, other.modulo)) {
            return false;
        }
        if (!Objects.equals(this.turno, other.turno)) {
            return false;
        }
        if (!Objects.equals(this.curso, other.curso)) {
            return false;
        }
        return true;
    }

   
}
