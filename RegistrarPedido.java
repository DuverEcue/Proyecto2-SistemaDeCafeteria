
package sistemadecafeteria;

import java.util.LinkedList;
import java.util.Scanner;


public class RegistrarPedido {
    
   private LinkedList<Pedido> colaPedidos;
    private Scanner scanner;

    public RegistrarPedido(LinkedList<Pedido> colaPedidos) {
        this.colaPedidos = colaPedidos;
        scanner = new Scanner(System.in);
    }

    public void registrar() {
        System.out.print("Ingrese nombre del cliente: ");
        String nombreCliente = scanner.nextLine();

        System.out.print("Ingrese cantidad de productos: ");
        int cantidadProductos = scanner.nextInt();
        scanner.nextLine(); // Consumir salto de línea

        String[] productos = new String[cantidadProductos];
        int[] cantidades = new int[cantidadProductos];

        for (int i = 0; i < cantidadProductos; i++) {
            System.out.print("Ingrese producto " + (i + 1) + ": ");
            productos[i] = scanner.nextLine();

            System.out.print("Ingrese cantidad de " + productos[i] + ": ");
            cantidades[i] = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea
        }

        Pedido pedido = new Pedido(nombreCliente, productos, cantidades);
        colaPedidos.add(pedido);

        System.out.println("Pedido registrado con éxito.");
    }
}

