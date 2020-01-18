package entregable_u4;

public class Pedido {
    private Pizza pizza_pedido;
    private boolean no_lleno = true;
    static int cont_pedidos = 0;
    private int numero_pedido = 0;

    public Pedido( Pizza pizza_pedido ) {
        if ( no_lleno ) {
            this.pizza_pedido = pizza_pedido;
            cont_pedidos++;
            numero_pedido = cont_pedidos;
        }
    }

    public void mostrar() {
        System.out.println("El pedido " + numero_pedido + " es de una pizza:" );
        pizza_pedido.mostrar();
    }
}
