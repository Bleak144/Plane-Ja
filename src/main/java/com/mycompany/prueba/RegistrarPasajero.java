/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;
import static com.mycompany.prueba.Interfaz.pgAvion;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 *
 * @author User
 */
public class RegistrarPasajero extends javax.swing.JFrame {

    /**
     * Creates new form RegistrarPasajero
     */
    public RegistrarPasajero() {
        initComponents();
    }
    
   public static ArrayList <String> D1 = new ArrayList<String>();
   public static ArrayList <Integer> ejecutivoVentana = new ArrayList <Integer>();
   public static ArrayList <Integer> ejecutivoPasillo = new ArrayList <Integer>();
   public static ArrayList <Integer> economicoVentana = new ArrayList <Integer>();
   public static ArrayList <Integer> economicoCentro = new ArrayList <Integer>();
   public static ArrayList <Integer> economicoPasillo = new ArrayList <Integer>();
   public static ArrayList <Integer> asientoReservado = new ArrayList <Integer>();
   
   public static void Lista(){
       ejecutivoVentana.add(1);
       ejecutivoVentana.add(5);
        ejecutivoVentana.add(4);
       ejecutivoVentana.add(8);

        ejecutivoPasillo.add(2);
        ejecutivoPasillo.add(6);
        ejecutivoPasillo.add(3);
        ejecutivoPasillo.add(7);

        economicoVentana.add(9);
        economicoVentana.add(15);
        economicoVentana.add(21);
        economicoVentana.add(27);
        economicoVentana.add(33);
        economicoVentana.add(39);
        economicoVentana.add(45);
        economicoVentana.add(14);
        economicoVentana.add(20);
        economicoVentana.add(26);
        economicoVentana.add(32);
        economicoVentana.add(38);
        economicoVentana.add(44);
        economicoVentana.add(50);

        economicoCentro.add(10);
        economicoCentro.add(16);
        economicoCentro.add(22);
        economicoCentro.add(28);
        economicoCentro.add(34);
        economicoCentro.add(40);
        economicoCentro.add(46);
        economicoCentro.add(13);
        economicoCentro.add(19);
        economicoCentro.add(25);
        economicoCentro.add(31);
        economicoCentro.add(37);
        economicoCentro.add(43);
        economicoCentro.add(49);

        economicoPasillo.add(11);
        economicoPasillo.add(17);
        economicoPasillo.add(23);
        economicoPasillo.add(29);
        economicoPasillo.add(35);
        economicoPasillo.add(41);
        economicoPasillo.add(47);
        economicoPasillo.add(12);
        economicoPasillo.add(18);
        economicoPasillo.add(24);
        economicoPasillo.add(30);
        economicoPasillo.add(36);
        economicoPasillo.add(42);
        economicoPasillo.add(48);
        
        
        
        
   }
   
    private void llenarUbicacion(int clase){
        cmbUbicacion.removeAllItems();
        if (clase==0){
            cmbUbicacion.addItem("Ventana");
            cmbUbicacion.addItem("Pasillo");
        }
        else if (clase==1){
            cmbUbicacion.addItem("Ventana");
            cmbUbicacion.addItem("Centro");
            cmbUbicacion.addItem("Pasillo");
        }
    }
    
    public void condicion(String clase, String Ubicacion){
        
        String asignar;
        if ("Clase Ejecutiva".equals(clase)){
            if ("Ventana".equals(Ubicacion)){
                asignar = String.valueOf(ejecutivoVentana.get(0));
                D1.add(asignar);
                asientoReservado.add(ejecutivoVentana.get(0));
                ejecutivoVentana.remove(0);
            }
            else if ("Pasillo".equals(Ubicacion)){
                asignar = String.valueOf(ejecutivoPasillo.get(0));
                D1.add(asignar);
                asientoReservado.add(ejecutivoPasillo.get(0));
                ejecutivoPasillo.remove(0);
            }
        }
        else if ("Clase Economica".equals(clase)){
            if ("Ventana".equals(Ubicacion)){
                asignar = String.valueOf(economicoVentana.get(0));
                D1.add(asignar);
                asientoReservado.add(economicoVentana.get(0));
                economicoVentana.remove(0);
            }
            else if ("Pasillo".equals(Ubicacion)){
                asignar = String.valueOf(economicoPasillo.get(0));
                D1.add(asignar);
                asientoReservado.add(economicoPasillo.get(0));
                economicoPasillo.remove(0);
            }
            else if ("Centro".equals(Ubicacion)){
                asignar = String.valueOf(economicoCentro.get(0));
                D1.add(asignar);
                asientoReservado.add(economicoCentro.get(0));
                economicoCentro.remove(0);
            }
        }
             
    }
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        buttonGroup4 = new javax.swing.ButtonGroup();
        buttonGroup5 = new javax.swing.ButtonGroup();
        buttonGroup6 = new javax.swing.ButtonGroup();
        buttonGroup7 = new javax.swing.ButtonGroup();
        buttonGroup8 = new javax.swing.ButtonGroup();
        buttonGroup9 = new javax.swing.ButtonGroup();
        buttonGroup10 = new javax.swing.ButtonGroup();
        buttonGroup11 = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtCedula = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        CmbClase = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        cmbUbicacion = new javax.swing.JComboBox<>();
        btnAceptar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        RadioMasculino = new javax.swing.JRadioButton();
        RadioFemenino = new javax.swing.JRadioButton();
        jLabel7 = new javax.swing.JLabel();
        txtEdad = new javax.swing.JTextField();

