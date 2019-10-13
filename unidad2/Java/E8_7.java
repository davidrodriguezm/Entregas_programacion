public class E8_7 {
    public static void main(String[] args) {
        int para = 0;
        int numero = 0;
        int producto = 1;
        int contador = 0;
        while ( para == 0){
            numero++;
            if ((numero % 2)!= 0){
                producto = producto * numero;
                contador++;
                System.out.println("impar " + numero);
            }
            if (contador == 10){
                para = 1;
            }
        }
        System.out.println("el producto de los 10 primeros números impares es " + producto);
    }
}
