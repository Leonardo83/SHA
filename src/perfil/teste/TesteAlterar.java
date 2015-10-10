/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfil.teste;

import java.util.logging.Level;
import java.util.logging.Logger;
import perfil.bean.PerfilBean;
import perfil.dao.PerfilDao;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteAlterar {
    public static void main(String[] args) {
        PerfilBean pb = new PerfilBean();
        pb.setId(4);
        pb.setTipoPerfil("User");
        
        
        
        PerfilDao pd = new PerfilDao();
        
        try {
            pd.alterar(pb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsercao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
