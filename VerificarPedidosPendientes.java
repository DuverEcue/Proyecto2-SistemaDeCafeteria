
package sistemadecafeteria;

import java.util.Queue;


public class VerificarPedidosPendientes {
    private Queue<Pedido> colaPedidos;

    public VerificarPedidosPendientes(Queue<Pedido> colaPedidos) {
        this.colaPedidos = colaPedidos;
    }

    VerificarPedidosPendientes() {
        throw new UnsupportedOperationException(" "); 
    }

    public void verificar() {
        if (!colaPedidos.isEmpty()) {
            System.out.println("Pedidos pendientes:");

            for (Pedido pedido : colaPedidos) {
                System.out.println(pedido.getNombreCliente());

                for (int i = 0; i < pedido.getProductos().length; i++) {
                    System.out.println(pedido.getProductos()[i] + " x " + pedido.getCantidades()[i]);
                }

                System.out.println();
            }
        } else {
            System.out.println("No hay pedidos pendientes.");
        }
    }
}


