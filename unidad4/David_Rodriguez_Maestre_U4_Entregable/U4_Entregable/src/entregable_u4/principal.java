package entregable_u4;

public class principal {
    public static void main(String[] args) {
        Pizza p1 = new Pizza();
        p1.mostrar();
        Ingrediente i1 = new Ingrediente();
        Ingrediente i2 = new Ingrediente( 150, Ingrediente.Tipo_ingre.Beicon);
        Ingrediente i3 = new Ingrediente( 300);
        System.out.println("Se puede anadir: " +p1.add_ingrediente(i1));
        p1.add_ingrediente(i2);
        p1.add_ingrediente(i3);
        Ingrediente i4 = new Ingrediente( Ingrediente.Tipo_ingre.Atun);
        System.out.println("Se puede anadir: " + p1.add_ingrediente(i4));
        p1.mostrar();
        Pizza p2 = new Pizza(Pizza.Size.mediana);
        p2.mostrar();
        Pedido pedi_1 = new Pedido(p1);
        pedi_1.mostrar();
        Pizzeria piz_tienda = new Pizzeria( pedi_1 );
        piz_tienda.mostrar();
    }
}
