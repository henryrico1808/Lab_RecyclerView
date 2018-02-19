package com.example.henry.recyclerview;


public class Personas {

    private String headerCode;
    private String nombre;
    private String headerDate;

    public Personas(String headerCode, String nombre, String headerDate) {
        this.headerCode = headerCode;
        this.nombre = nombre;
        this.headerDate = headerDate;
    }

    public String getHeaderCode() {
        return headerCode;
    }

    public void setHeaderCode(String headerCode) {
        this.headerCode = headerCode;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHeaderDate() {
        return headerDate;
    }

    public void setHeaderDate(String headerDate) {
        this.headerDate = headerDate;
    }
}
