/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paintball.interfaz;

import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;

/**
 *
 * @author alvaro
 */
public class Equipamiento extends javax.swing.JFrame {

    /**
     * Creates new form Equipamiento
     */
    float totalarmas;
    float totalmunicion;
    float totaltrojos;
    float totalazules;
    float total;
    float totaltrajes;
    String total2 = "0.0";

    public Equipamiento() {
        initComponents();

        setLocationRelativeTo(this);        

        txtarmas.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {

                totalarmas = Integer.parseInt(txtarmas.getText()) * Float.parseFloat(txtprecioarma.getText());

            }

            @Override
            public void removeUpdate(DocumentEvent e) {

                if (txtarmas.getText().equals("") || txtarmas.getText().isBlank()) {

                    JOptionPane.showMessageDialog(rootPane, "Debes de introducir la cantidad de armas deseadas");

                }
            }

            @Override
            public void changedUpdate(DocumentEvent e) {

            }
        });
        
        txtmunicion.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                
                totalmunicion = Integer.parseInt(txtmunicion.getText()) * Float.parseFloat(txtpreciomunicion.getText());
            
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                
                 if (txtarmas.getText().equals("") || txtarmas.getText().isBlank()) {

                    JOptionPane.showMessageDialog(rootPane, "Debes de introducir la cantidad de munición deseadas");

                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
            }
        });
        
        
        txttrajesrojos.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                
                 totaltrojos = Integer.parseInt(txttrajesrojos.getText()) * Float.parseFloat(txtpreciotrajes.getText());
               
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                
                if (txtarmas.getText().equals("") || txtarmas.getText().isBlank()) {

                    JOptionPane.showMessageDialog(rootPane, "Debes de introducir la cantidad de trajes rojos deseados");

                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
        
        txttrajesazules.getDocument().addDocumentListener(new DocumentListener() {
            @Override
            public void insertUpdate(DocumentEvent e) {
                
                totalazules = Integer.parseInt(txttrajesazules.getText()) * Float.parseFloat(txtpreciotrajes.getText());
                
            }

            @Override
            public void removeUpdate(DocumentEvent e) {
                
                if (txtarmas.getText().equals("") || txtarmas.getText().isBlank()) {

                    JOptionPane.showMessageDialog(rootPane, "Debes de introducir la cantidad de trajes azules deseados");

                }
                
            }

            @Override
            public void changedUpdate(DocumentEvent e) {
                
            }
        });
        
        
        

        total2 = String.valueOf(total);

        txttotale.setText(total2);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDialog1 = new javax.swing.JDialog();
        jLabel5 = new javax.swing.JLabel();
        botoncampor = new javax.swing.JButton();
        botoninicioe2 = new javax.swing.JButton();
        botonsalirc2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonsalire = new javax.swing.JLabel();
        botonreservae = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        botoninicioe1 = new javax.swing.JButton();
        txtarmas = new javax.swing.JFormattedTextField();
        txttrajesrojos = new javax.swing.JFormattedTextField();
        txttrajesazules = new javax.swing.JFormattedTextField();
        txtmunicion = new javax.swing.JFormattedTextField();
        txtprecioarma = new javax.swing.JFormattedTextField();
        txtpreciomunicion = new javax.swing.JFormattedTextField();
        txtpreciotrajes = new javax.swing.JFormattedTextField();
        txttotale = new javax.swing.JFormattedTextField();

        jDialog1.setMinimumSize(new java.awt.Dimension(390, 180));

        jLabel5.setText("¿QUIERES RESERVAR UN CAMPO?");

        botoncampor.setText("RESERVAR CAMPO");
        botoncampor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoncamporActionPerformed(evt);
            }
        });

        botoninicioe2.setText("INICIO");
        botoninicioe2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoninicioe2ActionPerformed(evt);
            }
        });

        botonsalirc2.setText("SALIR");
        botonsalirc2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirc2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jDialog1Layout = new javax.swing.GroupLayout(jDialog1.getContentPane());
        jDialog1.getContentPane().setLayout(jDialog1Layout);
        jDialog1Layout.setHorizontalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 228, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(130, 130, 130)
                            .addComponent(botoncampor))
                        .addGroup(jDialog1Layout.createSequentialGroup()
                            .addGap(109, 109, 109)
                            .addComponent(botoninicioe2)
                            .addGap(47, 47, 47)
                            .addComponent(botonsalirc2))))
                .addContainerGap(90, Short.MAX_VALUE))
        );
        jDialog1Layout.setVerticalGroup(
            jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jDialog1Layout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botoncampor)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(jDialog1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botoninicioe2)
                    .addComponent(botonsalirc2))
                .addGap(38, 38, 38))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Cantidad de ARMAS:");

        jLabel2.setText("Cantidad de TRAJES ROJOS:");

        jLabel3.setText("Cantidad de MUNICION:");

        jLabel4.setText("Precio del ARMA");

        jLabel6.setText("Precio de la MUNICION");

        jLabel7.setText("Precio de los TRAJES:");

        botonsalire.setText("Precio TOTAL :");

        botonreservae.setText("RESERVA");
        botonreservae.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonreservaeActionPerformed(evt);
            }
        });

        botonsalir.setText("Salir");
        botonsalir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonsalirActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad de TRAJES AZULES:");

        jLabel9.setText("RESERVA DE EQUIPAMIENTO");

        botoninicioe1.setText("INICIO");
        botoninicioe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoninicioe1ActionPerformed(evt);
            }
        });

        txtarmas.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txttrajesrojos.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txttrajesazules.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtmunicion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0"))));

        txtprecioarma.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtpreciomunicion.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txtpreciotrajes.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        txttotale.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.NumberFormatter(new java.text.DecimalFormat("#0.00"))));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(63, 63, 63)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botonreservae)
                        .addGap(18, 18, 18)
                        .addComponent(botonsalir)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botonsalire, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(txttotale, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(118, 118, 118))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(16, 16, 16)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                    .addComponent(jLabel3)
                                                    .addComponent(jLabel1))))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(txttrajesrojos, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                                            .addComponent(txtarmas)))
                                    .addComponent(botoninicioe1, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtmunicion, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                                            .addComponent(txttrajesazules))))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(25, 25, 25)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addComponent(jLabel6)
                                            .addComponent(jLabel4)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtprecioarma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtpreciotrajes, javax.swing.GroupLayout.DEFAULT_SIZE, 109, Short.MAX_VALUE)
                                    .addComponent(txtpreciomunicion)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(40, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtarmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtprecioarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jLabel3)
                    .addComponent(txtmunicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtpreciomunicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(25, 25, 25)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txttrajesazules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(41, 41, 41)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtpreciotrajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txttrajesrojos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonsalir)
                            .addComponent(botonreservae))
                        .addGap(18, 46, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(botonsalire)
                            .addComponent(txttotale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(26, 26, 26)
                        .addComponent(botoninicioe1)
                        .addGap(14, 14, 14))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonreservaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreservaeActionPerformed

        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(this);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://149.62.172.43/grupo2", "grupo2", "%Gyrl872");
                
                totalarmas = Integer.parseInt(txtarmas.getText()) * Float.parseFloat(txtprecioarma.getText());

                totalmunicion = Integer.parseInt(txtmunicion.getText()) * Float.parseFloat(txtpreciomunicion.getText());

                totaltrojos = Integer.parseInt(txttrajesrojos.getText()) * Float.parseFloat(txtpreciotrajes.getText());

                totalazules = Integer.parseInt(txttrajesazules.getText()) * Float.parseFloat(txtpreciotrajes.getText());

                totaltrajes = totaltrojos + totalazules;

                total = totalarmas + totalmunicion + totaltrajes;

                String sql = "insert into equipamiento (precio_equipamiento_total, arma, precio_arma, municio, precio_municion, "
                        + "traje_azul, traje_rojo, precio_trajes) values (?,?,?,?,?,?,?,?)";

                PreparedStatement sentencia = conexion.prepareStatement(sql);

                sentencia.setFloat(1, total);
                sentencia.setInt(2, Integer.parseInt(txtarmas.getText()));
                sentencia.setFloat(3, totalarmas);
                sentencia.setInt(4, Integer.parseInt(txtmunicion.getText()));
                sentencia.setFloat(5, totalmunicion);
                sentencia.setInt(6, Integer.parseInt(txttrajesazules.getText()));
                sentencia.setInt(7, Integer.parseInt(txttrajesrojos.getText()));
                sentencia.setFloat(8, totaltrajes);

                sentencia.executeUpdate();
                
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }

     
    }//GEN-LAST:event_botonreservaeActionPerformed


    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_botonsalirActionPerformed

    private void botoncamporActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoncamporActionPerformed

        this.setVisible(false);
        Campo campo = new Campo();
        campo.setVisible(true);
        jDialog1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_botoncamporActionPerformed

    private void botoninicioe2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoninicioe2ActionPerformed

        this.setVisible(false);
        Login log = new Login();
        log.setVisible(true);
        jDialog1.setVisible(false);
        // TODO add your handling code here:
    }//GEN-LAST:event_botoninicioe2ActionPerformed

    private void botonsalirc2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirc2ActionPerformed
        System.exit(0);

        // TODO add your handling code here:
    }//GEN-LAST:event_botonsalirc2ActionPerformed

    private void botoninicioe1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botoninicioe1ActionPerformed
        this.setVisible(false);
        Login log = new Login();
        log.setVisible(true);

        // TODO add your handling code here:
    }//GEN-LAST:event_botoninicioe1ActionPerformed

    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botoncampor;
    private javax.swing.JButton botoninicioe1;
    private javax.swing.JButton botoninicioe2;
    private javax.swing.JButton botonreservae;
    private javax.swing.JButton botonsalir;
    private javax.swing.JButton botonsalirc2;
    private javax.swing.JLabel botonsalire;
    private javax.swing.JDialog jDialog1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JFormattedTextField txtarmas;
    private javax.swing.JFormattedTextField txtmunicion;
    private javax.swing.JFormattedTextField txtprecioarma;
    private javax.swing.JFormattedTextField txtpreciomunicion;
    private javax.swing.JFormattedTextField txtpreciotrajes;
    private javax.swing.JFormattedTextField txttotale;
    private javax.swing.JFormattedTextField txttrajesazules;
    private javax.swing.JFormattedTextField txttrajesrojos;
    // End of variables declaration//GEN-END:variables
}
