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
 * @author SGA
 */
public class TesteSelecionar {
    public static void main(String[] args) {
        CursoDaoImpl cd = new CursoDaoImpl();
        
        try {
            CursoBean cb = cd.selecionar(2);
            System.out.println(cb.getNome());
        } catch (DaoException ex) {
            Logger.getLogger(TesteSelecionar.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
