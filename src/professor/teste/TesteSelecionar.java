package professor.teste;

import java.util.ArrayList;
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
public class TesteSelecionar {

    public static void main(String[] args) {
        ProfessorDao pd = new ProfessorDao();

        try {
            ProfessorBean professor = (ProfessorBean) pd.selecionar(1);
            System.out.println(professor.getId());
            System.out.println(professor.getNome());
            System.out.println(professor.getMatricula());
            System.out.println(professor.getSexo());
            System.out.println(professor.getCargo());
            System.out.println("------------------");

        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
