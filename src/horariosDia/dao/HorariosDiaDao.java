/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package horariosDia.dao;

import horariosDia.bean.HorariosDiaBean;
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
public class HorariosDiaDao implements BaseDao {

    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    @Override
    public Object inserir(Object obj) throws DaoException {
        HorariosDiaBean horariosDia = (HorariosDiaBean) obj;

        String sql = "INSERT INTO horarios_dia(grade_horaria_id, dia_da_semana) VALUES (?, ?)";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, horariosDia.getGradeHoraria().getId());
            pst.setString(2, horariosDia.getDiaSemana());

            pst.execute();

            return horariosDia;
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
        HorariosDiaBean horariosDia = (HorariosDiaBean) obj;

        String sql = "UPDATE horarios_dia SET grade_horaria_id = ?, dia_da_semana = ? WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, horariosDia.getGradeHoraria().getId());
            pst.setString(2, horariosDia.getDiaSemana());
            pst.setInt(5, horariosDia.getId());

            pst.execute();

            return horariosDia;
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
        String sql = "DELETE FROM horarios_dia WHERE id = ?";

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
        ArrayList horariosDia = new ArrayList();
        HorariosDiaBean horarioDia = null;

        String sql = "SELECT * FROM horarios_dia";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            while (rs.next() == true) {
                horarioDia = new HorariosDiaBean();

                horarioDia.setId(rs.getInt(1));
                horarioDia.getGradeHoraria().setId(rs.getInt(2));
                horarioDia.setDiaSemana(rs.getString(3));

                horariosDia.add(horarioDia);
            }

            return horariosDia;
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
        String sql = "SELECT * FROM horarios_dia WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, codigo);

            rs = pst.executeQuery();
            if (rs.next()) {
                HorariosDiaBean horarioDia = new HorariosDiaBean();
                horarioDia.getGradeHoraria().setId(rs.getInt(1));
                horarioDia.setDiaSemana(rs.getString(2));
                horarioDia.setId(rs.getInt(3));

                return horarioDia;
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
