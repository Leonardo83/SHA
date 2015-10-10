/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package professordisciplina.teste;

import disciplina.bean.DisciplinaBean;
import disciplina.dao.DisciplinaDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import professor.bean.ProfessorBean;
import professor.dao.ProfessorDaoImpl;
import professordisciplina.bean.ProfessorDisciplinaBean;
import professordisciplina.bean.ProfessorDisciplinaPK;
import professordisciplina.dao.ProfessorDisciplinaDaoImpl;

import util.DaoException;

/**
 *
 * @author KERNEL
 */
public class TesteInsere {
    
    public static void main(String[] args) {
        ProfessorDisciplinaBean pd = new ProfessorDisciplinaBean();
        ProfessorDisciplinaPK pdk = new ProfessorDisciplinaPK();
        ProfessorBean professor = null;
        DisciplinaBean disciplina = null;
        
        ProfessorDaoImpl professorDao = new ProfessorDaoImpl();
        try {
            professor = professorDao.selecionar(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        DisciplinaDaoImpl disciplinaDao = new DisciplinaDaoImpl();
        try {
            disciplina = disciplinaDao.selecionar(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        pdk.setProfessor(professor);
        pdk.setDisciplina(disciplina);
        
        pd.setProfessordisciplina(pdk);
        
        
        ProfessorDisciplinaDaoImpl pdd = new ProfessorDisciplinaDaoImpl();
        try {
            pdd.inserir(pd);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
