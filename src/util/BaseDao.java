/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.util.List;

/**
 *
 * @author pierre
 */
public interface BaseDao<T> {
    public T inserir(T obj) throws DaoException;
    public T alterar(T obj) throws DaoException;
    public T selecionar(Integer id) throws DaoException;
    public Boolean excluir(T obj) throws DaoException;
    public List<T> listar() throws DaoException;
    public T insereOuAltera(T obj) throws DaoException;
}
