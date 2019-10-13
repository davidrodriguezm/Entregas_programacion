import java.util.Scanner;

public class E8_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int para = 0;
        int alturamax = 0;
        int arbol = 0;
        int arbolmax = 0;
        while (para == 0){
            System.out.println("¿cuandos centimetros mide el arbol de alto? ");
            int altura = teclado.nextInt();
            if ( altura != -1){
                if (altura > alturamax){
                    alturamax = altura;
                    arbolmax = arbol;
                }
                System.out.println("el mas alto es el arbol " + arbolmax  + " mide " + alturamax + " centimetros");
                arbol++;
            }
            else {
                para = 1;
            }
        }
    }
}
