/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paintball.dto;

import java.sql.Date;




/**
 *
 * @author alvaro
 */
public class Cliente {

    
    private int id;
    private String apellidos;
    private String contrasena;
    private String NIF;
    private String email;
    private Date fecha;
    private int Telefono;
    private String nombre;

    public Cliente(int id, String apellidos, String NIF, String nombre) {
        this.id = id;
        this.apellidos = apellidos;
        this.NIF = NIF;
        this.nombre = nombre;
    }

    public Cliente() {
    }
    
    

    public Cliente(int id, String apellidos, String contrasena, String NIF, String email, Date fecha, int Telefono, String nombre) {
        this.id = id;
        this.apellidos = apellidos;
        this.contrasena = contrasena;
        this.NIF = NIF;
        this.email = email;
        this.fecha = fecha;
        this.Telefono = Telefono;
        this.nombre = nombre;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContrasena() {
        return contrasena;
    }

    public void setContrasena(String contrasena) {
        this.contrasena = contrasena;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public int getTelefono() {
        return Telefono;
    }

    public void setTelefono(int Telefono) {
        this.Telefono = Telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    
}
