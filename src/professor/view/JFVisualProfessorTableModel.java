/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package professor.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import funcionario.FuncionarioBean;


/**
 *
 * @author Kernel
 */
public class JFVisualProfessorTableModel extends AbstractTableModel {

    private ArrayList linhas = null;

    private String[] colunas = {"Matrícula", "Nome", "Sexo", "Cargo", "Função", "Ativo"};

    public JFVisualProfessorTableModel(ArrayList<FuncionarioBean> dados) {
        setLinhas(dados);
    }

    public ArrayList<FuncionarioBean> getLinhas() {
        return linhas;
    }

    private void setLinhas(ArrayList<FuncionarioBean> list) {
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
            FuncionarioBean professor = (FuncionarioBean) linhas.get(rowIndex);
            if (columnIndex != -1) {
                switch (columnIndex) {
                    case 0:
                        return professor.getMatricula();
                    case 1:
                        return professor.getNome();
                    case 2:
                        return professor.getSexo();
                    case 3:
                        return professor.getCargo();
                    case 4:
                        return professor.getFuncao();
                    case 5:
                        return professor.isAtivo();
                }
            } else if (columnIndex == -1) {
                return professor;
            }

        }
        return null;
    }

}
