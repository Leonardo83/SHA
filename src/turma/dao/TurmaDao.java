/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turma.dao;

import curso.bean.CursoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import modulo.bean.ModuloBean;
import turma.bean.TurmaBean;
import turno.bean.TurnoBean;
import util.BaseDao;
import util.ConexaoPostGreSql;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TurmaDao implements BaseDao {

    Connection con = null;
    PreparedStatement pst = null;
    ResultSet rs = null;

    @Override
    public Object inserir(Object obj) throws DaoException {
        TurmaBean tb = new TurmaBean();
        String sql = "INSERT INTO turmas(curso_id, turno_id, modulo_id, codigo) values(?, ?, ?, ?)";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, tb.getCurso().getId());
            pst.setInt(2, tb.getTurno().getId());
            pst.setInt(3, tb.getModulo().getId());
            pst.setString(4, tb.getCodigo());

            pst.execute();

            return tb;

        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Object alterar(Object obj) throws DaoException {
        TurmaBean tb = new TurmaBean();
        String sql = "UPDATE turmas SET curso_id = ?, turno_id = ? , modulo_id = ?, codigo = ? WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, tb.getTurno().getId());
            pst.setInt(2, tb.getModulo().getId());
            pst.setString(3, tb.getCodigo());
            pst.setInt(4, tb.getCurso().getId());

            pst.execute();

            return tb;

        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Boolean excluir(Integer codigo) throws DaoException {
        String sql = "DELETE FROM turmas WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, codigo);

            pst.execute();

            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Collection listar() throws DaoException {
        ArrayList turmas = new ArrayList();
        TurmaBean tb = null;
        CursoBean cb = null;
        TurnoBean tur = null;
        ModuloBean mb = null;

        String sql = "SELECT t.codigo, c.nome, tur.tipo_turno, m.nome FROM turmas t"
                + "INNER JOIN cursos c ON c.id=t.curso_id"
                + "JOIN turnos tur ON tur.id=t.turno_id"
                + "JOIN modulos m ON m.id=t.modulo_id";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();

            while (rs.next() == true) {

                tb = new TurmaBean();
                cb = new CursoBean();
                tur = new TurnoBean();
                mb = new ModuloBean();

                tb.setCodigo(rs.getString(1));
                cb.setNome(rs.getString(2));
                tur.setTipoTurno(rs.getString(3));
                mb.setNome(rs.getString(4));

                turmas.add(tb);
            }
            return turmas;
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(rs);
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Object selecionar(Integer codigo) throws DaoException {
        String sql = "SELECT t.codigo, c.nome, tur.tipo_turno, m.nome FROM turmas t"
                + "INNER JOIN cursos c ON c.id=t.curso_id"
                + "JOIN turnos tur ON tur.id=t.turno_id"
                + "JOIN modulos m ON m.id=t.modulo_id WHERE t.id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, codigo);

            rs = pst.executeQuery();

            if (rs.next() == true) {
                TurmaBean tb = new TurmaBean();
                CursoBean cb = new CursoBean();
                TurnoBean tur = new TurnoBean();
                ModuloBean mb = new ModuloBean();

                tb.setCodigo(rs.getString(1));
                cb.setNome(rs.getString(2));
                tur.setTipoTurno(rs.getString(3));
                mb.setNome(rs.getString(4));

                return tb;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TurmaDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(rs);
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }
}
