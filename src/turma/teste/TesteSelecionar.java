/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma.teste;

import disciplina.bean.DisciplinaBean;
import disciplina.dao.DisciplinaDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author SGA
 */
public class TesteSelecionar {
    public static void main(String[] args) {
        DisciplinaDaoImpl ddi = new DisciplinaDaoImpl();
        
        try {
            DisciplinaBean db = ddi.selecionar(2);
            System.out.println(db.getNome());
        } catch (DaoException ex) {
            Logger.getLogger(TesteSelecionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