        jTextArea1.setColumns(20);
        jTextArea1.setRows(5);
        jScrollPane1.setViewportView(jTextArea1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Datos Pasajero");

        jLabel2.setText("Cedula");

        txtCedula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCedulaActionPerformed(evt);
            }
        });

        jLabel3.setText("Nombre");

        jLabel4.setText("Clase");

        CmbClase.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Clase Ejecutiva", "Clase Economica" }));
        CmbClase.setToolTipText("");
        CmbClase.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CmbClaseActionPerformed(evt);
            }
        });

        jLabel5.setText("Ubicación");

        cmbUbicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUbicacionActionPerformed(evt);
            }
        });

        btnAceptar.setText("Aceptar");
        btnAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAceptarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel6.setText("Sexo");

        buttonGroup1.add(RadioMasculino);
        RadioMasculino.setSelected(true);
        RadioMasculino.setText("Masculino");
        RadioMasculino.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RadioMasculinoActionPerformed(evt);
            }
        });

        buttonGroup1.add(RadioFemenino);
        RadioFemenino.setText("Femenino");

        jLabel7.setText("Edad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(38, 38, 38)
                        .addComponent(btnAceptar)
                        .addGap(68, 68, 68)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel2)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(6, 6, 6)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel6)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                .addComponent(RadioMasculino))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(jLabel7)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtEdad)))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(RadioFemenino)))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel5))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(CmbClase, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))))
                .addGap(15, 15, 15))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCedula, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(RadioMasculino)
                    .addComponent(RadioFemenino))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtEdad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(CmbClase, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(21, 21, 21)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnAceptar)
                    .addComponent(btnCancelar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void RadioMasculinoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RadioMasculinoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_RadioMasculinoActionPerformed

    private void cmbUbicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUbicacionActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cmbUbicacionActionPerformed

    private void btnAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAceptarActionPerformed
        // TODO add your handling code here:
        
        String cedula = txtCedula.getText();
        String nombre = txtNombre.getText();
        String Edad = txtEdad.getText();
        
        String clase = CmbClase.getSelectedItem().toString();
        String Ubicacion = cmbUbicacion.getSelectedItem().toString();
        String sexo;
        if (RadioMasculino.isSelected()){
            sexo = "Masculino";
        }
        else{
            sexo = "Femenino";
        }
        
        if (ejecutivoVentana.isEmpty() && asientoReservado.isEmpty()){
            Lista();
        }
        
    
        
             
        if ("Clase Ejecutiva".equals(clase)){
            if ("Ventana".equals(Ubicacion) && ejecutivoVentana.isEmpty() || "Pasillo".equals(Ubicacion) && ejecutivoPasillo.isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay asientos disponibles en esas posición.");
                return;
            }
        }
        else if ("Clase Economica".equals(clase)){
            if ("Ventana".equals(Ubicacion) && economicoVentana.isEmpty() || "Pasillo".equals(Ubicacion) && economicoPasillo.isEmpty() || "Centro".equals(Ubicacion) && economicoCentro.isEmpty()){
                JOptionPane.showMessageDialog(null, "No hay asientos disponibles en esas posición.");
                return;
            }
        }
        
        if (txtCedula.getText().length()==0 ){
            JOptionPane.showMessageDialog(null, "El campo de cedúla esta vacío.");
            return;
        }
        if (txtNombre.getText().length()==0){
            JOptionPane.showMessageDialog(null, "El campo de Nombre esta vacío.");
            return;
        }
        if (txtEdad.getText().length()==0){
            JOptionPane.showMessageDialog(null, "El campo de Edad esta vacío.");
            return;
        }
       
        
        
        
    
        D1.add(cedula);
        if(D1.size()>1){ 
            for (int i=0; i<D1.size()+1;i=+8){
                if(D1.get(i) == null ? cedula == null : D1.get(i).equals(cedula)){
                    JOptionPane.showMessageDialog(null, "Ya la cedúla esta asignada.");
                    D1.remove(D1.size()-1);
                    return;
                }
                break;
            }
        }
                
        D1.add(nombre);
        D1.add(Edad);
        D1.add(sexo);
        D1.add(clase);
        D1.add(Ubicacion);
        
        
        Lista();
        condicion(clase,Ubicacion);
        
        
        
        System.out.println(D1);
        System.out.println(asientoReservado);
        dispose();
        Interfaz.pgAvion.setValue(RegistrarPasajero.asientoReservado.size()*100/50);
    }//GEN-LAST:event_btnAceptarActionPerformed

    
    
    private void CmbClaseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CmbClaseActionPerformed
        // TODO add your handling code here:
       llenarUbicacion(CmbClase.getSelectedIndex());
        
    }//GEN-LAST:event_CmbClaseActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtCedulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCedulaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCedulaActionPerformed

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
            java.util.logging.Logger.getLogger(RegistrarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegistrarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegistrarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegistrarPasajero.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegistrarPasajero().setVisible(true);
            }
        });
        
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CmbClase;
    private javax.swing.JRadioButton RadioFemenino;
    private javax.swing.JRadioButton RadioMasculino;
    private javax.swing.JButton btnAceptar;
    private javax.swing.JButton btnCancelar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup10;
    private javax.swing.ButtonGroup buttonGroup11;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.ButtonGroup buttonGroup4;
    private javax.swing.ButtonGroup buttonGroup5;
    private javax.swing.ButtonGroup buttonGroup6;
    private javax.swing.ButtonGroup buttonGroup7;
    private javax.swing.ButtonGroup buttonGroup8;
    private javax.swing.ButtonGroup buttonGroup9;
    private javax.swing.JComboBox<String> cmbUbicacion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    private javax.swing.JTextField txtCedula;
    private javax.swing.JTextField txtEdad;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
