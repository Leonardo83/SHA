package turno.teste;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import turno.bean.TurnoBean;
import turno.dao.TurnoDaoImpl;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteListagem {

    public static void main(String[] args) {
        TurnoDaoImpl td = new TurnoDaoImpl();

        try {
            ArrayList<TurnoBean> turnos = (ArrayList<TurnoBean>) td.listar();
            for (TurnoBean turno : turnos) {
                System.out.println("Turno: " + turno.getTipoTurno());
                System.out.println("------------------");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
