package turno.teste;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import turno.bean.TurnoBean;
import turno.dao.TurnoDao;
import util.DaoException;


/**
 *
 * @author GRUPO KERNEL
 */
public class TesteInsercao {

    public static void main(String[] args) throws DaoException {
        
        TurnoBean tb = new TurnoBean();
        TurnoDao td = new TurnoDao();
        
        tb.setTipoTurno("QUALQUER");
        
         try {
            if (td.inserir(tb) != null) {
                    JOptionPane.showMessageDialog(null, "Turno inserido com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro de inserção!");
                }
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsercao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
