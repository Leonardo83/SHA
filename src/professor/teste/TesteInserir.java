package professor.teste;

import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import professor.bean.ProfessorBean;
import professor.dao.ProfessorDaoImpl;
import telefone.bean.TelefoneBean;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteInserir {

    public static void main(String[] args) {
        ProfessorBean pb = new ProfessorBean();

        pb.setMatricula("123789");
        pb.setNome("Fulano");
        pb.setSexo("M");
        pb.setCargo("Professor");

        TelefoneBean telefone = new TelefoneBean();
        telefone.setDdd("95");
        telefone.setNumero("123456789");
        telefone.setFuncionario(pb);
        
        TelefoneBean telefone2 = new TelefoneBean();
        telefone2.setDdd("92");
        telefone2.setNumero("987654321");
        telefone2.setFuncionario(pb);
        
        ArrayList<TelefoneBean> telefones = new ArrayList<>();
        telefones.add(telefone);
        telefones.add(telefone2);

        pb.setTelefones(telefones);

        ProfessorDaoImpl pd = new ProfessorDaoImpl();
        
        try {
            pd.inserir(pb);

        } catch (DaoException ex) {
            Logger.getLogger(TesteInserir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
