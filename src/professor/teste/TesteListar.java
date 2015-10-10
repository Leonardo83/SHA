package professor.teste;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import perfil.bean.PerfilBean;
import professor.bean.ProfessorBean;
import professor.dao.ProfessorDao;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteListar {
    public static void main(String[] args) {
              
        ProfessorDao pd = new ProfessorDao();
                
        try {
            ArrayList<ProfessorBean> professores = (ArrayList<ProfessorBean>) pd.listar();
            for (ProfessorBean professor : professores) {
                System.out.println(professor.getId());
                System.out.println(professor.getNome());
                System.out.println(professor.getMatricula());
                System.out.println(professor.getSexo());
                System.out.println(professor.getCargo());
                System.out.println("------------------");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
    }
}
