/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfil.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import perfil.dao.PerfilDao;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteExcluir {
    public static void main(String[] args) {
        PerfilDao pd = new PerfilDao();
        
        try {
            pd.excluir(4);
        } catch (DaoException ex) {
            Logger.getLogger(TesteExcluir.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
