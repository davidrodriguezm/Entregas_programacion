package t2.a1;

public class principal_1 {
    public static void main(String[] args) {
        lista_1 l = new lista_1( 5);
        l.inser_final(1);
        l.inser_final(2);
        l.inser_final(3);
        l.inser_final(4);
        l.inser_final(5);
        l.inser_principio(6);
        l.inser_principio(7);
        Integer[] otra_lista = {8, 9, 10};
        l.inser_lista(otra_lista);
        l.mostrar_informacion();
        System.out.println();
        l.inser_indice(11, 8);
        l.mostrar_informacion();
        System.out.println( "El numero de elementos es: " + l.numero_elementos() );
        System.out.println();
        l.eliminar_indice(9);
        l.mostrar_informacion();
        System.out.println( "El numero de elementos es: " + l.numero_elementos() );
        int posicion = 5;
        System.out.println( "El numero obtenido de la posicion " + posicion + " es: " + l.get_indice(posicion) );
        Integer buscar = 6;
        System.out.println( "La posicion del numero " + buscar + " esta en la posicion: " + l.buscar_indice(buscar) );
        System.out.println("La cadena es: " + l.mostrar_cadena());
    }
}
