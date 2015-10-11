/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfil.teste;

import perfil.bean.PerfilBean;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import perfil.dao.PerfilDaoImpl;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteListar {
    public static void main(String[] args) {
        PerfilDaoImpl pd = new PerfilDaoImpl();
        
        try {
            ArrayList<PerfilBean> perfis = (ArrayList<PerfilBean>) pd.listar();
            for(PerfilBean pb : perfis) {
                System.out.println(pb.getId());
                System.out.println(pb.getTipoPerfil());
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListar.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
    }
}
