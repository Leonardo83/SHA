/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package professordisciplina.dao;


import professordisciplina.bean.ProfessorDisciplinaBean;
import util.BaseDaoImpl;

/**
 *
 * @author giocondo
 */
public class ProfessorDisciplinaDaoImpl extends BaseDaoImpl<ProfessorDisciplinaBean> implements ProfessorDisciplinaDao{

    public ProfessorDisciplinaDaoImpl() {
        super(ProfessorDisciplinaBean.class);
    }


}
