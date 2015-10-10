/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gradeHoraria.dao;

import gradeHoraria.bean.GradeHorariaBean;
import curso.dao.CursoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import util.BaseDao;
import util.ConexaoPostGreSql;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class GradeHorariaDao implements BaseDao {

    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    @Override
    public Object inserir(Object obj) throws DaoException {
        GradeHorariaBean gradeHoraria = (GradeHorariaBean) obj;

        String sql = "INSERT INTO grades_horarias(turma_id) VALUES (?)";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, gradeHoraria.getTurma().getId());

            pst.execute();

            return gradeHoraria;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(con);
            ConexaoPostGreSql.fechar(pst);
        }
        return null;
    }

    @Override
    public Object alterar(Object obj) throws DaoException {
        GradeHorariaBean gradeHoraria = (GradeHorariaBean) obj;

        String sql = "UPDATE grades_horarias SET turma_id = ? WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, gradeHoraria.getTurma().getId());
            pst.setInt(2, gradeHoraria.getId());

            pst.execute();

            return gradeHoraria;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Boolean excluir(Integer codigo) throws DaoException {
        String sql = "DELETE FROM grades_horarias WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            pst.setInt(1, codigo);
            
            pst.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return false;
    }

    @Override
    public Collection listar() throws DaoException {
        ArrayList gradesHorarias = new ArrayList();
        GradeHorariaBean gradeHoraria = null;

        String sql = "SELECT * FROM grades_horarias";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            while (rs.next() == true) {
                gradeHoraria = new GradeHorariaBean();

                gradeHoraria.setId(rs.getInt(1));
                gradeHoraria.getTurma().setId(rs.getInt(2));

                gradesHorarias.add(gradeHoraria);
            }

            return gradesHorarias;
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(rs);
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Object selecionar(Integer codigo) throws DaoException {
        String sql = "SELECT * FROM grades_horarias WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, codigo);

            rs = pst.executeQuery();
            if (rs.next()) {
                GradeHorariaBean gradeHoraria = new GradeHorariaBean();
                gradeHoraria.setId(rs.getInt(1));
                gradeHoraria.getTurma().setId(rs.getInt(2));

                return gradeHoraria;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(rs);
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }
    
}
