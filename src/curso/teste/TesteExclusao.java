/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.teste;

import com.sun.javafx.scene.layout.region.Margins;
import curso.bean.CursoBean;
import curso.dao.CursoDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DaoException;

/**
 *
 * @author SGA
 */
public class TesteExclusao {

    public static void main(String[] args) {
        CursoBean cb = new CursoBean();
        
        cb.setId(1);
        
        CursoDaoImpl cd = new CursoDaoImpl();

        try {
            if (cd.excluir(cb)) {
                JOptionPane.showMessageDialog(null, "Curso excluido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro de exclusão!");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteExclusao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
