public class Ejercicio5 {
    public static void main(String[] args) {
        int[] tabla = {1, 5, 4, 1, 7};
        System.out.println("El numero aleatorio es:");
        System.out.println(aleatorioDeArray(tabla));

    }
    public static int aleatorioDeArray(int[] ta) {
        int aleatorio = (int)(Math.random() * ta.length);
        int numero = ta[aleatorio];
        return numero;
    }
}
