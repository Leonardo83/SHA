/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma.teste;

import curso.bean.CursoBean;
import curso.dao.CursoDaoImpl;
import java.util.ArrayList;
import java.util.List;
import modulo.bean.ModuloBean;
import modulo.dao.ModuloDaoImpl;
import turma.bean.TurmaBean;
import turma.dao.TurmaDaoImpl;
import turno.bean.TurnoBean;
import turno.dao.TurnoDaoImpl;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteListagem {

    public static void main(String[] args) throws DaoException {
        TurmaDaoImpl td = new TurmaDaoImpl();
        
                
        CursoBean cb = new CursoBean();
        TurnoBean tub = new TurnoBean();
        ModuloBean mb = new ModuloBean();

//        CursoDaoImpl cdi = new CursoDaoImpl();
//        TurnoDaoImpl tdi = new TurnoDaoImpl();
//        ModuloDaoImpl mdi = new ModuloDaoImpl();
        
        ArrayList<TurmaBean> turmas = (ArrayList<TurmaBean>) td.listar();
        for (TurmaBean tb : turmas) {
          tb.setCurso(cb);
          tb.setTurno(tub);
          tb.setModulo(mb);
          
            System.out.println("Turma: " + tb.getCodigo() + " Curso: " + cb.getNome()
                    + "Turno: " + tub.getTipoTurno()+ " Modulo: " + mb.getNome());
            System.out.println("------------------");
        }
    }
}
