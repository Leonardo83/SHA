/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professordisciplina.teste;

import disciplina.bean.DisciplinaBean;
import disciplina.dao.DisciplinaDaoImpl;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import professor.bean.ProfessorBean;
import professor.dao.ProfessorDaoImpl;
import util.DaoException;

/**
 *
 * @author KERNEL
 */
public class TesteInsere {

    public static void main(String[] args) {
        ProfessorDaoImpl pdi = new ProfessorDaoImpl();
        
        ProfessorBean professor = new ProfessorBean();
        professor.setId(6);
        professor.setNome("Beltrano");
        professor.setMatricula("123789");

        //DisciplinaDaoImpl ddi = new DisciplinaDaoImpl();
        DisciplinaBean matematica = new DisciplinaBean();
        DisciplinaBean portugues = new DisciplinaBean();
        matematica.setId(1);
        portugues.setId(2);

        ArrayList<ProfessorBean> professores = new ArrayList();
        professores.add(professor);
        matematica.setListaProfessores(professores);
        
        ArrayList<DisciplinaBean> disciplinas = new ArrayList();
        disciplinas.add(matematica);
        disciplinas.add(portugues);
        professor.setListaDisciplinas(disciplinas);
        
        try {
            pdi.alterar(professor);
            //System.out.println("Disciplinas para o professor " + professor.getNome() + " inseridas com suscesso");
        } catch (DaoException ex) {
            Logger.getLogger(TesteInsere.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
