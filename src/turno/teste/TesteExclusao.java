package turno.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import turno.dao.TurnoDao;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteExclusao {

    public static void main(String[] args) {
        TurnoDao td = new TurnoDao();

        try {
            if (td.excluir(4)) {
                JOptionPane.showMessageDialog(null, "Turno excluido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro de exclusão!");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteExclusao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
