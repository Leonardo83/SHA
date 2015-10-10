/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.dao;

import curso.bean.CursoBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class CursoDaoImpl extends BaseDaoImpl<CursoBean> implements CursoDao{

    public CursoDaoImpl() {
        super(CursoBean.class);
    }
    
}
