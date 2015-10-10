/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo.dao;

import modulo.bean.ModuloBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class ModuloDaoImpl extends BaseDaoImpl<ModuloBean> implements ModuloDao{

    public ModuloDaoImpl() {
        super(ModuloBean.class);
    }
    
}
