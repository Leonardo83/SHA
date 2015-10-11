package turno.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import turno.bean.TurnoBean;
import turno.dao.TurnoDaoImpl;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteSelecionar {
    public static void main(String[] args) {
        TurnoDaoImpl td = new TurnoDaoImpl();
        
        try {
            TurnoBean tb = td.selecionar(1);
            System.out.println(tb.getTipoTurno());
        } catch (DaoException ex) {
            Logger.getLogger(TesteSelecionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
