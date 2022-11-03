package org.antgab.appfacturas.models;

import java.util.ArrayList;
import java.util.Date;

public class Factura {
    private int folio;
    private String desc;
    private Date fecha;
    private Cliente cliente;
    private ArrayList<ItemFacuta> facturasItems;
    private int indiceItems;
    private static int folioFinal;

    public Factura(String desc , Cliente cliente){
        facturasItems = new ArrayList<>();
        this.desc = desc;
        this.cliente = cliente;
        this.folio = ++folioFinal;
        this.fecha = new Date();
    }
    public Factura(){
        facturasItems = new ArrayList<>();
        this.folio = ++folioFinal;
        this.fecha = new Date();
    }

    public int getFolio() {
        return folio;
    }
    public String getDesc() {
        return desc;
    }
    public void setDesc(String desc) {
        this.desc = desc;
    }
    public Date getFecha() {
        return fecha;
    }
    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    public int getIndiceItems() {
        return indiceItems;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
  
    //-------------------METODOS------------------------
    public void addItemFactura(ItemFacuta item) {
        facturasItems.add(item);
    }
    public double calcularTotal() {
        double total = 0.0;
        if (facturasItems.size() > 0) {
            for (int i = 0; i < facturasItems.size() ; i++) {
                total = total + (facturasItems.get(i).calcularImporte());
            }
        }
        return total;
    }

    public void mostrarFactura() {
        if (facturasItems.size() == 0) {
            System.out.println("No hay ningun producto agregado");
        } else {
            System.out.println("===================================\n");
            System.out.println("DETALLE: \n");
            System.out.println(this.fecha + "\n");
            System.out.println("Folio: " + this.folio + "\n");
            for (int j = 0; j < facturasItems.size() ; j++) {
                facturasItems.get(j).mostrar();
                System.out.println("\n");
            }
            System.out.println("Total: " + calcularTotal());
            System.out.println("===================================\n");
        }
        
    }

    public void largo() {
        System.out.println(facturasItems.size());
    }
    
}
