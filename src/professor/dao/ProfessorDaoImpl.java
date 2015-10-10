/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.dao;

import professor.bean.ProfessorBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class ProfessorDaoImpl extends BaseDaoImpl<ProfessorBean> implements ProfessorDao{

    public ProfessorDaoImpl() {
        super(ProfessorBean.class);
    }
    
}
