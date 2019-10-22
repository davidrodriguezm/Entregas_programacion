public class E8_11 {
    public static void main(String[] args) {
        int numero = 0;
        int tabla;
        int i, u;
        for (i = 1; i <= 10; i++) {
            numero++;
            for (u = 1; u <= 10; u++) {
                tabla = numero * u;
                System.out.println(numero + "x" + u + "=" + tabla);
            }
        }
    }
}