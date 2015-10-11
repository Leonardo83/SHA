/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package disciplinamodulo.dao;


import disciplinamodulo.bean.DisciplinaModuloBean;
import util.BaseDaoImpl;

/**
 *
 * @author GRUPO KERNEL
 */
public class DisciplinaModuloDaoImpl extends BaseDaoImpl<DisciplinaModuloBean> implements DisciplinaModuloDao{

    public DisciplinaModuloDaoImpl() {
        super(DisciplinaModuloBean.class);
    }


}
