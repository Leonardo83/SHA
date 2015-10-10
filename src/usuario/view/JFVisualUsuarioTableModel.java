/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package usuario.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import usuario.bean.UsuarioBean;

/**
 *
 * @author Kernel
 */
public class JFVisualUsuarioTableModel extends AbstractTableModel {

    private ArrayList linhas = null;

    private String[] colunas = {"Perfil", "Nome Professor", "Nome Usuario"};

    public JFVisualUsuarioTableModel(ArrayList<UsuarioBean> dados) {
        setLinhas(dados);
    }

    public ArrayList<UsuarioBean> getLinhas() {
        return linhas;
    }

    private void setLinhas(ArrayList<UsuarioBean> list) {
        linhas = list;
    }

    public String[] getColunas() {
        return colunas;
    }

    public void setColunas(String[] strings) {
        colunas = strings;
    }

    @Override
    public int getRowCount() {
        return getLinhas().size();
    }

    @Override
    public int getColumnCount() {
        return getColunas().length;
    }

    @Override
    public String getColumnName(int columnIndex) {
        return colunas[columnIndex];
    }

    @Override
    public Object getValueAt(int rowIndex, int columnIndex) {
        if (rowIndex == -1) {
            JOptionPane.showMessageDialog(null, "Selecione um usuário");
        } else {
            UsuarioBean usuario = (UsuarioBean) linhas.get(rowIndex);
            if (columnIndex != -1) {
                switch (columnIndex) {
                    case 0:
                        return usuario.getPerfil();
                    case 1:
                        return usuario.getFuncionario().getNome();
                    case 2:
                        return usuario.getUsuario();

                }
            } else if (columnIndex == -1) {
                return usuario;
            }

        }
        return null;
    }

}
