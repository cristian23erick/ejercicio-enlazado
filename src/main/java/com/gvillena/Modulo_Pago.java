/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.gvillena;

/**
 *
 * @author ASUS
 */
public class Modulo_Pago extends javax.swing.JFrame {

    /**
     * Creates new form Modulo_Pago
     */
    public Modulo_Pago() {
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

        buttonGroup1 = new javax.swing.ButtonGroup();
        lblTitulo = new javax.swing.JLabel();
        lblTarjeta = new javax.swing.JLabel();
        RBVisa = new javax.swing.JRadioButton();
        RBMastercard = new javax.swing.JRadioButton();
        RBAmericanExprees = new javax.swing.JRadioButton();
        lblNumeroTitular = new javax.swing.JLabel();
        TFNombreTitular = new javax.swing.JTextField();
        lblNumeroTarjeta = new javax.swing.JLabel();
        TFNumeroTarjeta = new javax.swing.JTextField();
        lblCodigoSeguridad = new javax.swing.JLabel();
        TFCodigoSeguridad = new javax.swing.JTextField();
        lblFechaCaducidad = new javax.swing.JLabel();
        spDia = new javax.swing.JSpinner();
        spMes = new javax.swing.JSpinner();
        spAño = new javax.swing.JSpinner();
        lblImporteTotal = new javax.swing.JLabel();
        TFImporteTotal = new javax.swing.JTextField();
        btnConfirmarPedido = new javax.swing.JButton();
        lblVisaMasterExpressIMG = new javax.swing.JLabel();
        lblTVisaIMG = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblTitulo.setBackground(new java.awt.Color(51, 51, 255));
        lblTitulo.setFont(new java.awt.Font("BankGothic Lt BT", 1, 24)); // NOI18N
        lblTitulo.setText("Pago con Tarjeta");

        lblTarjeta.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        lblTarjeta.setText("Tarjeta:");

        RBVisa.setText("VISA");
        RBVisa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBVisaActionPerformed(evt);
            }
        });

        RBMastercard.setText("MASTER CARD");
        RBMastercard.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RBMastercardActionPerformed(evt);
            }
        });

        RBAmericanExprees.setText("AMERICAN EXPRESS");

        lblNumeroTitular.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        lblNumeroTitular.setText("Nombre del Titular:");

        lblNumeroTarjeta.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        lblNumeroTarjeta.setText("Numero de Tarjeta:");

        TFNumeroTarjeta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFNumeroTarjetaActionPerformed(evt);
            }
        });

        lblCodigoSeguridad.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        lblCodigoSeguridad.setText("CVV(Codigo de Seguridad):");

        TFCodigoSeguridad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFCodigoSeguridadActionPerformed(evt);
            }
        });

        lblFechaCaducidad.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        lblFechaCaducidad.setText("Fecha de caducidad de Tarjeta:");
        lblFechaCaducidad.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        lblFechaCaducidad.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        lblImporteTotal.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        lblImporteTotal.setText("Importe Total:");

        TFImporteTotal.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TFImporteTotalActionPerformed(evt);
            }
        });

        btnConfirmarPedido.setFont(new java.awt.Font("OCR A Extended", 1, 12)); // NOI18N
        btnConfirmarPedido.setText("CONFIRMAR PEDIDO");
        btnConfirmarPedido.setBorder(javax.swing.BorderFactory.createEmptyBorder(1, 1, 1, 1));

        lblVisaMasterExpressIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\VMEPAINT.png")); // NOI18N

        lblTVisaIMG.setIcon(new javax.swing.ImageIcon("C:\\Users\\ASUS\\Desktop\\TvisaPaint.png")); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(78, 78, 78)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 287, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblNumeroTitular)
                                            .addComponent(lblNumeroTarjeta))
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(TFNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(TFNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblCodigoSeguridad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(TFCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(lblFechaCaducidad)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(spDia, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spMes, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(spAño)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 486, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblImporteTotal)
                                .addGap(18, 18, 18)
                                .addComponent(TFImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblTVisaIMG)))
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblTarjeta)
                        .addGap(165, 165, 165))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblVisaMasterExpressIMG)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(RBVisa)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(RBMastercard)))
                        .addGap(36, 36, 36)))
                .addComponent(RBAmericanExprees)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(lblTitulo)
                .addGap(33, 33, 33)
                .addComponent(lblTarjeta)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(RBVisa)
                    .addComponent(RBAmericanExprees)
                    .addComponent(RBMastercard))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblTVisaIMG))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(lblVisaMasterExpressIMG)
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroTitular)
                            .addComponent(TFNombreTitular, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblNumeroTarjeta)
                            .addComponent(TFNumeroTarjeta, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblCodigoSeguridad)
                            .addComponent(TFCodigoSeguridad, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFechaCaducidad, javax.swing.GroupLayout.DEFAULT_SIZE, 33, Short.MAX_VALUE)
                    .addComponent(spDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spMes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(spAño, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblImporteTotal)
                            .addComponent(TFImporteTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(52, 52, 52))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnConfirmarPedido, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RBVisaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBVisaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBVisaActionPerformed

    private void RBMastercardActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RBMastercardActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_RBMastercardActionPerformed

    private void TFNumeroTarjetaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFNumeroTarjetaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFNumeroTarjetaActionPerformed

    private void TFCodigoSeguridadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFCodigoSeguridadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFCodigoSeguridadActionPerformed

    private void TFImporteTotalActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TFImporteTotalActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TFImporteTotalActionPerformed

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
            java.util.logging.Logger.getLogger(Modulo_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Modulo_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Modulo_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Modulo_Pago.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Modulo_Pago().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton RBAmericanExprees;
    private javax.swing.JRadioButton RBMastercard;
    private javax.swing.JRadioButton RBVisa;
    private javax.swing.JTextField TFCodigoSeguridad;
    private javax.swing.JTextField TFImporteTotal;
    private javax.swing.JTextField TFNombreTitular;
    private javax.swing.JTextField TFNumeroTarjeta;
    private javax.swing.JButton btnConfirmarPedido;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel lblCodigoSeguridad;
    private javax.swing.JLabel lblFechaCaducidad;
    private javax.swing.JLabel lblImporteTotal;
    private javax.swing.JLabel lblNumeroTarjeta;
    private javax.swing.JLabel lblNumeroTitular;
    private javax.swing.JLabel lblTVisaIMG;
    private javax.swing.JLabel lblTarjeta;
    private javax.swing.JLabel lblTitulo;
    private javax.swing.JLabel lblVisaMasterExpressIMG;
    private javax.swing.JSpinner spAño;
    private javax.swing.JSpinner spDia;
    private javax.swing.JSpinner spMes;
    // End of variables declaration//GEN-END:variables
}
