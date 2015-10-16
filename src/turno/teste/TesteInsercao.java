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
public class TesteInsercao {

    public static void main(String[] args) throws DaoException {
        
        TurnoBean tb = new TurnoBean();
        TurnoDaoImpl td = new TurnoDaoImpl();
        
        tb.setTipoTurno("OUTROS");
        
        
         try {
             td.inserir(tb);  
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsercao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
