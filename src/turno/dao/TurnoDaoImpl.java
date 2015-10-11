/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turno.dao;

import turno.bean.TurnoBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class TurnoDaoImpl extends BaseDaoImpl<TurnoBean> implements TurnoDao{

    public TurnoDaoImpl() {
        super(TurnoBean.class);
    }
    
}
