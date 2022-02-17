/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paintball.dto;

/**
 *
 * @author alvaro
 */
public class facturas {
    private int id;
    private int campoid;
    private int clienteid;
    private int equipamientoid;
    private String NIF;
    private String nombre_cliente;
    private float precio_equipamiento;
    private float precio_campo;
    private float precio_total;
    private int horas_reservadas;

    public facturas(int id, int campoid, int clienteid, int equipamientoid, String NIF, String nombre_cliente, float precio_equipamiento, float precio_campo, float precio_total, int horas_reservadas) {
        this.id = id;
        this.campoid = campoid;
        this.clienteid = clienteid;
        this.equipamientoid = equipamientoid;
        this.NIF = NIF;
        this.nombre_cliente = nombre_cliente;
        this.precio_equipamiento = precio_equipamiento;
        this.precio_campo = precio_campo;
        this.precio_total = precio_total;
        this.horas_reservadas = horas_reservadas;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCampoid() {
        return campoid;
    }

    public void setCampoid(int campoid) {
        this.campoid = campoid;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public int getEquipamientoid() {
        return equipamientoid;
    }

    public void setEquipamientoid(int equipamientoid) {
        this.equipamientoid = equipamientoid;
    }

    public String getNIF() {
        return NIF;
    }

    public void setNIF(String NIF) {
        this.NIF = NIF;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }

    public float getPrecio_equipamiento() {
        return precio_equipamiento;
    }

    public void setPrecio_equipamiento(float precio_equipamiento) {
        this.precio_equipamiento = precio_equipamiento;
    }

    public float getPrecio_campo() {
        return precio_campo;
    }

    public void setPrecio_campo(float precio_campo) {
        this.precio_campo = precio_campo;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }

    public int getHoras_reservadas() {
        return horas_reservadas;
    }

    public void setHoras_reservadas(int horas_reservadas) {
        this.horas_reservadas = horas_reservadas;
    }
    
    
    
}
