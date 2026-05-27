package com.distribuida.model;

public class Categoria {

    // atributos
    private int idCategoria;
    private String categoria;
    private String descripcion;

    // constructor vacío
    public Categoria() {}

    // constructor con parametros
    public Categoria(int idCategoria, String categoria, String descripcion) {
        this.idCategoria = idCategoria;
        this.categoria = categoria;
        this.descripcion = descripcion;
    }

    // metodos getters and setters
    public int getIdCategoria() {
        return idCategoria;
    }

    public void setIdCategoria(int idCategoria) {
        this.idCategoria = idCategoria;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public String toString() {
        return "Categoría{" +
                "idCategoria=" + idCategoria +
                ", categoria='" + categoria + '\'' +
                ", descripcion='" + descripcion + '\'' +
                '}';
    }
}
