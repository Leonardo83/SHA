/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import professor.bean.ProfessorBean;
import professor.dao.ProfessorDaoImpl;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesterExcluir {

    public static void main(String[] args) {

        ProfessorBean pb = new ProfessorBean();
        pb.setId(1);

        ProfessorDaoImpl pd = new ProfessorDaoImpl();

        try {
            pd.excluir(pb);
        } catch (DaoException ex) {
            Logger.getLogger(TesterExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
