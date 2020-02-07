package t1.a4;

public class principal_4 {
    public static void main(String[] args) {
        HoraExacta_4 he_1 = new HoraExacta_4(23,59, 40);
        HoraExacta_4 he_2 = new HoraExacta_4(23,59, 40);
        compara( he_1, he_2);
        he_1.Set_segundo(20);
        he_2.Set_hora(5);
        compara( he_1, he_2);
        he_2.Set_segundo(20);
        he_1.Set_hora(5);
        compara( he_1, he_2);
    }
    static void compara( HoraExacta_4 he_1, HoraExacta_4 he_2) {
        System.out.println(he_1.ToString());
        System.out.println(he_2.ToString());
        if ( he_1.equals(he_2) ) {
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }
    }

}
