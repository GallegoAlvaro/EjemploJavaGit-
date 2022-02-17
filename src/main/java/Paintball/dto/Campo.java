/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Paintball.dto;

import java.sql.Date;

/**
 *
 * @author alvaro y sergio
 */
public class Campo {
    private int id;
    private Date inicio;
    private Date fin;
    private String tipocampo;
    private int cantidad_jugadores;
    private int limite_jugadores;
    private float precio_hora;
    private float precio_total;
    private int clienteid;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getInicio() {
        return inicio;
    }

    public void setInicio(Date inicio) {
        this.inicio = inicio;
    }

    public Date getFin() {
        return fin;
    }

    public void setFin(Date fin) {
        this.fin = fin;
    }

    public String getTipocampo() {
        return tipocampo;
    }

    public void setTipocampo(String tipocampo) {
        this.tipocampo = tipocampo;
    }

    public int getCantidad_jugadores() {
        return cantidad_jugadores;
    }

    public void setCantidad_jugadores(int cantidad_jugadores) {
        this.cantidad_jugadores = cantidad_jugadores;
    }

    public int getLimite_jugadores() {
        return limite_jugadores;
    }

    public void setLimite_jugadores(int limite_jugadores) {
        this.limite_jugadores = limite_jugadores;
    }

    public float getPrecio_hora() {
        return precio_hora;
    }

    public void setPrecio_hora(float precio_hora) {
        this.precio_hora = precio_hora;
    }

    public float getPrecio_total() {
        return precio_total;
    }

    public void setPrecio_total(float precio_total) {
        this.precio_total = precio_total;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public Campo(int id, Date inicio, Date fin, String tipocampo, int cantidad_jugadores, int limite_jugadores, float precio_hora, float precio_total, int clienteid) {
        this.id = id;
        this.inicio = inicio;
        this.fin = fin;
        this.tipocampo = tipocampo;
        this.cantidad_jugadores = cantidad_jugadores;
        this.limite_jugadores = limite_jugadores;
        this.precio_hora = precio_hora;
        this.precio_total = precio_total;
        this.clienteid = clienteid;
    }
    
    
}
