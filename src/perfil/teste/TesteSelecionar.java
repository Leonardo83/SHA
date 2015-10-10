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
public class TesteSelecionar {
    public static void main(String[] args) {
        PerfilDao pd = new PerfilDao();
        
        try {
            PerfilBean pb = (PerfilBean) pd.selecionar(1);
            
            System.out.println(pb.getId());
            System.out.println(pb.getTipoPerfil());
        } catch (DaoException ex) {
            Logger.getLogger(TesteSelecionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
