/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.teste;

import java.sql.SQLException;
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
public class TesterExcluir {
    public static void main(String[] args) {
        
        ProfessorDao pd = new ProfessorDao();
        
        try {
            pd.excluir(1);
        } catch (DaoException ex) {
            Logger.getLogger(TesterExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
