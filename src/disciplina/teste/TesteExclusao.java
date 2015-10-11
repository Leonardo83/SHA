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
import javax.swing.JOptionPane;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteExclusao {

    public static void main(String[] args) {
        DisciplinaBean db = new DisciplinaBean();
        db.setId(1);

        DisciplinaDaoImpl ddi = new DisciplinaDaoImpl();

        try {
            if (ddi.excluir(db)) {
                JOptionPane.showMessageDialog(null, "Discipina excluida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro de exclusão!");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteExclusao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
