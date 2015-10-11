/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package disciplinamodulo.teste;

import disciplina.bean.DisciplinaBean;
import disciplina.dao.DisciplinaDaoImpl;
import disciplinamodulo.bean.DisciplinaModuloBean;
import disciplinamodulo.dao.DisciplinaModuloDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import modulo.bean.ModuloBean;
import disciplinamodulo.bean.DisciplinaModuloPK;

import util.DaoException;

/**
 *
 * @author KERNEL
 */
public class TesteInsere {
    
    public static void main(String[] args) {
        DisciplinaModuloBean dmb = new DisciplinaModuloBean();
        DisciplinaModuloPK dmk = new DisciplinaModuloPK();
        DisciplinaBean disciplina = null;
        ModuloBean modulo = null;
        
        DisciplinaDaoImpl disciplinaDaoImpl = new DisciplinaDaoImpl();
        try {
            disciplina = disciplinaDaoImpl.selecionar(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        DisciplinaDaoImpl disciplinaDao = new DisciplinaDaoImpl();
        try {
            disciplina = disciplinaDao.selecionar(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        dmk.setDisciplina(disciplina);
        dmk.setModulo(modulo);
        
        dmb.setDisciplinamodulo(dmk);
        
        
        DisciplinaModuloDaoImpl dmdi = new DisciplinaModuloDaoImpl();
        try {
            dmdi.inserir(dmb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
