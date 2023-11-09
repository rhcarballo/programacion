package ies.puerto;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    /**
     * Constructor con todos los parametros.
     * @param nombre del producto
     * @param precio del producto
     * @param stock del producto
     */

    public Producto(String nombre, double precio, int stock){
        this.nombre=nombre;
        this.precio=precio;
        this.stock=stock;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPrecio() {
        return this.precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return this.stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public Producto(){
    }


    

}
