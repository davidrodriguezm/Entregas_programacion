package t1.a2;

import static t1.a2.Meridiano.AM;

public class principal_2 {
    public static void main(String[] args) {
        Hora12 h12 = new Hora12(12,50, AM);
        System.out.println(h12.ToString());
        for (int i = 0; i < 30; i++) {
            h12.Inc();
        }
        System.out.println(h12.ToString());
        h12.Set_hora(12);
        h12.Set_hora(22);
        System.out.println(h12.ToString());
        for (int i = 0; i < 50; i++) {
            h12.Inc();
        }
        System.out.println(h12.ToString());
        h12.Set_minuto(20);
        h12.Set_minuto(400);
        System.out.println(h12.ToString());
    }
}
