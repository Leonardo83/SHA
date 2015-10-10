package professor.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import professor.bean.ProfessorBean;
import professor.dao.ProfessorDao;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteAlterar {
    public static void main(String[] args) {
        ProfessorBean pb = new ProfessorBean();
        
        pb.setId(1);
        pb.setMatricula("12345");
        pb.setNome("Fulanildo");
        pb.setSexo("M");
        pb.setCargo("Professor");
        
        ProfessorDao pd = new ProfessorDao();
        
        try {
            pd.alterar(pb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteAlterar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
