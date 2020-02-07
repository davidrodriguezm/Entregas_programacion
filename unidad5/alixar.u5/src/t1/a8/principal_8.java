package t1.a8;

public class principal_8 {
    public static void main(String[] args) {
        CajaCarton a = new CajaCarton(50, 70, 50, 123098);
        System.out.println("El volumen es: " + a.getVolumen() + " centimetros cubicos");
        System.out.println(a.toString());
        CajaCarton b = new CajaCarton(90, 75, 80, 465483);
        System.out.println("El volumen es: " + b.getVolumen() + " centimetros cubicos");
        System.out.println(b.toString());
    }
}
