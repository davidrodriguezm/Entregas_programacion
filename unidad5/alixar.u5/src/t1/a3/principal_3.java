package t1.a3;

public class principal_3 {
    public static void main(String[] args) {
        HoraExacta hex = new HoraExacta(23,59, 40);
        System.out.println(hex.ToString());
        for (int i = 0; i < 30; i++) {
            hex.Inc();
        }
        System.out.println(hex.ToString());
        hex.Set_segundo(11);
        hex.Set_segundo(200);
        hex.Set_hora(13);
        hex.Set_minuto(30);
        System.out.println(hex.ToString());
    }
}
