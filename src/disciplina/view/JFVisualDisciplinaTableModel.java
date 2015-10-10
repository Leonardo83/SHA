/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package disciplina.view;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.AbstractTableModel;
import disciplina.bean.DisciplinaBean;

/**
 *
 * @author Kernel
 */
public class JFVisualDisciplinaTableModel extends AbstractTableModel {

    private ArrayList linhas = null;

    private String[] colunas = {"Nome", "Sigla", "Carga Horária"};

    public JFVisualDisciplinaTableModel(ArrayList<DisciplinaBean> dados) {
        setLinhas(dados);
    }

    public ArrayList<DisciplinaBean> getLinhas() {
        return linhas;
    }

    private void setLinhas(ArrayList<DisciplinaBean> list) {
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
            DisciplinaBean disciplina = (DisciplinaBean) linhas.get(rowIndex);
            if (columnIndex != -1) {
                switch (columnIndex) {
                    case 0:
                        return disciplina.getNome();
                    case 1:
                        return disciplina.getSigla();
                    case 2:
                        return disciplina.getCargaHoraria();

                }
            } else if (columnIndex == -1) {
                return disciplina;
            }

        }
        return null;
    }

}
