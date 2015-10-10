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
import professor.bean.ProfessorBean;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteInsercao {

    public static void main(String[] args) {
        ProfessorBean pf = new ProfessorBean();
        pf.setId(8);

        CursoBean cb = new CursoBean();

        cb.setCoordenador(pf);
        cb.setCodigo("1");
        cb.setNome("Tecnologo Em Ánalise de Sistemas");
        cb.setSigla("TADS");
        cb.setCargaHoraria(3000);

        CursoDaoImpl cd = new CursoDaoImpl();
        try {
            cd.inserir(cb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsercao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
