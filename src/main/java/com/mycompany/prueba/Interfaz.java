/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.prueba;

import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.TextField;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import java.util.ArrayList;
import javax.swing.JTextField;


/**
 *
 * @author User
 */
public class Interfaz extends javax.swing.JFrame {
    Fondo fondo = new Fondo();
    /**a
     * Creates new form Interfaz
     */
    public Interfaz() {
        
        initComponents();
    }

   
  public static ArrayList <JTextField> Colorsito = new ArrayList<JTextField>();
   
    
  public static void Llenarcolorsito(){
      Colorsito.add(j1);
      Colorsito.add(j2);
      Colorsito.add(j3);
      Colorsito.add(j4);
      Colorsito.add(j5);
      Colorsito.add(j6);
      Colorsito.add(j7);
      Colorsito.add(j8);
      Colorsito.add(j9);
      Colorsito.add(j10);
      Colorsito.add(j11);
      Colorsito.add(j12);
      Colorsito.add(j13);
      Colorsito.add(j14);
      Colorsito.add(j15);
      Colorsito.add(j16);
      Colorsito.add(j17);
      Colorsito.add(j18);
      Colorsito.add(j19);
      Colorsito.add(j20);
      Colorsito.add(j21);
      Colorsito.add(j22);
      Colorsito.add(j23);
      Colorsito.add(j24);
      Colorsito.add(j25);
      Colorsito.add(j26);
      Colorsito.add(j27);
      Colorsito.add(j28);
      Colorsito.add(j29);
      Colorsito.add(j30);
      Colorsito.add(j31);
      Colorsito.add(j32);
      Colorsito.add(j32);
      Colorsito.add(j33);
      Colorsito.add(j34);
      Colorsito.add(j35);
      Colorsito.add(j36);
      Colorsito.add(j37);
      Colorsito.add(j38);
      Colorsito.add(j39);
      Colorsito.add(j40);
      Colorsito.add(j41);
      Colorsito.add(j42);
      Colorsito.add(j43);
      Colorsito.add(j44);
      Colorsito.add(j45);
      Colorsito.add(j46);
      Colorsito.add(j47);
      Colorsito.add(j48);
      Colorsito.add(j49);
      Colorsito.add(j50);
      
  }  
    
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnRegistrarPasajero = new javax.swing.JButton();
        btnEliminarPasajero = new javax.swing.JButton();
        btnEstadoAvion = new javax.swing.JButton();
        btnDatosPasajeros = new javax.swing.JButton();
        btnDatosEstadisticos = new javax.swing.JButton();
        pgAvion = new javax.swing.JProgressBar();
        jPanel1 = new javax.swing.JPanel();
        j1 = new javax.swing.JTextField();
        j2 = new javax.swing.JTextField();
        j3 = new javax.swing.JTextField();
        j4 = new javax.swing.JTextField();
        j5 = new javax.swing.JTextField();
        j6 = new javax.swing.JTextField();
        j7 = new javax.swing.JTextField();
        j8 = new javax.swing.JTextField();
        j9 = new javax.swing.JTextField();
        j10 = new javax.swing.JTextField();
        j11 = new javax.swing.JTextField();
        j14 = new javax.swing.JTextField();
        j13 = new javax.swing.JTextField();
        j12 = new javax.swing.JTextField();
        j15 = new javax.swing.JTextField();
        j16 = new javax.swing.JTextField();
        j17 = new javax.swing.JTextField();
        j18 = new javax.swing.JTextField();
        j19 = new javax.swing.JTextField();
        j20 = new javax.swing.JTextField();
        j21 = new javax.swing.JTextField();
        j22 = new javax.swing.JTextField();
        j23 = new javax.swing.JTextField();
        j24 = new javax.swing.JTextField();
        j25 = new javax.swing.JTextField();
        j26 = new javax.swing.JTextField();
        j27 = new javax.swing.JTextField();
        j28 = new javax.swing.JTextField();
        j29 = new javax.swing.JTextField();
        j30 = new javax.swing.JTextField();
        j31 = new javax.swing.JTextField();
        j32 = new javax.swing.JTextField();
        j33 = new javax.swing.JTextField();
        j34 = new javax.swing.JTextField();
        j35 = new javax.swing.JTextField();
        j36 = new javax.swing.JTextField();
        j37 = new javax.swing.JTextField();
        j38 = new javax.swing.JTextField();
        j39 = new javax.swing.JTextField();
        j40 = new javax.swing.JTextField();
        j41 = new javax.swing.JTextField();
        j42 = new javax.swing.JTextField();
        j43 = new javax.swing.JTextField();
        j44 = new javax.swing.JTextField();
        j45 = new javax.swing.JTextField();
        j46 = new javax.swing.JTextField();
        j47 = new javax.swing.JTextField();
        j48 = new javax.swing.JTextField();
        j49 = new javax.swing.JTextField();
        j50 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnRegistrarPasajero.setText("Registrar Pasajero");
        btnRegistrarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRegistrarPasajeroActionPerformed(evt);
            }
        });

        btnEliminarPasajero.setText("Eliminar Pasajero");
        btnEliminarPasajero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarPasajeroActionPerformed(evt);
            }
        });

        btnEstadoAvion.setText("Estado del avión");
        btnEstadoAvion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEstadoAvionActionPerformed(evt);
            }
        });

        btnDatosPasajeros.setText("Buscar Pasajero");
        btnDatosPasajeros.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosPasajerosActionPerformed(evt);
            }
        });

        btnDatosEstadisticos.setText("Datos estadisticos");
        btnDatosEstadisticos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDatosEstadisticosActionPerformed(evt);
            }
        });

        j1.setBackground(new java.awt.Color(0, 153, 0));
        j1.setForeground(new java.awt.Color(0, 153, 51));
        j1.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j1.setText("1");
        j1.setEnabled(false);
        j1.setOpaque(false);
        j1.setPreferredSize(new java.awt.Dimension(100, 24));
        j1.setSelectedTextColor(new java.awt.Color(102, 255, 0));
        j1.setSelectionColor(new java.awt.Color(51, 255, 0));

        j2.setBackground(new java.awt.Color(51, 255, 51));
        j2.setForeground(new java.awt.Color(51, 255, 51));
        j2.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j2.setText("2");
        j2.setEnabled(false);
        j2.setOpaque(false);
        j2.setPreferredSize(new java.awt.Dimension(100, 24));

        j3.setBackground(new java.awt.Color(51, 255, 51));
        j3.setForeground(new java.awt.Color(51, 255, 51));
        j3.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j3.setText("3");
        j3.setEnabled(false);
        j3.setOpaque(false);
        j3.setPreferredSize(new java.awt.Dimension(100, 24));

        j4.setBackground(new java.awt.Color(51, 255, 51));
        j4.setForeground(new java.awt.Color(51, 255, 51));
        j4.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j4.setText("4");
        j4.setEnabled(false);
        j4.setOpaque(false);
        j4.setPreferredSize(new java.awt.Dimension(100, 24));

        j5.setBackground(new java.awt.Color(51, 255, 51));
        j5.setForeground(new java.awt.Color(51, 255, 51));
        j5.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j5.setText("5");
        j5.setEnabled(false);
        j5.setOpaque(false);
        j5.setPreferredSize(new java.awt.Dimension(100, 24));

        j6.setBackground(new java.awt.Color(51, 255, 51));
        j6.setForeground(new java.awt.Color(51, 255, 51));
        j6.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j6.setText("6");
        j6.setEnabled(false);
        j6.setOpaque(false);
        j6.setPreferredSize(new java.awt.Dimension(100, 24));

        j7.setBackground(new java.awt.Color(51, 255, 51));
        j7.setForeground(new java.awt.Color(51, 255, 51));
        j7.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j7.setText("7");
        j7.setEnabled(false);
        j7.setOpaque(false);
        j7.setPreferredSize(new java.awt.Dimension(100, 24));

        j8.setBackground(new java.awt.Color(51, 255, 51));
        j8.setForeground(new java.awt.Color(51, 255, 51));
        j8.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j8.setText("8");
        j8.setEnabled(false);
        j8.setOpaque(false);
        j8.setPreferredSize(new java.awt.Dimension(100, 24));

        j9.setBackground(new java.awt.Color(51, 255, 51));
        j9.setForeground(new java.awt.Color(51, 255, 51));
        j9.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j9.setText("9");
        j9.setEnabled(false);
        j9.setOpaque(false);
        j9.setPreferredSize(new java.awt.Dimension(100, 24));

        j10.setBackground(new java.awt.Color(51, 255, 51));
        j10.setForeground(new java.awt.Color(51, 255, 51));
        j10.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j10.setText("10");
        j10.setEnabled(false);
        j10.setOpaque(false);
        j10.setPreferredSize(new java.awt.Dimension(100, 24));

        j11.setBackground(new java.awt.Color(51, 255, 51));
        j11.setForeground(new java.awt.Color(51, 255, 51));
        j11.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j11.setText("11");
        j11.setEnabled(false);
        j11.setOpaque(false);
        j11.setPreferredSize(new java.awt.Dimension(100, 24));

        j14.setBackground(new java.awt.Color(51, 255, 51));
        j14.setForeground(new java.awt.Color(51, 255, 51));
        j14.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j14.setText("14");
        j14.setEnabled(false);
        j14.setOpaque(false);
        j14.setPreferredSize(new java.awt.Dimension(100, 24));

        j13.setBackground(new java.awt.Color(51, 255, 51));
        j13.setForeground(new java.awt.Color(51, 255, 51));
        j13.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j13.setText("13");
        j13.setEnabled(false);
        j13.setOpaque(false);
        j13.setPreferredSize(new java.awt.Dimension(100, 24));

        j12.setBackground(new java.awt.Color(51, 255, 51));
        j12.setForeground(new java.awt.Color(51, 255, 51));
        j12.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j12.setText("12");
        j12.setEnabled(false);
        j12.setOpaque(false);
        j12.setPreferredSize(new java.awt.Dimension(100, 24));

        j15.setBackground(new java.awt.Color(51, 255, 51));
        j15.setForeground(new java.awt.Color(51, 255, 51));
        j15.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j15.setText("15");
        j15.setEnabled(false);
        j15.setOpaque(false);
        j15.setPreferredSize(new java.awt.Dimension(100, 24));

        j16.setBackground(new java.awt.Color(51, 255, 51));
        j16.setForeground(new java.awt.Color(51, 255, 51));
        j16.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j16.setText("16");
        j16.setEnabled(false);
        j16.setOpaque(false);
        j16.setPreferredSize(new java.awt.Dimension(100, 24));

        j17.setBackground(new java.awt.Color(51, 255, 51));
        j17.setForeground(new java.awt.Color(51, 255, 51));
        j17.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j17.setText("17");
        j17.setEnabled(false);
        j17.setOpaque(false);
        j17.setPreferredSize(new java.awt.Dimension(100, 24));

        j18.setBackground(new java.awt.Color(51, 255, 51));
        j18.setForeground(new java.awt.Color(51, 255, 51));
        j18.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j18.setText("18");
        j18.setEnabled(false);
        j18.setOpaque(false);
        j18.setPreferredSize(new java.awt.Dimension(100, 24));

        j19.setBackground(new java.awt.Color(51, 255, 51));
        j19.setForeground(new java.awt.Color(51, 255, 51));
        j19.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j19.setText("19");
        j19.setEnabled(false);
        j19.setOpaque(false);
        j19.setPreferredSize(new java.awt.Dimension(100, 24));

        j20.setBackground(new java.awt.Color(51, 255, 51));
        j20.setForeground(new java.awt.Color(51, 255, 51));
        j20.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j20.setText("20");
        j20.setEnabled(false);
        j20.setOpaque(false);
        j20.setPreferredSize(new java.awt.Dimension(100, 24));

        j21.setBackground(new java.awt.Color(51, 255, 51));
        j21.setForeground(new java.awt.Color(51, 255, 51));
        j21.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j21.setText("21");
        j21.setEnabled(false);
        j21.setOpaque(false);
        j21.setPreferredSize(new java.awt.Dimension(100, 24));

        j22.setBackground(new java.awt.Color(51, 255, 51));
        j22.setForeground(new java.awt.Color(51, 255, 51));
        j22.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j22.setText("22");
        j22.setEnabled(false);
        j22.setOpaque(false);
        j22.setPreferredSize(new java.awt.Dimension(100, 24));

        j23.setBackground(new java.awt.Color(51, 255, 51));
        j23.setForeground(new java.awt.Color(51, 255, 51));
        j23.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j23.setText("23");
        j23.setEnabled(false);
        j23.setOpaque(false);
        j23.setPreferredSize(new java.awt.Dimension(100, 24));

        j24.setBackground(new java.awt.Color(51, 255, 51));
        j24.setForeground(new java.awt.Color(51, 255, 51));
        j24.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j24.setText("24");
        j24.setEnabled(false);
        j24.setOpaque(false);
        j24.setPreferredSize(new java.awt.Dimension(100, 24));

        j25.setBackground(new java.awt.Color(51, 255, 51));
        j25.setForeground(new java.awt.Color(51, 255, 51));
        j25.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j25.setText("25");
        j25.setEnabled(false);
        j25.setOpaque(false);
        j25.setPreferredSize(new java.awt.Dimension(100, 24));

        j26.setBackground(new java.awt.Color(51, 255, 51));
        j26.setForeground(new java.awt.Color(51, 255, 51));
        j26.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j26.setText("26");
        j26.setEnabled(false);
        j26.setOpaque(false);
        j26.setPreferredSize(new java.awt.Dimension(100, 24));

        j27.setBackground(new java.awt.Color(51, 255, 51));
        j27.setForeground(new java.awt.Color(51, 255, 51));
        j27.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j27.setText("27");
        j27.setEnabled(false);
        j27.setOpaque(false);
        j27.setPreferredSize(new java.awt.Dimension(100, 24));

        j28.setBackground(new java.awt.Color(51, 255, 51));
        j28.setForeground(new java.awt.Color(51, 255, 51));
        j28.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j28.setText("28");
        j28.setEnabled(false);
        j28.setOpaque(false);
        j28.setPreferredSize(new java.awt.Dimension(100, 24));

        j29.setBackground(new java.awt.Color(51, 255, 51));
        j29.setForeground(new java.awt.Color(51, 255, 51));
        j29.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j29.setText("29");
        j29.setEnabled(false);
        j29.setOpaque(false);
        j29.setPreferredSize(new java.awt.Dimension(100, 24));

        j30.setBackground(new java.awt.Color(51, 255, 51));
        j30.setForeground(new java.awt.Color(51, 255, 51));
        j30.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j30.setText("30");
        j30.setEnabled(false);
        j30.setOpaque(false);
        j30.setPreferredSize(new java.awt.Dimension(100, 24));

        j31.setBackground(new java.awt.Color(51, 255, 51));
        j31.setForeground(new java.awt.Color(51, 255, 51));
        j31.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j31.setText("31");
        j31.setEnabled(false);
        j31.setOpaque(false);
        j31.setPreferredSize(new java.awt.Dimension(100, 24));

        j32.setBackground(new java.awt.Color(51, 255, 51));
        j32.setForeground(new java.awt.Color(51, 255, 51));
        j32.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j32.setText("32");
        j32.setEnabled(false);
        j32.setOpaque(false);
        j32.setPreferredSize(new java.awt.Dimension(100, 24));

        j33.setBackground(new java.awt.Color(51, 255, 51));
        j33.setForeground(new java.awt.Color(51, 255, 51));
        j33.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j33.setText("33");
        j33.setEnabled(false);
        j33.setOpaque(false);
        j33.setPreferredSize(new java.awt.Dimension(100, 24));

        j34.setBackground(new java.awt.Color(51, 255, 51));
        j34.setForeground(new java.awt.Color(51, 255, 51));
        j34.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j34.setText("34");
        j34.setEnabled(false);
        j34.setOpaque(false);
        j34.setPreferredSize(new java.awt.Dimension(100, 24));

        j35.setBackground(new java.awt.Color(51, 255, 51));
        j35.setForeground(new java.awt.Color(51, 255, 51));
        j35.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j35.setText("35");
        j35.setEnabled(false);
        j35.setOpaque(false);
        j35.setPreferredSize(new java.awt.Dimension(100, 24));

        j36.setBackground(new java.awt.Color(51, 255, 51));
        j36.setForeground(new java.awt.Color(51, 255, 51));
        j36.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j36.setText("36");
        j36.setEnabled(false);
        j36.setOpaque(false);
        j36.setPreferredSize(new java.awt.Dimension(100, 24));

        j37.setBackground(new java.awt.Color(51, 255, 51));
        j37.setForeground(new java.awt.Color(51, 255, 51));
        j37.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j37.setText("37");
        j37.setEnabled(false);
        j37.setOpaque(false);
        j37.setPreferredSize(new java.awt.Dimension(100, 24));

        j38.setBackground(new java.awt.Color(51, 255, 51));
        j38.setForeground(new java.awt.Color(51, 255, 51));
        j38.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j38.setText("38");
        j38.setEnabled(false);
        j38.setOpaque(false);
        j38.setPreferredSize(new java.awt.Dimension(100, 24));

        j39.setBackground(new java.awt.Color(51, 255, 51));
        j39.setForeground(new java.awt.Color(51, 255, 51));
        j39.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j39.setText("39");
        j39.setEnabled(false);
        j39.setOpaque(false);
        j39.setPreferredSize(new java.awt.Dimension(100, 24));

        j40.setBackground(new java.awt.Color(51, 255, 51));
        j40.setForeground(new java.awt.Color(51, 255, 51));
        j40.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j40.setText("40");
        j40.setEnabled(false);
        j40.setOpaque(false);
        j40.setPreferredSize(new java.awt.Dimension(100, 24));

        j41.setBackground(new java.awt.Color(51, 255, 51));
        j41.setForeground(new java.awt.Color(51, 255, 51));
        j41.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j41.setText("41");
        j41.setEnabled(false);
        j41.setOpaque(false);
        j41.setPreferredSize(new java.awt.Dimension(100, 24));

        j42.setBackground(new java.awt.Color(51, 255, 51));
        j42.setForeground(new java.awt.Color(51, 255, 51));
        j42.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j42.setText("42");
        j42.setEnabled(false);
        j42.setOpaque(false);
        j42.setPreferredSize(new java.awt.Dimension(100, 24));

        j43.setBackground(new java.awt.Color(51, 255, 51));
        j43.setForeground(new java.awt.Color(51, 255, 51));
        j43.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j43.setText("43");
        j43.setEnabled(false);
        j43.setOpaque(false);
        j43.setPreferredSize(new java.awt.Dimension(100, 24));

        j44.setBackground(new java.awt.Color(51, 255, 51));
        j44.setForeground(new java.awt.Color(51, 255, 51));
        j44.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j44.setText("44");
        j44.setEnabled(false);
        j44.setOpaque(false);
        j44.setPreferredSize(new java.awt.Dimension(100, 24));

        j45.setBackground(new java.awt.Color(51, 255, 51));
        j45.setForeground(new java.awt.Color(51, 255, 51));
        j45.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j45.setText("45");
        j45.setEnabled(false);
        j45.setOpaque(false);
        j45.setPreferredSize(new java.awt.Dimension(100, 24));

        j46.setBackground(new java.awt.Color(51, 255, 51));
        j46.setForeground(new java.awt.Color(51, 255, 51));
        j46.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j46.setText("46");
        j46.setEnabled(false);
        j46.setOpaque(false);
        j46.setPreferredSize(new java.awt.Dimension(100, 24));

        j47.setBackground(new java.awt.Color(51, 255, 51));
        j47.setForeground(new java.awt.Color(51, 255, 51));
        j47.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j47.setText("47");
        j47.setEnabled(false);
        j47.setOpaque(false);
        j47.setPreferredSize(new java.awt.Dimension(100, 24));

        j48.setBackground(new java.awt.Color(51, 255, 51));
        j48.setForeground(new java.awt.Color(51, 255, 51));
        j48.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j48.setText("48");
        j48.setEnabled(false);
        j48.setOpaque(false);
        j48.setPreferredSize(new java.awt.Dimension(100, 24));

        j49.setBackground(new java.awt.Color(51, 255, 51));
        j49.setForeground(new java.awt.Color(51, 255, 51));
        j49.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j49.setText("49");
        j49.setEnabled(false);
        j49.setOpaque(false);
        j49.setPreferredSize(new java.awt.Dimension(100, 24));

        j50.setBackground(new java.awt.Color(51, 255, 51));
        j50.setForeground(new java.awt.Color(51, 255, 51));
        j50.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        j50.setText("50");
        j50.setEnabled(false);
        j50.setOpaque(false);
        j50.setPreferredSize(new java.awt.Dimension(100, 24));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130)
                        .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(j45, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j39, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j33, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j27, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j21, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j15, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(j9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(j48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(j49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(j50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(24, 24, 24))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j6, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j7, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j8, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j10, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j11, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j14, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j13, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j12, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j15, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j16, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j17, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j18, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j19, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j20, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j24, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j25, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j26, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j27, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j28, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j29, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j30, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j32, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j33, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j34, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j35, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j36, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j37, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j38, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j39, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j40, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j41, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j42, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j43, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j44, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(j45, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j46, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j47, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j48, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j49, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(j50, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(62, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pgAvion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnRegistrarPasajero)
                            .addComponent(btnEstadoAvion))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnEliminarPasajero)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnDatosPasajeros))
                            .addComponent(btnDatosEstadisticos))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRegistrarPasajero)
                    .addComponent(btnEliminarPasajero)
                    .addComponent(btnDatosPasajeros))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEstadoAvion)
                    .addComponent(btnDatosEstadisticos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pgAvion, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(70, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRegistrarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRegistrarPasajeroActionPerformed
        // TODO add your handling code here:
        RegistrarPasajero Regis = new RegistrarPasajero();
        Regis.setVisible(true);
    }//GEN-LAST:event_btnRegistrarPasajeroActionPerformed

    private void btnEliminarPasajeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarPasajeroActionPerformed
        // TODO add your handling code here:
        EliminarPasajero Elim = new EliminarPasajero();
        Elim.setVisible(true);
    }//GEN-LAST:event_btnEliminarPasajeroActionPerformed

    private void btnEstadoAvionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEstadoAvionActionPerformed
        // TODO add your handling code here:
        
        if(Colorsito.isEmpty()){
            Llenarcolorsito();
        }
        for (int i=0; i<RegistrarPasajero.asientoReservado.size();i++){
            for (int j=0; j<Colorsito.size();j++){
                if(String.valueOf(RegistrarPasajero.asientoReservado.get(i)) == null ? Colorsito.get(j).getText() != null : !String.valueOf(RegistrarPasajero.asientoReservado.get(i)).equals(Colorsito.get(j).getText())){
                    
                    Colorsito.get(j).setBackground(Color.green);
                }
            }
        }
        for (int i=0; i<RegistrarPasajero.asientoReservado.size();i++){
            for (int j=0; j<Colorsito.size();j++){
                if(String.valueOf(RegistrarPasajero.asientoReservado.get(i)).equals(Colorsito.get(j).getText())){
                    Colorsito.get(j).setBackground(Color.red);
                }
            }
        }
        

    }//GEN-LAST:event_btnEstadoAvionActionPerformed

    private void btnDatosEstadisticosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosEstadisticosActionPerformed
        // TODO add your handling code here:
        DatosEstadisticos Data1 = new DatosEstadisticos();
        Data1.setVisible(true);
    }//GEN-LAST:event_btnDatosEstadisticosActionPerformed

    private void btnDatosPasajerosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDatosPasajerosActionPerformed
        // TODO add your handling code here:
        DatosPasajero Data = new DatosPasajero();
        Data.setVisible(true);
    }//GEN-LAST:event_btnDatosPasajerosActionPerformed

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
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Interfaz.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Interfaz().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDatosEstadisticos;
    private javax.swing.JButton btnDatosPasajeros;
    private javax.swing.JButton btnEliminarPasajero;
    private javax.swing.JButton btnEstadoAvion;
    private javax.swing.JButton btnRegistrarPasajero;
    public static javax.swing.JTextField j1;
    public static javax.swing.JTextField j10;
    public static javax.swing.JTextField j11;
    public static javax.swing.JTextField j12;
    public static javax.swing.JTextField j13;
    public static javax.swing.JTextField j14;
    public static javax.swing.JTextField j15;
    public static javax.swing.JTextField j16;
    public static javax.swing.JTextField j17;
    public static javax.swing.JTextField j18;
    public static javax.swing.JTextField j19;
    public static javax.swing.JTextField j2;
    public static javax.swing.JTextField j20;
    public static javax.swing.JTextField j21;
    public static javax.swing.JTextField j22;
    public static javax.swing.JTextField j23;
    public static javax.swing.JTextField j24;
    public static javax.swing.JTextField j25;
    public static javax.swing.JTextField j26;
    public static javax.swing.JTextField j27;
    public static javax.swing.JTextField j28;
    public static javax.swing.JTextField j29;
    public static javax.swing.JTextField j3;
    public static javax.swing.JTextField j30;
    public static javax.swing.JTextField j31;
    public static javax.swing.JTextField j32;
    public static javax.swing.JTextField j33;
    public static javax.swing.JTextField j34;
    public static javax.swing.JTextField j35;
    public static javax.swing.JTextField j36;
    public static javax.swing.JTextField j37;
    public static javax.swing.JTextField j38;
    public static javax.swing.JTextField j39;
    public static javax.swing.JTextField j4;
    public static javax.swing.JTextField j40;
    public static javax.swing.JTextField j41;
    public static javax.swing.JTextField j42;
    public static javax.swing.JTextField j43;
    public static javax.swing.JTextField j44;
    public static javax.swing.JTextField j45;
    public static javax.swing.JTextField j46;
    public static javax.swing.JTextField j47;
    public static javax.swing.JTextField j48;
    public static javax.swing.JTextField j49;
    public static javax.swing.JTextField j5;
    public static javax.swing.JTextField j50;
    public static javax.swing.JTextField j6;
    public static javax.swing.JTextField j7;
    public static javax.swing.JTextField j8;
    public static javax.swing.JTextField j9;
    private javax.swing.JPanel jPanel1;
    public static javax.swing.JProgressBar pgAvion;
    // End of variables declaration//GEN-END:variables
class Fondo extends JPanel {
    private Image imagen;
    
    @Override
    public void paint(Graphics g){
        imagen = new ImageIcon(getClass().getResource("Avion1.JPG")).getImage();
        g.drawImage(imagen,0,0, getWidth(), getHeight(),this);
        setOpaque(false);
        
        super.paint(g);
        
        
    }
    
}


}



