/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfil.dao;

import perfil.bean.PerfilBean;
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
public class PerfilDao implements BaseDao{
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
    
    @Override
    public Object inserir(Object obj) throws DaoException {
        PerfilBean perfil = (PerfilBean) obj;

        String sql = "INSERT INTO perfis(tipo_perfil) VALUES (?)";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            
            pst.setString(1, perfil.getTipoPerfil());

            pst.execute();

            return perfil;
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(con);
            ConexaoPostGreSql.fechar(pst);
        }
        return null;
    }

    @Override
    public Object alterar(Object obj) throws DaoException {
        PerfilBean perfil = (PerfilBean) obj;

        String sql = "UPDATE perfis SET id = ?, tipo_perfil = ? WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, perfil.getId());
            pst.setString(2, perfil.getTipoPerfil());
            pst.setInt(3, perfil.getId());

            pst.execute();

            return perfil;
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Boolean excluir(Integer codigo) throws DaoException {
        String sql = "DELETE FROM perfis WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            pst.setInt(1, codigo);
            
            pst.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return false;
    }

    @Override
    public Collection listar() throws DaoException {
        ArrayList perfis = new ArrayList();
        PerfilBean perfil = null;

        String sql = "SELECT * FROM perfis";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            while (rs.next() == true) {
                perfil = new PerfilBean();
                
                perfil.setId(rs.getInt(1));
                perfil.setTipoPerfil(rs.getString(2));
                
                perfis.add(perfil);
            }

            return perfis;
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(rs);
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Object selecionar(Integer codigo) throws DaoException {
        String sql = "SELECT * FROM perfis WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, codigo);

            rs = pst.executeQuery();
            if (rs.next()) {
                PerfilBean perfil = new PerfilBean();
                perfil.setId(rs.getInt(1));
                perfil.setTipoPerfil(rs.getString(2));

                return perfil;
            }
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(rs);
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }
}
