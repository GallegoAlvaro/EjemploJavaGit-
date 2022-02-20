/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paintball.interfaz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author alvaro
 */
public class Registro extends conexion {

    /**
     * Creates new form Registro
     */
    public Registro() {
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

        jTextField1 = new javax.swing.JTextField();
        botonregistror = new javax.swing.JButton();
        txtclienter = new javax.swing.JTextField();
        txtcontraseñar = new javax.swing.JTextField();
        txtapellidos = new javax.swing.JTextField();
        txttelefono = new javax.swing.JTextField();
        txtemail = new javax.swing.JTextField();
        txtnifr = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        salirr2 = new javax.swing.JButton();
        jDateChooser1 = new com.toedter.calendar.JDateChooser();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(51, 204, 255));

        botonregistror.setText("Registrarse");
        botonregistror.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botonregistrorActionPerformed(evt);
            }
        });

        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel1.setText("Nombre :");

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel2.setText("Contraseña :");

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel3.setText("Apellidos :");

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel4.setText("Telefono :");

        jLabel5.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel5.setText("Email :");

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel7.setText("NIF :");
        jLabel7.setVerticalTextPosition(javax.swing.SwingConstants.TOP);

        jLabel6.setText("BIENBENIDO AL MUNDO DEL  PAINTBALL");

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.RIGHT);
        jLabel8.setText("Fecha de nacimiento:");

        salirr2.setText("SALIR");
        salirr2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                salirr2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(59, 59, 59)
                .addComponent(botonregistror)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(salirr2)
                .addGap(80, 80, 80))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(3, 3, 3)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtclienter, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtapellidos, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txttelefono, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtemail, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtnifr, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(txtcontraseñar, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                            .addComponent(jDateChooser1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(94, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtclienter, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtcontraseñar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtapellidos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txttelefono, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtemail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(txtnifr, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jDateChooser1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botonregistror)
                    .addComponent(salirr2))
                .addGap(42, 42, 42))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void botonregistrorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botonregistrorActionPerformed
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://149.62.172.43/grupo2", "grupo2", "%Gyrl872");
                   
                Date fecha = jDateChooser1.getDate();
                
                String consulta = "insert into clientes (apellidos, contraseña, NIF, email, telefono, nombre, fecha_nacimiento)"
                        + "values ('"+txtapellidos.getText()+"', '"+txtcontraseñar.getText()+"', '"+txtnifr.getText()
                        +"', '"+txtemail.getText()+"', "+txttelefono.getText()+",'"+txtclienter.getText()
                        +"', '"+ new SimpleDateFormat("YYYY-MM-dd").format(fecha)+"')";
                PreparedStatement sentencia = conexion.prepareStatement(consulta);
                
                sentencia.executeUpdate();
                // TODO add your handling code here:
            } catch (SQLException ex) {
                Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Registro.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.setVisible(false);
        Login log = new Login();
        log.setVisible(true);
    }//GEN-LAST:event_botonregistrorActionPerformed

    
    
    private void salirr2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_salirr2ActionPerformed

        System.exit(0);
        // TODO add your handling code here:
    }//GEN-LAST:event_salirr2ActionPerformed

    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botonregistror;
    private com.toedter.calendar.JDateChooser jDateChooser1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JButton salirr2;
    private javax.swing.JTextField txtapellidos;
    private javax.swing.JTextField txtclienter;
    private javax.swing.JTextField txtcontraseñar;
    private javax.swing.JTextField txtemail;
    private javax.swing.JTextField txtnifr;
    private javax.swing.JTextField txttelefono;
    // End of variables declaration//GEN-END:variables
}
