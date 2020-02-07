package t1.a1;

public class principal_1 {
    public static void main(String[] args) {
        Hora h = new Hora(23,50);
        System.out.println(h.ToString());
        for (int i = 0; i < 30; i++) {
            h.Inc();
        }
        System.out.println(h.ToString());
        h.Set_hora(11);
        h.Set_hora(60);
        System.out.println(h.ToString());
    }
}
