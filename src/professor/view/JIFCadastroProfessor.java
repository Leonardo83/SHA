/*package professor.view;

import funcionario.FuncionarioBean;
import javax.swing.DefaultComboBoxModel;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import professor.bean.ProfessorBean;
import professor.dao.ProfessorDao;
import telefone.bean.TelefoneBean;
import telefone.dao.TelefoneDao;
import util.DaoException;

/**
 *
 * @author GRUPO KERNEL
 */
/*public class JIFCadastroProfessor extends javax.swing.JInternalFrame {

    private ProfessorDao professorDao = null;
    private TelefoneDao telefoneDao = null;

    /**
     * Creates new form JIFCadastrarProfessor
     */
  /*  public JIFCadastroProfessor() {
        initComponents();

        if (professorDao == null) {
            professorDao = new ProfessorDao();
        }
        if (telefoneDao == null) {
            telefoneDao = new TelefoneDao();
        }

        ArrayList<String> sexo = new ArrayList();
        sexo.add("M");
        sexo.add("F");
        jCBSexo.setModel(new DefaultComboBoxModel(sexo.toArray()));

        ArrayList<String> cargos = new ArrayList();
        cargos.add("Professor");
        jCBCargo.setModel(new DefaultComboBoxModel(cargos.toArray()));

        ArrayList<String> funcoes = new ArrayList();
        funcoes.add("Coordenador");
        jCBFuncao.setModel(new DefaultComboBoxModel(funcoes.toArray()));

        limpar();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    /*@SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel3 = new javax.swing.JPanel();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jTFCodigo = new javax.swing.JTextField();
        jTFMatricula = new javax.swing.JTextField();
        jTFNome = new javax.swing.JTextField();
        jTFDdd = new javax.swing.JTextField();
        jTFNumero = new javax.swing.JTextField();
        jCBSexo = new javax.swing.JComboBox();
        jCBCargo = new javax.swing.JComboBox();
        jCBFuncao = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        jBAlterar = new javax.swing.JButton();
        jBLimpar = new javax.swing.JButton();
        jBExcluir = new javax.swing.JButton();
        jBFechar = new javax.swing.JButton();
        jBPesquisar = new javax.swing.JButton();
        jBCadastrar = new javax.swing.JButton();

        setTitle("Cadastro de Professor");

        jPanel3.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel1.setText("Código:");

        jLabel2.setText("Matrícula*:");

        jLabel3.setText("Nome*:");

        jLabel4.setText("Sexo:");

        jLabel5.setText("Cargo:");

        jLabel6.setText("Função:");

        jLabel7.setText("Número:");

        jLabel8.setText("DDD:");

        jLabel10.setText("Telefone");

        jTFCodigo.setEditable(false);

        jCBSexo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCBCargo.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jCBFuncao.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addGap(1, 1, 1)
                        .addComponent(jTFDdd, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(8, 8, 8)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel10))
                .addGap(20, 20, 20))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, 253, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCBFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, 270, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jCBCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTFCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jTFMatricula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jTFNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jCBFuncao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel10)
                .addGap(6, 6, 6)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(jLabel7)
                    .addComponent(jTFDdd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTFNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(78, 78, 78))
        );

        jBAlterar.setMnemonic('a');
        jBAlterar.setText("Alterar");
        jBAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBAlterarActionPerformed(evt);
            }
        });

        jBLimpar.setMnemonic('l');
        jBLimpar.setText("Limpar");
        jBLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBLimparActionPerformed(evt);
            }
        });

        jBExcluir.setMnemonic('e');
        jBExcluir.setText("Excluir");
        jBExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBExcluirActionPerformed(evt);
            }
        });

        jBFechar.setMnemonic('f');
        jBFechar.setText("Fechar");
        jBFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBFecharActionPerformed(evt);
            }
        });

        jBPesquisar.setMnemonic('p');
        jBPesquisar.setText("Pesquisar");
        jBPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBPesquisarActionPerformed(evt);
            }
        });

        jBCadastrar.setMnemonic('c');
        jBCadastrar.setText("Cadastrar");
        jBCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(jBExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBAlterar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBPesquisar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBFechar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 10, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(jBCadastrar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBPesquisar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBAlterar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jBExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jBFechar))
        );

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 29, Short.MAX_VALUE)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 301, Short.MAX_VALUE)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(117, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBFecharActionPerformed
        fechar();
    }//GEN-LAST:event_jBFecharActionPerformed

    private void jBLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBLimparActionPerformed
        limpar();
    }//GEN-LAST:event_jBLimparActionPerformed

    private void jBCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBCadastrarActionPerformed
        cadastrar();
    }//GEN-LAST:event_jBCadastrarActionPerformed

    private void jBPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBPesquisarActionPerformed
        pesquisar();
    }//GEN-LAST:event_jBPesquisarActionPerformed

    private void jBAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBAlterarActionPerformed
        alterar();
    }//GEN-LAST:event_jBAlterarActionPerformed

    private void jBExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBExcluirActionPerformed
        excluir();
    }//GEN-LAST:event_jBExcluirActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBAlterar;
    private javax.swing.JButton jBCadastrar;
    private javax.swing.JButton jBExcluir;
    private javax.swing.JButton jBFechar;
    private javax.swing.JButton jBLimpar;
    private javax.swing.JButton jBPesquisar;
    private javax.swing.JComboBox jCBCargo;
    private javax.swing.JComboBox jCBFuncao;
    private javax.swing.JComboBox jCBSexo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField jTFCodigo;
    private javax.swing.JTextField jTFDdd;
    private javax.swing.JTextField jTFMatricula;
    private javax.swing.JTextField jTFNome;
    private javax.swing.JTextField jTFNumero;
    // End of variables declaration//GEN-END:variables

    private void fechar() {
        if (verificaPreenchido()) {
            int o = JOptionPane.showConfirmDialog(this, "Há dados preenchidos! Deseja realmente sair?", "Mensagem", JOptionPane.YES_OPTION);
            if (o == 0) {
                dispose();
            }
        } else {
            dispose();
        }
    }

    private boolean verificaPreenchido() {
        if (!(jCBSexo.getSelectedIndex() == -1)
                || !(jCBCargo.getSelectedIndex() == -1)
                || !(jCBFuncao.getSelectedIndex() == -1)
                || !(jTFMatricula.getText().isEmpty())
                || !(jTFNome.getText().isEmpty())
                || !(jTFDdd.getText().isEmpty())
                || !(jTFNumero.getText().isEmpty())) {

            return true;
        } else {
            return false;
        }
    }

    private void limpar() {
        jTFCodigo.setText("");
        jCBSexo.setSelectedIndex(-1);
        jCBCargo.setSelectedIndex(-1);
        jCBFuncao.setSelectedIndex(-1);
        jTFMatricula.setText("");
        jTFNome.setText("");
        jTFDdd.setText("");
        jTFNumero.setText("");
    }

    private void cadastrar() {
        ProfessorBean professor = populaProfessorBean();
        TelefoneBean telefoneBean;

        if (professor != null) {
            telefoneBean = populaTelefone();
            try {
                telefoneBean.setFuncionario((FuncionarioBean) professorDao.inserir(professor));
                if (telefoneDao.inserir(telefoneBean) != null) {
                    JOptionPane.showMessageDialog(rootPane, "Professor cadastrado com sucesso!");
                    limpar();
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao cadastrar!");
                }

            } catch (DaoException ex) {
                Logger.getLogger(JIFCadastroProfessor.class.getName()).log(Level.SEVERE, null, ex);
            }

        }

    }

    private ProfessorBean populaProfessorBean() {
        ProfessorBean professor;
        if (validaPreencimento()) {
            professor = new ProfessorBean();

            professor.setMatricula(jTFMatricula.getText());
            professor.setNome(jTFNome.getText());
            professor.setSexo(jCBSexo.getSelectedItem().toString());
            professor.setCargo(jCBCargo.getSelectedItem().toString());
            if (jCBFuncao.getSelectedItem() != null) {
                professor.setFuncao(jCBFuncao.getSelectedItem().toString());
            }

            return professor;
        }
        return null;
    }

    private TelefoneBean populaTelefone() {
        TelefoneBean telefone = new TelefoneBean();

        telefone.setDdd(jTFDdd.getText());
        telefone.setNumero(jTFNumero.getText());

        return telefone;
    }

    private boolean validaPreencimento() {
        if (jTFMatricula.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe a Matrícula");
            jTFMatricula.grabFocus();
            return false;
        } else if (jTFNome.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o Nome");
            jTFNome.grabFocus();
            return false;
        } else if (jCBSexo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o sexo");
            jCBSexo.grabFocus();
            return false;
        } else if (jCBCargo.getSelectedIndex() == -1) {
            JOptionPane.showMessageDialog(rootPane, "Selecione o cargo");
            jCBCargo.grabFocus();
            return false;
        } else if (jTFDdd.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o DDD");
            jTFDdd.grabFocus();
            return false;
        } else if (jTFNumero.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Informe o numero");
            jTFNumero.grabFocus();
            return false;
        }
        return true;
    }

    private void pesquisar() {
        int codigo = Integer.parseInt(JOptionPane.showInputDialog("Informe o código do professor."));
        try {
            ProfessorBean professorBean = (ProfessorBean) professorDao.selecionar(codigo);
            if (professorBean == null) {
                JOptionPane.showMessageDialog(rootPane, "Professor não encontrado!");
                limpar();
            } else {
                popularFormProfessor(professorBean);
            }
        } catch (DaoException ex) {
            Logger.getLogger(JIFCadastroProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void popularFormProfessor(ProfessorBean professorBean) {
        jTFCodigo.setText(professorBean.getId().toString());
        jTFMatricula.setText(professorBean.getMatricula());
        jTFNome.setText(professorBean.getNome());
        jCBSexo.setSelectedItem(professorBean.getSexo());
        jCBCargo.setSelectedItem(professorBean.getCargo());
        jCBFuncao.setSelectedItem(professorBean.getFuncao());

        TelefoneBean telefoneBean = new TelefoneBean();
        TelefoneDao telefoneDao = new TelefoneDao();

        try {
            telefoneBean = (TelefoneBean) telefoneDao.selecionar(professorBean.getId());
            jTFDdd.setText(telefoneBean.getDdd());
            jTFNumero.setText(telefoneBean.getNumero());
        } catch (DaoException ex) {
            Logger.getLogger(JIFCadastroProfessor.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    private void alterar() {
        ProfessorBean professorBean = populaProfessorBean2();
        
        if (professorBean != null) {
            try {
                if(professorDao.alterar(professorBean) != null){
                    JOptionPane.showMessageDialog(rootPane, "Professor alterado com sucesso!");
                } else {
                    JOptionPane.showMessageDialog(rootPane, "Erro ao alterar!");
                }
            } catch (DaoException ex) {
                Logger.getLogger(JIFCadastroProfessor.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }

    private ProfessorBean populaProfessorBean2() {
        ProfessorBean professor;
        if (validaPreencimento()) {
            professor = new ProfessorBean();
            
            professor.setId(Integer.parseInt(jTFCodigo.getText()));
            professor.setMatricula(jTFMatricula.getText());
            professor.setNome(jTFNome.getText());
            professor.setSexo(jCBSexo.getSelectedItem().toString());
            professor.setCargo(jCBCargo.getSelectedItem().toString());
            if (jCBFuncao.getSelectedItem() != null) {
                professor.setFuncao(jCBFuncao.getSelectedItem().toString());
            }

            return professor;
        }
        return null;
    }

    private void excluir() {
            if (!jTFCodigo.getText().isEmpty()) {
                int codigo = Integer.parseInt(jTFCodigo.getText());
                try {
                    if (professorDao.excluir(codigo)) {
                        JOptionPane.showMessageDialog(rootPane, "Professor excluído!");
                        limpar();
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Erro ao excluir!");
                    }
                } catch (DaoException ex) {
                    Logger.getLogger(JIFCadastroProfessor.class.getName()).log(Level.SEVERE, null, ex);
                }
            } else {
                JOptionPane.showMessageDialog(rootPane, "Erro ao excluir!");
            }
        }

}
*/