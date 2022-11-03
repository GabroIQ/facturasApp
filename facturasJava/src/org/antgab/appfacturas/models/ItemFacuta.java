package org.antgab.appfacturas.models;


public class ItemFacuta {
    private int cantidad;
    public Prodcuto prodcutos;
    private double totalPrdcutoCantidad;

    public ItemFacuta(Prodcuto prod , int cant) {
        this.prodcutos = prod;
        this.cantidad = cant;
    }


    public int getCantidad() {
        return cantidad;
    }
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }
    public double getTotalPrdcutoCantidad() {
        return totalPrdcutoCantidad;
    }
   
    public double calcularImporte() {
        return this.cantidad * prodcutos.getPreecio();
    }

    public void mostrar() {
        System.out.println("Nombre: " + (prodcutos.getNombre()));
        System.out.println("Cantidad: " + this.cantidad);
        
    }

}
