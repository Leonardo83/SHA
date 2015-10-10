package disciplina.teste;

import disciplina.bean.DisciplinaBean;
import disciplina.dao.DisciplinaDao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteListagem {
    
    public static void main(String[] args) {
        DisciplinaDao dd = new DisciplinaDao();
                
        try {
            ArrayList<DisciplinaBean> disciplinas = (ArrayList<DisciplinaBean>) dd.listar();
            for (DisciplinaBean disciplina : disciplinas) {
                System.out.println("Nome: " + disciplina.getNome() + " Sigla: " + 
                        disciplina.getSigla() + " Carga Horaria: " + disciplina.getCargaHoraria());                
                System.out.println("------------------");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
