/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package telefone.dao;


import telefone.bean.TelefoneBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class TelefoneDaoImpl extends BaseDaoImpl<TelefoneBean> implements TelefoneDao{

    public TelefoneDaoImpl() {
        super(TelefoneBean.class);
    }
    
}
