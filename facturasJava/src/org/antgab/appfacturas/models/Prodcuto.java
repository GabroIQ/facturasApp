package org.antgab.appfacturas.models;

public class Prodcuto {
    private int codigo;
    private String nombre;
    private double precio;
    private static int codigoContador;

    public Prodcuto(String nombre , double precio ) {
        this.codigo = ++codigoContador;
        this.nombre = nombre;
        this.precio = precio;
    }


    public int getCodigo() {
        return codigo;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getPreecio() {
        return precio;
    }
    public void setPreecio(double preecio) {
        this.precio = preecio;
    }



    
}
