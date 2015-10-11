/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplina.teste;

import disciplina.bean.DisciplinaBean;
import disciplina.dao.DisciplinaDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteAlteracao {
    
    public static void main(String[] args) {
        DisciplinaBean db = new DisciplinaBean();
        
        db.setId(5);
        db.setNome("ANÁLISE E PROJETO DE SISTEMA I");
        db.setSigla("APSI");
        db.setCargaHoraria(80);        
        
        DisciplinaDaoImpl dd = new DisciplinaDaoImpl();
       
        try {
            dd.alterar(db);
        } catch (DaoException ex) {
            Logger.getLogger(TesteAlteracao.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}
