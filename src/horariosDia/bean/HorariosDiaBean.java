/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horariosDia.bean;

import gradeHoraria.bean.GradeHorariaBean;
import disciplina.bean.DisciplinaBean;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Objects;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;

/**
 *
 * @author GRUPO KERNEL
 */
@Entity
@Table(name = "horarios_dia")
public class HorariosDiaBean implements Serializable {
    @Id
    @Column(name = "id")
    @SequenceGenerator(name = "seq_horarios_dia", sequenceName = "horarios_dia_id_seq")
    @GeneratedValue(generator = "seq_horarios_dia")
    private Integer id;
    
    @Column(name = "diasemana")
    private String diaSemana;
    
    @OneToMany(mappedBy = "disciplina", targetEntity = DisciplinaBean.class, fetch = FetchType.LAZY )
    @Cascade(CascadeType.ALL)
    private List<DisciplinaBean> listaDisciplinas;
    
    
    private GradeHorariaBean gradeHoraria;

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
     * @return the diaSemana
     */
    public String getDiaSemana() {
        return diaSemana;
    }

    /**
     * @param diaSemana the diaSemana to set
     */
    public void setDiaSemana(String diaSemana) {
        this.diaSemana = diaSemana;
    }

    public List<DisciplinaBean> getListaDisciplinas() {
        return listaDisciplinas;
    }

    public void setListaDisciplinas(List<DisciplinaBean> listaDisciplinas) {
        this.listaDisciplinas = listaDisciplinas;
    }

  
    /**
     * @return the gradeHoraria
     */
    public GradeHorariaBean getGradeHoraria() {
        return gradeHoraria;
    }

    /**
     * @param gradeHoraria the gradeHoraria to set
     */
    public void setGradeHoraria(GradeHorariaBean gradeHoraria) {
        this.gradeHoraria = gradeHoraria;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 83 * hash + Objects.hashCode(this.id);
        hash = 83 * hash + Objects.hashCode(this.diaSemana);
        hash = 83 * hash + Objects.hashCode(this.listaDisciplinas);
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
        final HorariosDiaBean other = (HorariosDiaBean) obj;
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.diaSemana, other.diaSemana)) {
            return false;
        }
        if (!Objects.equals(this.listaDisciplinas, other.listaDisciplinas)) {
            return false;
        }
        return true;
    }
    
}
