/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paintball.interfaz;

/**
 *
 * @author alvaro
 */
public class Equipamiento extends javax.swing.JFrame {

    /**
     * Creates new form Equipamiento
     */
    public Equipamiento() {
        initComponents();
        setLocationRelativeTo(this);
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
        txttrajesrojos = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        botonsalire = new javax.swing.JLabel();
        botonreservae = new javax.swing.JButton();
        botonsalir = new javax.swing.JButton();
        txttotale = new javax.swing.JTextField();
        txtmunicion = new javax.swing.JTextField();
        txtarmas = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txttrajesazules = new javax.swing.JTextField();
        txtpreciotrajes = new javax.swing.JTextField();
        txtpreciomunicion = new javax.swing.JTextField();
        txtprecioarma = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        botoninicioe1 = new javax.swing.JButton();

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

        txttrajesrojos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrajesrojosActionPerformed(evt);
            }
        });

        jLabel2.setText("Cantidad de TRAJES ROJOS:");

        jLabel3.setText("Cantidad de MUNICION:");

        jLabel4.setText("Precio del ARMA");

        jLabel6.setText("Precio de la Municion");

        jLabel7.setText("Precio de los TREAJES");

        botonsalire.setText("Precio total :");

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

        txtmunicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtmunicionActionPerformed(evt);
            }
        });

        txtarmas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtarmasActionPerformed(evt);
            }
        });

        jLabel8.setText("Cantidad de TRAJES AZULES:");

        txttrajesazules.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txttrajesazulesActionPerformed(evt);
            }
        });

        txtpreciotrajes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreciotrajesActionPerformed(evt);
            }
        });

        txtpreciomunicion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtpreciomunicionActionPerformed(evt);
            }
        });

        txtprecioarma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtprecioarmaActionPerformed(evt);
            }
        });

        jLabel9.setText("RESERVA DE EQUIPAMIENTO");

        botoninicioe1.setText("INICIO");
        botoninicioe1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botoninicioe1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(botonreservae)
                                .addGap(18, 18, 18)
                                .addComponent(botonsalir)
                                .addGap(61, 61, 61)
                                .addComponent(botonsalire, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txttotale, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(35, 35, 35)
                                        .addComponent(jLabel1)
                                        .addGap(18, 18, 18)
                                        .addComponent(txtarmas, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txttrajesrojos, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 155, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(txtpreciotrajes, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txttrajesazules, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(txtmunicion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel4)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtprecioarma, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                            .addComponent(jLabel6)
                                            .addGap(18, 18, 18)
                                            .addComponent(txtpreciomunicion, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(163, 163, 163)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(251, 251, 251)
                        .addComponent(botoninicioe1)))
                .addContainerGap(70, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(jLabel9)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3)
                    .addComponent(txtmunicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtarmas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txttrajesrojos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6)
                    .addComponent(txtpreciomunicion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txttrajesazules, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(txtprecioarma, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtpreciotrajes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonsalir)
                    .addComponent(botonreservae)
                    .addComponent(botonsalire)
                    .addComponent(txttotale, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(botoninicioe1)
                .addContainerGap(8, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonreservaeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonreservaeActionPerformed

        jDialog1.setVisible(true);
        jDialog1.setLocationRelativeTo(this);

        // TODO add your handling code here:
    }//GEN-LAST:event_botonreservaeActionPerformed

    private void botonsalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonsalirActionPerformed

        System.exit(0);
    }//GEN-LAST:event_botonsalirActionPerformed

    private void txttrajesrojosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrajesrojosActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrajesrojosActionPerformed

    private void txtmunicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtmunicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtmunicionActionPerformed

    private void txtarmasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtarmasActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtarmasActionPerformed

    private void txttrajesazulesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txttrajesazulesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txttrajesazulesActionPerformed

    private void txtpreciotrajesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreciotrajesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreciotrajesActionPerformed

    private void txtpreciomunicionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtpreciomunicionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtpreciomunicionActionPerformed

    private void txtprecioarmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtprecioarmaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtprecioarmaActionPerformed

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
    private javax.swing.JTextField txtarmas;
    private javax.swing.JTextField txtmunicion;
    private javax.swing.JTextField txtprecioarma;
    private javax.swing.JTextField txtpreciomunicion;
    private javax.swing.JTextField txtpreciotrajes;
    private javax.swing.JTextField txttotale;
    private javax.swing.JTextField txttrajesazules;
    private javax.swing.JTextField txttrajesrojos;
    // End of variables declaration//GEN-END:variables
}
