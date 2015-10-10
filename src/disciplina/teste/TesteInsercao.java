package disciplina.teste;
import disciplina.bean.DisciplinaBean;
import disciplina.dao.DisciplinaDao;
import disciplina.dao.DisciplinaDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.DaoException;


/**
 *
 * @author GRUPO KERNEL
 */
public class TesteInsercao {

    public static void main(String[] args) throws DaoException {
        
        DisciplinaBean db = new DisciplinaBean();
        DisciplinaDaoImpl dd = new DisciplinaDaoImpl();
        
        db.setNome("Matemática");
        db.setSigla("MAT"); 
        db.setCargaHoraria(60);
        
         try {
            if (dd.inserir(db) != null) {
                    JOptionPane.showMessageDialog(null, "Disciplina inserida com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(null, "Erro de inserção!");
                }
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsercao.class.getName()).log(Level.SEVERE, null, ex);
        }  
    }
}
