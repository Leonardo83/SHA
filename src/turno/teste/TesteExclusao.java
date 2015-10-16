package turno.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import turno.bean.TurnoBean;
import turno.dao.TurnoDaoImpl;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteExclusao {

    public static void main(String[] args) {
        TurnoBean tb = new TurnoBean();
        tb.setId(3);
        
        TurnoDaoImpl td = new TurnoDaoImpl();

        try {
            if (td.excluir(tb)) {
                JOptionPane.showMessageDialog(null, "Turno excluido com sucesso!");
            } else {
                JOptionPane.showMessageDialog(null, "Erro de exclusão!");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteExclusao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
