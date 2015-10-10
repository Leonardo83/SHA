/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package turno.dao;

import turno.bean.TurnoBean;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import util.BaseDao;
import util.ConexaoPostGreSql;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class TurnoDao implements BaseDao{
    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;
        
    @Override
    public Object inserir(Object obj) throws DaoException {
        
        TurnoBean turno = (TurnoBean) obj;
        
        String sql = "INSERT INTO turnos(tipo_turno) VALUES(?)";
                
        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            
            pst.setString(1, turno.getTipoTurno());
            
            pst.execute();
            
            return turno;
        } catch (SQLException ex) {
            Logger.getLogger(TurnoDao.class.getName()).log(Level.SEVERE, null, ex);
            JOptionPane.showMessageDialog(null, "Turno Inserido!" + ex.getMessage());
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Object alterar(Object obj) throws DaoException {
        TurnoBean turno = (TurnoBean) obj;
        
        String sql = "UPDATE turnos SET tipo_turno=? WHERE id = ?";
                
        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            
            pst.setString(1, turno.getTipoTurno());
            pst.setInt(2, turno.getId());
            
            pst.execute();
            return turno;
        } catch (SQLException ex) {
            Logger.getLogger(TurnoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Boolean excluir(Integer codigo) throws DaoException {
        String sql = "DELETE FROM turnos WHERE id = ?";
                
        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);    
            
            pst.setInt(1, codigo);
            
            pst.execute();
            
            return true;
        } catch (SQLException ex) {
            Logger.getLogger(TurnoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;        
    }

    @Override
    public Collection listar() throws DaoException {
        ArrayList turnos = new ArrayList();
        TurnoBean turno = null;
        
        String sql = "SELECT * FROM turnos";
                
        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            
            rs = pst.executeQuery();
            
            while(rs.next() == true){
                turno = new TurnoBean();
                turno.setId(rs.getInt(1));
                turno.setTipoTurno(rs.getString(2));
                
                turnos.add(turno);
            }
            return turnos;
        } catch (SQLException ex) {
            Logger.getLogger(TurnoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {            
            ConexaoPostGreSql.fechar(rs);
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }

    @Override
    public Object selecionar(Integer codigo) throws DaoException {
       
       String sql = "SELECT * FROM turnos WHERE id = ?";
              
        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            
            pst.setInt(1, codigo);
            
            rs = pst.executeQuery();
            
            if(rs.next() == true){
                TurnoBean turno = new TurnoBean();
                turno.setId(rs.getInt(1));
                turno.setTipoTurno(rs.getString(2));
                return turno;
            }
        } catch (SQLException ex) {
            Logger.getLogger(TurnoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(rs);
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(con);
        }
        return null;
    }  
}
