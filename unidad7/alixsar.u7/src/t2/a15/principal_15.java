package t2.a15;

public class principal_15 {
    public static void main(String[] args) {
        ListaOrdenada<String> lis_cadenas = new ListaOrdenada<>(new StringDecreciente());
        ListaOrdenada<Integer> lis_integer = new ListaOrdenada<>(new IntegerDecreciente());
        lis_cadenas.inserOrdenada("hola");
        lis_cadenas.inserOrdenada("adios");
        lis_cadenas.inserOrdenada("hasta luego");
        lis_cadenas.inserOrdenada("yo que se");
        lis_cadenas.inserOrdenada("lo que sea");
        System.out.println(lis_cadenas);
        lis_integer.inserOrdenada(3);
        lis_integer.inserOrdenada(10);
        lis_integer.inserOrdenada(14);
        lis_integer.inserOrdenada(35);
        System.out.println(lis_integer);

    }
}
