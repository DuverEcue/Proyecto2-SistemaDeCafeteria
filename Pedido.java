
package sistemadecafeteria;


class Pedido {
    
    private String nombreCliente;
    private String[] productos;
    private int[] cantidades;

    public Pedido(String nombreCliente, String[] productos, int[] cantidades) {
        this.nombreCliente = nombreCliente;
        this.productos = productos;
        this.cantidades = cantidades;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public String[] getProductos() {
        return productos;
    }

    public int[] getCantidades() {
        return cantidades;
    }
}
