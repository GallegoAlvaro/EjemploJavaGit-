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
public class Equipamiento {
    private int id;
    private int clienteid;
    private float precio_equipamiento_total;
    private int arma;
    private float precio_arma;
    private int municion;
    private float precio_municion;
    private int traje_azul;
    private int traje_rojo;
    private float precio_trajes;

    public Equipamiento(int id, int clienteid, float precio_equipamiento_total, int arma, float precio_arma, int municion, float precio_municion, int traje_azul, int traje_rojo, float precio_trajes) {
        this.id = id;
        this.clienteid = clienteid;
        this.precio_equipamiento_total = precio_equipamiento_total;
        this.arma = arma;
        this.precio_arma = precio_arma;
        this.municion = municion;
        this.precio_municion = precio_municion;
        this.traje_azul = traje_azul;
        this.traje_rojo = traje_rojo;
        this.precio_trajes = precio_trajes;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getClienteid() {
        return clienteid;
    }

    public void setClienteid(int clienteid) {
        this.clienteid = clienteid;
    }

    public float getPrecio_equipamiento_total() {
        return precio_equipamiento_total;
    }

    public void setPrecio_equipamiento_total(float precio_equipamiento_total) {
        this.precio_equipamiento_total = precio_equipamiento_total;
    }

    public int getArma() {
        return arma;
    }

    public void setArma(int arma) {
        this.arma = arma;
    }

    public float getPrecio_arma() {
        return precio_arma;
    }

    public void setPrecio_arma(float precio_arma) {
        this.precio_arma = precio_arma;
    }

    public int getMunicion() {
        return municion;
    }

    public void setMunicion(int municion) {
        this.municion = municion;
    }

    public float getPrecio_municion() {
        return precio_municion;
    }

    public void setPrecio_municion(float precio_municion) {
        this.precio_municion = precio_municion;
    }

    public int getTraje_azul() {
        return traje_azul;
    }

    public void setTraje_azul(int traje_azul) {
        this.traje_azul = traje_azul;
    }

    public int getTraje_rojo() {
        return traje_rojo;
    }

    public void setTraje_rojo(int traje_rojo) {
        this.traje_rojo = traje_rojo;
    }

    public float getPrecio_trajes() {
        return precio_trajes;
    }

    public void setPrecio_trajes(float precio_trajes) {
        this.precio_trajes = precio_trajes;
    }
    
    
}
