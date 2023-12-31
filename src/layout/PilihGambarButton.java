/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package layout;

import java.awt.CardLayout;

/**
 *
 * @author PUSPA
 */
public class PilihGambarButton extends javax.swing.JFrame {

    /**
     * Creates new form PilihGambarButton
     */
    public PilihGambarButton() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonPanel = new javax.swing.JPanel();
        btnGlassfish = new javax.swing.JButton();
        btnJavaee = new javax.swing.JButton();
        btnPostgresql = new javax.swing.JButton();
        btnExit = new javax.swing.JButton();
        imagePanel = new javax.swing.JPanel();
        lblGlassfish = new javax.swing.JLabel();
        lblJavaee = new javax.swing.JLabel();
        lblPostgresql = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnGlassfish.setText("GlassFish");
        btnGlassfish.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGlassfishActionPerformed(evt);
            }
        });
        buttonPanel.add(btnGlassfish);

        btnJavaee.setText("JavaEE");
        btnJavaee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnJavaeeActionPerformed(evt);
            }
        });
        buttonPanel.add(btnJavaee);

        btnPostgresql.setText("PostgreSQL");
        btnPostgresql.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostgresqlActionPerformed(evt);
            }
        });
        buttonPanel.add(btnPostgresql);

        btnExit.setText("Exit");
        btnExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExitActionPerformed(evt);
            }
        });
        buttonPanel.add(btnExit);

        getContentPane().add(buttonPanel, java.awt.BorderLayout.PAGE_START);

        imagePanel.setLayout(new java.awt.CardLayout());

        lblGlassfish.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/GlassFish.jpg"))); // NOI18N
        imagePanel.add(lblGlassfish, "0");

        lblJavaee.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/JavaEE.jpg"))); // NOI18N
        imagePanel.add(lblJavaee, "1");

        lblPostgresql.setIcon(new javax.swing.ImageIcon(getClass().getResource("/layout/PostgreSQL.jpg"))); // NOI18N
        imagePanel.add(lblPostgresql, "2");

        getContentPane().add(imagePanel, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnGlassfishActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGlassfishActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "0");
    }//GEN-LAST:event_btnGlassfishActionPerformed

    private void btnJavaeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnJavaeeActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "1");
    }//GEN-LAST:event_btnJavaeeActionPerformed

    private void btnPostgresqlActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostgresqlActionPerformed
        // TODO add your handling code here:
        CardLayout cl = (CardLayout)(imagePanel.getLayout());
        cl.show(imagePanel, "2");
    }//GEN-LAST:event_btnPostgresqlActionPerformed

    private void btnExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExitActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnExitActionPerformed

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
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PilihGambarButton.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PilihGambarButton().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExit;
    private javax.swing.JButton btnGlassfish;
    private javax.swing.JButton btnJavaee;
    private javax.swing.JButton btnPostgresql;
    private javax.swing.JPanel buttonPanel;
    private javax.swing.JPanel imagePanel;
    private javax.swing.JLabel lblGlassfish;
    private javax.swing.JLabel lblJavaee;
    private javax.swing.JLabel lblPostgresql;
    // End of variables declaration//GEN-END:variables
}
