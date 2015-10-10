/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package curso.teste;

import curso.bean.CursoBean;
import curso.dao.CursoDaoImpl;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteListagem {
    
    public static void main(String[] args) {
        CursoDaoImpl cd = new CursoDaoImpl();
                
        try {
            ArrayList<CursoBean> cursos = (ArrayList<CursoBean>) cd.listar();
            cursos.stream().map((curso) -> {
                System.out.println("Código: " + curso.getCodigo() + " Curso: " +
                        curso.getNome() + " " + curso.getSigla());                
                return curso;
            }).forEach((_item) -> {
                System.out.println("------------------");
            });
        } catch (DaoException ex) {
            Logger.getLogger(TesteListagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
