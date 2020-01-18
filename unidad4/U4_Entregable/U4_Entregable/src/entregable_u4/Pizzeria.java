package entregable_u4;

import java.util.Arrays;

public class Pizzeria {
    private int cont_pedidos = 0;
    private int tama_pedidos = 5;
    private Pedido Pedios[] = new Pedido[tama_pedidos];

    public Pizzeria( Pedido otro_pedio) {
        if ( cont_pedidos < tama_pedidos ) {
            Pedios[cont_pedidos] = otro_pedio;
        } else {
            ajustar_tama();
            Pedios[cont_pedidos] = otro_pedio;
        }
        cont_pedidos++;

    }

    public void ajustar_tama() {
        Pedios = Arrays.copyOf(Pedios,Pedios.length + 1);
    }

    public void mostrar() {
        for (int i = 0; i < cont_pedidos ; i++) {
            System.out.println("Pedidos almacenados: ");
            Pedios[i].mostrar();
        }
    }
}
