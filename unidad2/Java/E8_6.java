public class E8_6 {

    public static void main(String[] args) {
        int multiplicador = 1;
        int para = 0;
        while (para == 0){
            int multiplo = multiplicador * 7;
            multiplicador++;
            if (multiplo < 100){
                System.out.println(multiplo);
            }
            else {
                para = 1;
            }
        }
    }
}
