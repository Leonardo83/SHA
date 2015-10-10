package turno.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import turno.bean.TurnoBean;
import turno.dao.TurnoDao;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteAlteracao {
    
    public static void main(String[] args) {
        TurnoBean tb = new TurnoBean();
        
        tb.setId(4);
        tb.setTipoTurno("MADRUGADA");
        
        TurnoDao td = new TurnoDao();
       
        try {
            td.alterar(tb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteAlteracao.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}
