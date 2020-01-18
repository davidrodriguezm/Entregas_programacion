public class U3_E4_9 {
    public static void main(String[] args) {
        int boleto_prim[] = {3, 5, 7, 1, 5, 9};
        int com_ganadora[] = {3, 6, 7, 8, 5, 0};
        System.out.println("El numero de aciertos es: " + primitiva( boleto_prim, com_ganadora) );
    }
    static int primitiva( int boleto[], int ganadora[]) {
        int aciertos = 0;
        for ( int i = 0; i < ganadora.length; i++) {
            if ( boleto[i] == ganadora[i] ) {
                aciertos++;
            }
        }
        return aciertos;
    }
}
