/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.teste;

import curso.bean.CursoBean;
import curso.dao.CursoDaoImpl;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteAlteracao {
    
    public static void main(String[] args) {
        CursoBean cb = new CursoBean();
        
        cb.setId(2);
        cb.setNome("Medicina");
        cb.setSigla("MED");
        cb.setCargaHoraria(3500);        
        
        CursoDaoImpl cd = new CursoDaoImpl();
       
        try {
            cd.alterar(cb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteAlteracao.class.getName()).log(Level.SEVERE, null, ex);
        }        
    }
    
}
