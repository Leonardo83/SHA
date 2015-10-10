/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplina.dao;

import disciplina.bean.DisciplinaBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class DisciplinaDaoImpl extends BaseDaoImpl<DisciplinaBean> implements DisciplinaDao{

    public DisciplinaDaoImpl() {
        super(DisciplinaBean.class);
    }
    
}
