/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma.dao;

import turma.bean.TurmaBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class TurmaDaoImpl extends BaseDaoImpl<TurmaBean> implements TurmaDao{

    public TurmaDaoImpl() {
        super(TurmaBean.class);
    }
    
}
