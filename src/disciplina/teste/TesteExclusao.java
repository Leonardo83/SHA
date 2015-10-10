/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplina.teste;

import disciplina.dao.DisciplinaDao;
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
        DisciplinaDao dd = new DisciplinaDao();

        try {
            if (dd.excluir(5)) {
                JOptionPane.showMessageDialog(null, "Discipina excluida com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro de exclusão!");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteExclusao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
