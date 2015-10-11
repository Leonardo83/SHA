/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfil.dao;

import perfil.bean.PerfilBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class PerfilDaoImpl extends BaseDaoImpl<PerfilBean> implements PerfilDao{

    public PerfilDaoImpl() {
        super(PerfilBean.class);
    }
    
}
