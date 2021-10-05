package com.ceep.dominio;

public class producto {

    private final int idProducto;
    private String nombre;
    private double precio;
    private static int contadorProductos;

    public producto() {
        this.idProducto = ++producto.contadorProductos;
    }

    public producto(String nombre, double precio) {
        this();
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static int getContadorProductos() {
        return contadorProductos;
    }

    public static void setContadorProductos(int contadorProductos) {
        producto.contadorProductos = contadorProductos;
    }

    @Override
    public String toString() {
        return "producto{" + "nombre=" + nombre + ", precio=" + precio + '}';
    }

}
