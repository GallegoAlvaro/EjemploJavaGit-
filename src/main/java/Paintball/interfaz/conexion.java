/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paintball.interfaz;

import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;

/**
 *
 * @author alvaro
 */
public class conexion extends JFrame {
    
    public conexion() {
    }

    private void botonregistrorActionPerformed(ActionEvent evt) {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            try {
                Connection conexion = (Connection) DriverManager.getConnection("jdbc:mysql://149.62.172.43/grupo2", "grupo2", "%Gyrl872");
                String consulta = "insert into clientes (apellidos, contraseña, NIF, email, telefono, nombre)" + "values ('LOpez Lopez', 'EturT5', '35467263C', 'LopeLope@yahoo.com', 546787365,'Martin')";
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
    }
    
}
