package usuario.dao;

import usuario.bean.UsuarioBean;
import curso.dao.CursoDao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.logging.Level;
import java.util.logging.Logger;
import perfil.bean.PerfilBean;
import professor.bean.ProfessorBean;
import util.BaseDao;
import util.ConexaoPostGreSql;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
public class UsuarioDao implements BaseDao {

    private Connection con = null;
    private PreparedStatement pst = null;
    private ResultSet rs = null;

    @Override
    public Object inserir(Object obj) throws DaoException {
        UsuarioBean usuario = (UsuarioBean) obj;

        String sql = "INSERT INTO usuarios(perfil_id, funcionario_id, usuario, senha) VALUES (?, ?, ?, ?)";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, usuario.getPerfil().getId());
            pst.setInt(2, usuario.getFuncionario().getId());
            pst.setString(3, usuario.getUsuario());
            pst.setString(4, usuario.getSenha());

            pst.execute();

            return usuario;
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
        UsuarioBean usuario = (UsuarioBean) obj;

        String sql = "UPDATE usuarios SET perfil_id = ?, funcionario_id = ?, usuario = ?, senha = ? WHERE id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, usuario.getPerfil().getId());
            pst.setInt(2, usuario.getFuncionario().getId());
            pst.setString(3, usuario.getUsuario());
            pst.setString(4, usuario.getSenha());
            pst.setInt(5, usuario.getId());

            pst.execute();

            return usuario;
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
        String sql = "DELETE FROM usuarios WHERE id = ?";

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
        ArrayList usuarios = new ArrayList();
        UsuarioBean usuario = null;
        PerfilBean perfil = null;
        ProfessorBean professor = null;

        String sql = "SELECT  perfis.tipo_perfil, f.nome, u.usuario"
                + "FROM usuarios u \n"
                + "INNER JOIN perfis  \n"
                + "ON u.perfil_id = p.id \n"
                + "INNER JOIN funcionarios f \n"
                + "ON u.funcionario_id = f.id\n"
                + "INNER JOIN professor p\n"
                + "ON p.funcucionario_id = f.id";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            rs = pst.executeQuery();
            while (rs.next() == true) {
                usuario = new UsuarioBean();
                perfil = new PerfilBean();
                professor = new ProfessorBean();

                //usuario.setId(rs.getInt(1));
                //perfil.setId(rs.getInt(2));
                perfil.setTipoPerfil(rs.getString(1));
                usuario.setPerfil(perfil);
                //professor.setId(rs.getInt(4));
                professor.setNome(rs.getString(2));
                usuario.setFuncionario(professor);
                usuario.setUsuario(rs.getString(3));

                usuarios.add(usuario);
            }

            return usuarios;
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
        String sql = "SELECT u.id,perfis.tipo_perfil, u.funcionario_id, f.nome, u.usuario,u.perfil_id\n"
                + "FROM usuarios u\n"
                + "INNER JOIN perfis p\n"
                + "ON u.perfil_id = perfis.id\n"
                + "INNER JOIN funcionarios f\n"
                + "ON u.funcionario_id = f.id\n"
                + "INNER JOIN professor p\n"
                + "ON p.funcucionario_id = f.id\n"
                + "WHERE u.id = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setInt(1, codigo);

            rs = pst.executeQuery();
            if (rs.next()) {
                UsuarioBean usuario = new UsuarioBean();
                PerfilBean perfil = new PerfilBean();
                ProfessorBean professor = new ProfessorBean();

                usuario.setId(rs.getInt(1));
                perfil.setId(rs.getInt(2));
                perfil.setTipoPerfil(rs.getString(3));
                usuario.setPerfil(perfil);
                professor.setId(rs.getInt(4));
                professor.setNome(rs.getString(5));
                usuario.setFuncionario(professor);
                usuario.setUsuario(rs.getString(6));

                return usuario;
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

    public Object logar(Object obj) throws DaoException {
        UsuarioBean usuario = (UsuarioBean) obj;

        String sql = "SELECT * FROM usuarios WHERE usuario = ? AND senha = ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);

            pst.setString(1, usuario.getUsuario());
            pst.setString(2, usuario.getSenha());

            rs = pst.executeQuery();
            if (rs.next()) {
                return usuario;
            } else {
                return null;
            }
        } catch (SQLException ex) {
            Logger.getLogger(CursoDao.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            ConexaoPostGreSql.fechar(con);
            ConexaoPostGreSql.fechar(pst);
            ConexaoPostGreSql.fechar(rs);
        }
        return null;
    }
     public Collection pesquisarPorNome(String nome) throws DaoException {
        ArrayList usuarios = new ArrayList();
        UsuarioBean usuario = null;
        PerfilBean perfil = null;
        ProfessorBean professor = null;

        String sql = "SELECT  perfis.tipo_perfil, f.nome, u.usuario"
                + "FROM usuarios u \n"
                + "INNER JOIN perfis  \n"
                + "ON u.perfil_id = perfis.id \n"
                + "INNER JOIN funcionarios f \n"
                + "ON u.funcionario_id = f.id\n"
                + "INNER JOIN professor p\n"
                + "ON p.funcucionario_id = f.id"
                + "where nome like ?";

        try {
            con = ConexaoPostGreSql.getConexao();
            pst = con.prepareStatement(sql);
            
            pst.setString(1, nome + "%");

            rs = pst.executeQuery();
            while (rs.next() == true) {
                usuario = new UsuarioBean();
                perfil = new PerfilBean();
                professor = new ProfessorBean();

                //usuario.setId(rs.getInt(1));
               // perfil.setId(rs.getInt(2));
                perfil.setTipoPerfil(rs.getString(1));
                usuario.setPerfil(perfil);
                //professor.setId(rs.getInt(2));
                professor.setNome(rs.getString(2));
                usuario.setFuncionario(professor);
                usuario.setUsuario(rs.getString(3));

                usuarios.add(usuario);
            }

            return usuarios;
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
