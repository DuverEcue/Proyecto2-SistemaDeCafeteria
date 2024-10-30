
package sistemadecafeteria;

import java.util.LinkedList;
import java.util.Scanner;


public class SistemaDeCafeteria {
    
    private RegistrarPedido registrarPedido;
    private AtenderPedidos atenderPedidos;
    private VerificarPedidosPendientes verificarPedidosPendientes;
    private Scanner scanner;
    private LinkedList<Pedido> colaPedidos;

    public SistemaDeCafeteria() {
        colaPedidos = new LinkedList<>();
        registrarPedido = new RegistrarPedido(colaPedidos);
        atenderPedidos = new AtenderPedidos(colaPedidos);
        verificarPedidosPendientes = new VerificarPedidosPendientes(colaPedidos);
        scanner = new Scanner(System.in);
    }

    public void menu() {
        while (true) {
            System.out.println("\n---Sistema de Cafetería");
            System.out.println("1. Registrar Pedido");
            System.out.println("2. Atender Pedido");
            System.out.println("3. Verificar Pedidos Pendientes");
            System.out.println("4. Salir");

            System.out.print("Ingrese opción: ");
            int opcion = scanner.nextInt();
            scanner.nextLine(); // Consumir salto de línea

            switch (opcion) {
                case 1:
                    registrarPedido.registrar();
                    break;
                case 2:
                    atenderPedidos.atender();
                    break;
                case 3:
                    verificarPedidosPendientes.verificar();
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción inválida.");
            }
        }
    }

    public static void main(String[] args) {
        SistemaDeCafeteria sistema = new SistemaDeCafeteria();
        sistema.menu();
    }
}


