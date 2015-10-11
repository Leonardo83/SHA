/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma.teste;

import curso.bean.CursoBean;
import curso.dao.CursoDaoImpl;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
    
    public static void main(String[] args) {
        TurmaDaoImpl td = new TurmaDaoImpl();
        CursoDaoImpl cd = new CursoDaoImpl();
        TurnoDaoImpl turd = new TurnoDaoImpl();
        ModuloDaoImpl md = new ModuloDaoImpl();
        
        CursoBean cb = new CursoBean();
        TurnoBean turb = new TurnoBean();
        ModuloBean mb = new ModuloBean();
                
        try {
            ArrayList<TurmaBean> turmas = (ArrayList<TurmaBean>) td.listar();
            ArrayList<CursoBean> cursos = (ArrayList<CursoBean>) cd.listar();
            ArrayList<TurnoBean> turnos = (ArrayList<TurnoBean>) turd.listar();
            ArrayList<ModuloBean> modulos = (ArrayList<ModuloBean>) md.listar();
            for (TurmaBean tb : turmas) {
                System.out.println("Turma: " + tb.getCodigo() + " Curso: " + cb.getNome()
                        + "Turno: " + turb.getTipoTurno() + " Modulo: " + mb.getNome());                
                System.out.println("------------------");
            }
        } catch (DaoException ex) {
            Logger.getLogger(TesteListagem.class.getName()).log(Level.SEVERE, null, ex);
        }
    }   
}
