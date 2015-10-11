/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplinahorariosdia.teste;

import disciplina.bean.DisciplinaBean;
import disciplina.dao.DisciplinaDaoImpl;
import disciplinahorariosdia.bean.DisciplinaHorariosDiaBean;
import disciplinahorariosdia.bean.DisciplinaHorariosDiaPK;
import disciplinahorariosdia.dao.DisciplinaHorariosDiaDaoImpl;
import horariosDia.bean.HorariosDiaBean;
import horariosDia.dao.HorariosDiaDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;

import util.DaoException;

/**
 *
 * @author KERNEL
 */
public class TesteInsere {

    public static void main(String[] args) {
        DisciplinaHorariosDiaBean dhb = new DisciplinaHorariosDiaBean();
        DisciplinaHorariosDiaPK dhk = new DisciplinaHorariosDiaPK();
        DisciplinaBean disciplina = null;
        HorariosDiaBean horario = null;

        DisciplinaDaoImpl disciplinaDao = new DisciplinaDaoImpl();
        try {
            disciplina = disciplinaDao.selecionar(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }

        HorariosDiaDaoImpl horarioDao = new HorariosDiaDaoImpl();
        try {
            horario = horarioDao.selecionar(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }

        dhk.setHorariodia(horario);
        dhk.setDisciplina(disciplina);

        dhb.setDisciplinahorariosdia(dhk); 
        
        DisciplinaHorariosDiaDaoImpl dhdd    = new DisciplinaHorariosDiaDaoImpl();
        try {
            dhdd.inserir(dhb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
