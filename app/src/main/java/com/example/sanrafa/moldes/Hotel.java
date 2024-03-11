package com.example.sanrafa.moldes;

import java.io.Serializable;

public class Hotel implements Serializable {
    private String nombre;
    private String precio;
    private String descripcion;
    private String telefono;
    private String direccion;
    private String calificaicones;
    private Integer fotoGrafia;

    public Hotel() {
    }

    public Hotel(String nombre, String precio, String descripcion, String telefono, String direccion, String calificaicones, Integer fotoGrafia) {
        this.nombre = nombre;
        this.precio = precio;
        this.descripcion = descripcion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.calificaicones = calificaicones;
        this.fotoGrafia = fotoGrafia;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCalificaicones() {
        return calificaicones;
    }

    public void setCalificaicones(String calificaicones) {
        this.calificaicones = calificaicones;
    }

    public Integer getFotoGrafia() {
        return fotoGrafia;
    }

    public void setFotoGrafia(Integer fotoGrafia) {
        this.fotoGrafia = fotoGrafia;
    }
}
