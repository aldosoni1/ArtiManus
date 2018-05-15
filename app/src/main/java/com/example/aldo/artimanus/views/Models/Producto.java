package com.example.aldo.artimanus.views.Models;

public class Producto {
    private String Nombre;
    private Float Precio;
    private String Descripcion;
    private String Categoria;
    private String Imagen;

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Float getPrecio() {
        return Precio;
    }

    public void setPrecio(Float precio) {
        Precio = precio;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public void setDescripcion(String descripcion) {
        Descripcion = descripcion;
    }

    public String getCategoria() {
        return Categoria;
    }

    public void setCategoria(String categoria) {
        Categoria = categoria;
    }

    public String getImagen() {
        return Imagen;
    }

    public void setImagen(String imagen) {
        Imagen = imagen;
    }
}
