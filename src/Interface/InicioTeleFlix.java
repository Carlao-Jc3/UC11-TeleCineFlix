package Interface;
public class InicioTeleFlix extends javax.swing.JFrame {

    public InicioTeleFlix() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLimp1 = new javax.swing.JButton();
        btnLimp4 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        btnLimp3 = new javax.swing.JButton();
        btnCad = new javax.swing.JButton();
        btnLimp6 = new javax.swing.JButton();

        btnLimp1.setBackground(new java.awt.Color(255, 0, 0));
        btnLimp1.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnLimp1.setForeground(new java.awt.Color(255, 255, 255));
        btnLimp1.setText("Limpar");
        btnLimp1.setBorder(new javax.swing.border.MatteBorder(null));
        btnLimp1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimp1ActionPerformed(evt);
            }
        });

        btnLimp4.setBackground(new java.awt.Color(255, 0, 0));
        btnLimp4.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnLimp4.setForeground(new java.awt.Color(255, 255, 255));
        btnLimp4.setText("...");
        btnLimp4.setBorder(new javax.swing.border.MatteBorder(null));
        btnLimp4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimp4ActionPerformed(evt);
            }
        });

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 0, 0));

        jPanel1.setBackground(new java.awt.Color(16, 16, 16));

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Showcard Gothic", 0, 48)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 0, 0));
        jLabel1.setText("Cenaflix");

        btnLimp3.setBackground(new java.awt.Color(255, 0, 0));
        btnLimp3.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnLimp3.setForeground(new java.awt.Color(255, 255, 255));
        btnLimp3.setText("...");
        btnLimp3.setBorder(new javax.swing.border.MatteBorder(null));
        btnLimp3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimp3ActionPerformed(evt);
            }
        });

        btnCad.setBackground(new java.awt.Color(255, 0, 0));
        btnCad.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnCad.setForeground(new java.awt.Color(255, 255, 255));
        btnCad.setText("Cadastro Filmes");
        btnCad.setBorder(new javax.swing.border.MatteBorder(null));
        btnCad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadActionPerformed(evt);
            }
        });

        btnLimp6.setBackground(new java.awt.Color(255, 0, 0));
        btnLimp6.setFont(new java.awt.Font("Segoe UI Black", 0, 14)); // NOI18N
        btnLimp6.setForeground(new java.awt.Color(255, 255, 255));
        btnLimp6.setText("...");
        btnLimp6.setBorder(new javax.swing.border.MatteBorder(null));
        btnLimp6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimp6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(66, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(57, 57, 57))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimp3, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLimp6, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(104, 104, 104))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(btnLimp3, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnLimp6, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnCad, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(50, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(65, 65, 65))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimp1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimp1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimp1ActionPerformed

    private void btnLimp3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimp3ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimp3ActionPerformed

    private void btnLimp4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimp4ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimp4ActionPerformed

    private void btnCadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnCadActionPerformed

    private void btnLimp6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimp6ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimp6ActionPerformed

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
            java.util.logging.Logger.getLogger(InicioTeleFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InicioTeleFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InicioTeleFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InicioTeleFlix.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InicioTeleFlix().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCad;
    private javax.swing.JButton btnLimp1;
    private javax.swing.JButton btnLimp3;
    private javax.swing.JButton btnLimp4;
    private javax.swing.JButton btnLimp6;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
