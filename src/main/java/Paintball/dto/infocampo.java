package Paintball.dto;

public class infocampo {

    int id;
    String tipo;
    int limitejugadores;
    float precio;

    public infocampo(int id, String tipo, int limitejugadores, float precio) {
        this.id = id;
        this.tipo = tipo;
        this.limitejugadores = limitejugadores;
        this.precio = precio;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getLimitejugadores() {
        return limitejugadores;
    }

    public void setLimitejugadores(int limitejugadores) {
        this.limitejugadores = limitejugadores;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

}
