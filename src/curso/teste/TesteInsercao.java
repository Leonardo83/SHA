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
import modulo.bean.ModuloBean;
import professor.bean.ProfessorBean;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteInsercao {

    public static void main(String[] args) {
        ProfessorBean pf = new ProfessorBean();
        pf.setId(1);

        CursoBean cb = new CursoBean();

        cb.setCoordenador(pf);
        cb.setCodigo("1");
        cb.setNome("Tecnologo Em Ánalise de Sistemas");
        cb.setSigla("TADS");
        cb.setCargaHoraria(3000);

        ModuloBean mb = new ModuloBean();
        mb.setNome("I");
        mb.setCargaHorariaModulo(40);
        mb.setCurso(cb);

        ArrayList<ModuloBean> modulos = new ArrayList<>();
        modulos.add(mb);

        cb.setListaModulos(modulos);
        
        CursoDaoImpl cd = new CursoDaoImpl();
        try {
            cd.inserir(cb);
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsercao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
