/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horariosDia.dao;

import horariosDia.bean.HorariosDiaBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class HorariosDiaDaoImpl extends BaseDaoImpl<HorariosDiaBean> implements HorariosDiaDao{

    public HorariosDiaDaoImpl() {
        super(HorariosDiaBean.class);
    }
    
}
