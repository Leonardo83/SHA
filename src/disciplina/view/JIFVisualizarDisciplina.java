/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/*package disciplina.view;

import disciplina.view.JFVisualDisciplinaTableModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.SwingConstants;
import javax.swing.table.DefaultTableCellRenderer;
import funcionario.FuncionarioBean;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import javax.swing.AbstractAction;
import javax.swing.JComponent;
import javax.swing.JOptionPane;
import javax.swing.KeyStroke;
import util.DaoException;
import disciplina.dao.DisciplinaDao;
import disciplina.bean.DisciplinaBean;


/**
 *
 * @author Kernel
 */
/*public class JIFVisualizarDisciplina extends javax.swing.JInternalFrame {

    private DisciplinaDao disciplinaDao = null;

    /**
     * Creates new form JIFVisualizarProfessor
     */
  /*  public JIFVisualizarDisciplina() {
        initComponents();
        InstanciaClasses();
         atalhos();
        carregaTabelaUsuario();
    }

    public void InstanciaClasses() {
        if (disciplinaDao == null) {
            disciplinaDao = new DisciplinaDao();
        }

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /*@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        painelGeral = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jToggleButton1 = new javax.swing.JToggleButton();
        jLabel1 = new javax.swing.JLabel();
        tf_pesquisa = new javax.swing.JTextField();
        jBFechar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tb_pesquisa = new javax.swing.JTable();

        setTitle("Visualizar Professor");
        setPreferredSize(new java.awt.Dimension(643, 559));

        painelGeral.setMaximumSize(new java.awt.Dimension(328, 328));

        jToggleButton1.setText("F3 - Recarregar");
        jToggleButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jToggleButton1ActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("Listar Dados ");

        tf_pesquisa.setBackground(new java.awt.Color(172, 220, 223));
        tf_pesquisa.setSelectedTextColor(new java.awt.Color(0, 102, 153));
        tf_pesquisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tf_pesquisaActionPerformed(evt);
            }
        });
        tf_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tf_pesquisaKeyReleased(evt);
            }
        });

        jBFechar.setText("F4 - Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Fechar");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jToggleButton1)
                        .addGap(3, 3, 3)
                        .addComponent(jBFechar))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 59, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(tf_pesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 404, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton1)
                    .addComponent(tf_pesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jBFechar))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 656, Short.MAX_VALUE)
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 587, Short.MAX_VALUE)
        );

        jPanel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel2.setText("Relatórios de Disciplinas Cadastradas");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel2)
                .addContainerGap(212, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        tb_pesquisa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3"
            }
        ));
        tb_pesquisa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tb_pesquisaMouseClicked(evt);
            }
        });
        tb_pesquisa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                tb_pesquisaKeyReleased(evt);
            }
        });
        jScrollPane1.setViewportView(tb_pesquisa);

        javax.swing.GroupLayout painelGeralLayout = new javax.swing.GroupLayout(painelGeral);
        painelGeral.setLayout(painelGeralLayout);
        painelGeralLayout.setHorizontalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, painelGeralLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(painelGeralLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1)
                    .addGroup(painelGeralLayout.createSequentialGroup()
                        .addGroup(painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        painelGeralLayout.setVerticalGroup(
            painelGeralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(painelGeralLayout.createSequentialGroup()
                .addGap(9, 9, 9)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeral, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(painelGeral, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jToggleButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jToggleButton1ActionPerformed
        carregaTabelaUsuario();
        voltaParaEstadoInicial();
    }//GEN-LAST:event_jToggleButton1ActionPerformed

    private void tf_pesquisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tf_pesquisaActionPerformed

    }//GEN-LAST:event_tf_pesquisaActionPerformed

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        fecharTela();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void tf_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tf_pesquisaKeyReleased
        converteMaiusculo();
        filtrarUsuario();
    }//GEN-LAST:event_tf_pesquisaKeyReleased

    private void tb_pesquisaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tb_pesquisaMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_tb_pesquisaMouseClicked

    private void tb_pesquisaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tb_pesquisaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_UP && tb_pesquisa.getSelectedRow() == 0) {
            tf_pesquisa.grabFocus();
        }
    }//GEN-LAST:event_tb_pesquisaKeyReleased
private void atalhos(){
    painelGeral.getActionMap().put("fechar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                fecharTela();
            }
        });
        painelGeral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(
                KeyEvent.VK_F4, 0), "fechar");

        painelGeral.getActionMap().put("recarregar", new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                carregaTabelaUsuario();
                voltaParaEstadoInicial();
            }
        });
        painelGeral.getInputMap(JComponent.WHEN_IN_FOCUSED_WINDOW).put(KeyStroke.getKeyStroke(
                KeyEvent.VK_F3, 0), "recarregar");
        }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBFechar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JPanel painelGeral;
    private javax.swing.JTable tb_pesquisa;
    private javax.swing.JTextField tf_pesquisa;
    // End of variables declaration//GEN-END:variables

    private void carregaTabelaUsuario() {
        try {
            populaTabelaUsuario((ArrayList<DisciplinaBean>) disciplinaDao.listar());
        } catch (DaoException ex) {
            Logger.getLogger(JIFVisualizarDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void populaTabelaUsuario(ArrayList<DisciplinaBean> listar) {
        JFVisualDisciplinaTableModel modeloFuncionario = new JFVisualDisciplinaTableModel(listar);
        tb_pesquisa.setModel(modeloFuncionario);

        definirTamanhoColunas();
        definirAlinhamentoColunas();
        selecionaPrimeiraLinhaDaTabela();

    }

    private void definirTamanhoColunas() {
        tb_pesquisa.getColumnModel().getColumn(0).setPreferredWidth(70);
        tb_pesquisa.getColumnModel().getColumn(1).setPreferredWidth(200);
        tb_pesquisa.getColumnModel().getColumn(2).setPreferredWidth(150);
        
    }

    private void definirAlinhamentoColunas() {
        DefaultTableCellRenderer rendererCentro = new DefaultTableCellRenderer();
        rendererCentro.setHorizontalAlignment(SwingConstants.CENTER);
        DefaultTableCellRenderer rendererDireita = new DefaultTableCellRenderer();
        rendererDireita.setHorizontalAlignment(SwingConstants.RIGHT);
        DefaultTableCellRenderer rendererEsquerda = new DefaultTableCellRenderer();
        rendererEsquerda.setHorizontalAlignment(SwingConstants.LEFT);

        tb_pesquisa.getColumnModel().getColumn(0).setCellRenderer(rendererCentro);
        tb_pesquisa.getColumnModel().getColumn(1).setCellRenderer(rendererEsquerda);
        tb_pesquisa.getColumnModel().getColumn(2).setCellRenderer(rendererEsquerda);
        
        }

    private void selecionaPrimeiraLinhaDaTabela() {
        if (tb_pesquisa.getRowCount() > 0) {
            tb_pesquisa.getSelectionModel().setSelectionInterval(0, 0);
        }
    }

    private void filtrarUsuario() {
        String chave = tf_pesquisa.getText().toUpperCase();

        try {
            populaTabelaUsuario((ArrayList<DisciplinaBean>) disciplinaDao.pesquisarPorNome(chave));
        } catch (DaoException ex) {
            Logger.getLogger(JIFVisualizarDisciplina.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void converteMaiusculo() {
        tf_pesquisa.setText(tf_pesquisa.getText().toUpperCase());
    }

    private void voltaParaEstadoInicial() {
        tf_pesquisa.setText("");
        tf_pesquisa.grabFocus();

    }

    private void fecharTela() {
        if (JOptionPane.showConfirmDialog(null, "Deseja realmente fechar o Formulário de Pesquisa de Usuários?") == 0) {
            dispose();
        }
    }
}
*/