package disciplina.teste;

import disciplina.bean.DisciplinaBean;
import disciplina.dao.DisciplinaDao;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteSelecionar {
    public static void main(String[] args) {
        DisciplinaDao dd = new DisciplinaDao();
        
        try {
            DisciplinaBean db = (DisciplinaBean) dd.selecionar(2);
            
            System.out.println(db.getNome());
            System.out.println(db.getSigla());
            System.out.println(db.getCargaHoraria());
        } catch (DaoException ex) {
            Logger.getLogger(TesteSelecionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
