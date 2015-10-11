/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeHoraria.dao;

import gradeHoraria.bean.GradeHorariaBean;
import util.BaseDaoImpl;

/**
 *
 * @author Kernel
 */
public class GradeHorariaDaoImpl extends BaseDaoImpl<GradeHorariaBean> implements GradeHorariaDao
{

    public GradeHorariaDaoImpl() {
        super(GradeHorariaBean.class);
    }
    
}
