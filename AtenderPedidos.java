
package sistemadecafeteria;

import java.util.LinkedList;


public class AtenderPedidos {
    
    private LinkedList<Pedido> colaPedidos;

    public AtenderPedidos(LinkedList<Pedido> colaPedidos) {
        this.colaPedidos = colaPedidos;
    }

    public void atender() {
        if (!colaPedidos.isEmpty()) {
            Pedido pedido = colaPedidos.removeFirst();

            System.out.println("Atendiendo pedido de " + pedido.getNombreCliente());
            System.out.println("Productos:");

            for (int i = 0; i < pedido.getProductos().length; i++) {
                System.out.println(pedido.getProductos()[i] + " x " + pedido.getCantidades()[i]);
            }
        } else {
            System.out.println("No hay pedidos pendientes.");
        }
    }
}

