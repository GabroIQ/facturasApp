import java.util.Scanner;

import org.antgab.appfacturas.models.Cliente;
import org.antgab.appfacturas.models.Factura;
import org.antgab.appfacturas.models.ItemFacuta;
import org.antgab.appfacturas.models.Prodcuto;

public class App {
    public static void main(String[] args) throws Exception {
        
        Cliente clienteUno = new Cliente();
        clienteUno.setNombre("Gabriel");
        clienteUno.setNumCliente("BA-4564");

        Factura fac = new Factura();

        try (Scanner sc = new Scanner(System.in)) {
            Boolean stop = true;
            int optIngresada , cant;
            Double precio;
            String nombreProducto;

            while (stop) {
                System.out.println("\nIngrese la opcion solicitada: \n");
                System.out.println("1- Agregar producto al carrito ficticio");
                System.out.println("2- Ver factura");
                System.out.println("3- Salir");
                optIngresada = sc.nextInt();

                switch (optIngresada) {
                    case 1:
                        System.out.println("Ingrese el nombre del producto: ");
                        nombreProducto = sc.next();

                        System.out.println("Ingrese el precio: ");
                        precio = sc.nextDouble();

                        System.out.println("Ingrese la cantidad: ");
                        cant = sc.nextInt();

                        Prodcuto prod = new Prodcuto(nombreProducto , precio);
                        ItemFacuta itemFac = new ItemFacuta(prod, cant);
                        fac.addItemFactura(itemFac);
                        
                        break;

                    case 2:
                        fac.mostrarFactura();
                        break;
                
                    case 3:
                        System.out.println("Saliendo...");
                        stop = false;
                        break;
                
                    default:
                        break;
                }
            }
        }
    }
}
