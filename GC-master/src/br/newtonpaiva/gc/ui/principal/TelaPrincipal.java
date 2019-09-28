/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.newtonpaiva.gc.ui.principal;

import br.newtonpaiva.gc.ui.aluno.TodosAlunos;
import br.newtonpaiva.gc.ui.empresa.TelaEmpresa;
import br.newtonpaiva.gc.ui.contrato.TelaContrato;
import br.newtonpaiva.gc.ui.convenio.TodosConvenios;
import br.newtonpaiva.gc.ui.usuario.TodosUsuarios;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

/**
 *
 * @author 11514858
 */
public class TelaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form TelaPrincipal
     */
    public TelaPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        btnUsuario = new javax.swing.JButton();
        btnAluno = new javax.swing.JButton();
        btnEmpresa = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        btnContratos = new javax.swing.JButton();
        BtnConvenio = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        BtnFechar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Gestão de Contratos");
        setExtendedState(JFrame.NORMAL);
        setMinimumSize(new java.awt.Dimension(1200, 500));
        setPreferredSize(new java.awt.Dimension(640, 666));
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                autenticar(evt);
            }
        });

        btnUsuario.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnUsuario.setForeground(new java.awt.Color(102, 102, 102));
        btnUsuario.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone usuario 128px azul padrao newton.png"))); // NOI18N
        btnUsuario.setText("Usuário");
        btnUsuario.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnUsuario.setPreferredSize(new java.awt.Dimension(200, 200));
        btnUsuario.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUsuarioActionPerformed(evt);
            }
        });
        jPanel1.add(btnUsuario);

        btnAluno.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnAluno.setForeground(new java.awt.Color(102, 102, 102));
        btnAluno.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone aluno 128px azul newton.png"))); // NOI18N
        btnAluno.setText("Aluno");
        btnAluno.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnAluno.setName(""); // NOI18N
        btnAluno.setPreferredSize(new java.awt.Dimension(200, 200));
        btnAluno.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnAluno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlunoActionPerformed(evt);
            }
        });
        jPanel1.add(btnAluno);

        btnEmpresa.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnEmpresa.setForeground(new java.awt.Color(102, 102, 102));
        btnEmpresa.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone empresa azul newton 128px.png"))); // NOI18N
        btnEmpresa.setText("Empresa");
        btnEmpresa.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnEmpresa.setPreferredSize(new java.awt.Dimension(200, 200));
        btnEmpresa.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnEmpresa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEmpresaActionPerformed(evt);
            }
        });
        jPanel1.add(btnEmpresa);

        btnContratos.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        btnContratos.setForeground(new java.awt.Color(102, 102, 102));
        btnContratos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone contrato 128px azul newton.png"))); // NOI18N
        btnContratos.setText("Contrato");
        btnContratos.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        btnContratos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnContratos.setPreferredSize(new java.awt.Dimension(200, 200));
        btnContratos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnContratos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnContratosActionPerformed(evt);
            }
        });
        jPanel2.add(btnContratos);

        BtnConvenio.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        BtnConvenio.setForeground(new java.awt.Color(102, 102, 102));
        BtnConvenio.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icone convênio 128px azul newton.png"))); // NOI18N
        BtnConvenio.setText("Convênio");
        BtnConvenio.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        BtnConvenio.setPreferredSize(new java.awt.Dimension(200, 200));
        BtnConvenio.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        BtnConvenio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnConvenioActionPerformed(evt);
            }
        });
        jPanel2.add(BtnConvenio);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/NEWTON.png"))); // NOI18N
        jLabel1.setText("Newton Paiva");
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        jLabel1.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        jPanel3.add(jLabel1);

        BtnFechar.setFont(new java.awt.Font("Times New Roman", 1, 12)); // NOI18N
        BtnFechar.setText("FECHAR");
        BtnFechar.setPreferredSize(new java.awt.Dimension(25, 25));
        BtnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnFecharActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 842, Short.MAX_VALUE)
            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BtnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(BtnFechar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEmpresaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEmpresaActionPerformed
        TelaEmpresa tela = new TelaEmpresa(this, true);
        tela.setVisible(true);
        tela.dispose();
    }//GEN-LAST:event_btnEmpresaActionPerformed

    private void autenticar(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_autenticar
       ImageIcon imagemTituloJanela = new ImageIcon(
               getClass().getResource("/LogoPequena.jpg"));
       setIconImage(imagemTituloJanela.getImage());
       TelaLogin tela = new TelaLogin(this, true);
       tela.setVisible(true);       
       if (!tela.isAutenticado()) {
           setVisible(false);
           dispose();
       }
       tela.dispose();
       
    }//GEN-LAST:event_autenticar

    private void jMenuItem1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jMenuItem1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jMenuItem1ActionPerformed

    private void btnContratosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnContratosActionPerformed
        
        TelaContrato tela = new TelaContrato(this, true);
        tela.setVisible(true);
        tela.dispose();
    }//GEN-LAST:event_btnContratosActionPerformed

    private void btnUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUsuarioActionPerformed
        TodosUsuarios tela = new TodosUsuarios(this, true);
        tela.setVisible(true);
        tela.dispose();
    }//GEN-LAST:event_btnUsuarioActionPerformed

    private void btnAlunoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlunoActionPerformed
        TodosAlunos tela = new TodosAlunos(this, true);
        tela.setVisible(true);
        tela.dispose();
    }//GEN-LAST:event_btnAlunoActionPerformed

    private void BtnConvenioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnConvenioActionPerformed
        TodosConvenios tela = new TodosConvenios(this, true);
        tela.setVisible(true);
        tela.dispose();
    }//GEN-LAST:event_BtnConvenioActionPerformed

    private void BtnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnFecharActionPerformed
        dispose();
    }//GEN-LAST:event_BtnFecharActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TelaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TelaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BtnConvenio;
    private javax.swing.JButton BtnFechar;
    private javax.swing.JButton btnAluno;
    private javax.swing.JButton btnContratos;
    private javax.swing.JButton btnEmpresa;
    private javax.swing.JButton btnUsuario;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
