/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma.teste;

import curso.bean.CursoBean;
import curso.dao.CursoDao;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modulo.bean.ModuloBean;
import modulo.dao.ModuloDao;
import turma.bean.TurmaBean;
import turma.dao.TurmaDao;
import turno.bean.TurnoBean;
import turno.dao.TurnoDao;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TesteListagem {
    
    public static void main(String[] args) {
        TurmaDao td = new TurmaDao();
        CursoDao cd = new CursoDao();
        TurnoDao turd = new TurnoDao();
        ModuloDao md = new ModuloDao();
        
        CursoBean cb = new CursoBean();
        TurnoBean turb = new TurnoBean();
        ModuloBean mb = new ModuloBean();
                
        try {
            ArrayList<TurmaBean> turmas = (ArrayList<TurmaBean>) td.listar();
            ArrayList<CursoBean> cursos = (ArrayList<CursoBean>) cd.listar();
            ArrayList<TurnoBean> turnos = (ArrayList<TurnoBean>) td.listar();
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
