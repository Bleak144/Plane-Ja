/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class EliminarPasajero extends javax.swing.JFrame {

    /**
     * Creates new form EliminarPasajero
     */
    public EliminarPasajero() {
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

        jLabel1 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        btnAceptar = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Ingrese número de cédula");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        jButton2.setText("Cancelar");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel2.setText("Eliminar pasajero");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(btnAceptar))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(18, 18, 18)
                                .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addComponent(jButton2)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(jButton2))
                .addContainerGap(26, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed


    String Cedula = txtCedula.getText();
    int asiento = 0;
       if (RegistrarPasajero.D1.contains(Cedula)){
        for (int i=0; i<RegistrarPasajero.D1.size(); i+=7){
            if (Cedula.equals(RegistrarPasajero.D1.get(i))){
                asiento = Integer.parseInt(RegistrarPasajero.D1.get(i+6));
                if ("Clase Ejecutiva".equals(RegistrarPasajero.D1.get(i+4))){
                    if ("Ventana".equals(RegistrarPasajero.D1.get(i+5))){
                        RegistrarPasajero.ejecutivoVentana.add(asiento);
                        for (int j=0; j<RegistrarPasajero.asientoReservado.size(); j++){
                            if(asiento==RegistrarPasajero.asientoReservado.get(j)){
                                 RegistrarPasajero.asientoReservado.remove(j);
                            }
                        }
                    }
                    else{
                        RegistrarPasajero.ejecutivoPasillo.add(asiento);
                            for (int j=0; j<RegistrarPasajero.asientoReservado.size(); j++){
                                if(asiento==RegistrarPasajero.asientoReservado.get(j)){
                                 RegistrarPasajero.asientoReservado.remove(j);
                                }
                            }   
                    }
                }
                else{
                    if ("Ventana".equals(RegistrarPasajero.D1.get(i+5))){
                        RegistrarPasajero.economicoVentana.add(asiento);
                        for (int j=0; j<RegistrarPasajero.asientoReservado.size(); j++){
                            if(asiento==RegistrarPasajero.asientoReservado.get(j)){
                                 RegistrarPasajero.asientoReservado.remove(j);
                            }
                        }
                    }
                    else if ("Centro".equals(RegistrarPasajero.D1.get(i+5))){
                        RegistrarPasajero.economicoCentro.add(asiento);
                            for (int j=0; j<RegistrarPasajero.asientoReservado.size(); j++){
                                if(asiento==RegistrarPasajero.asientoReservado.get(j)){
                                 RegistrarPasajero.asientoReservado.remove(j);
                                }
                            }
                    }
                    else{
                        RegistrarPasajero.economicoPasillo.add(asiento);
                            for (int j=0; j<RegistrarPasajero.asientoReservado.size(); j++){
                                if(asiento==RegistrarPasajero.asientoReservado.get(j)){
                                 RegistrarPasajero.asientoReservado.remove(j);
                                }
                            }
                    }
                }
                RegistrarPasajero.D1.remove(i);
                RegistrarPasajero.D1.remove(i);
                RegistrarPasajero.D1.remove(i);
                RegistrarPasajero.D1.remove(i);
                RegistrarPasajero.D1.remove(i);
                RegistrarPasajero.D1.remove(i);
                RegistrarPasajero.D1.remove(i);                
                JOptionPane.showMessageDialog(null,"La reservación ha sido eliminada.");
                
            }
        }
       }
        else{
            JOptionPane.showMessageDialog(null,"La persona no tiene ningun asiento reservado.");
            txtCedula.setText("");
            }

    dispose ();
    System.out.println(RegistrarPasajero.D1);
    System.out.println(RegistrarPasajero.asientoReservado);
    Interfaz.pgAvion.setValue(RegistrarPasajero.asientoReservado.size()*100/50);
    }//GEN-LAST:event_btnAceptarActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

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
            java.util.logging.Logger.getLogger(EliminarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EliminarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EliminarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EliminarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EliminarPasajero().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JTextField txtCedula;
    // End of variables declaration//GEN-END:variables
}