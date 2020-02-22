public class principal {
    public static void main(String[] args) {
        Minecraft craft = new Minecraft();
        Cristal cr_1 = new Cristal("cristalito", 0, 493,
                67, true, Cristal.Tipo_ristal.TRANSLUCIDO);
        System.out.println( cr_1);
        System.out.println();
        Metal me_2 = new Metal("metalito", 20, 23,
                63, false, true);
        Sierra sie_3 = new Sierra("sierrita", 58, 0,
                17, true, 56);
        Rocas roc_4 = new Rocas("roquita", 48, 73,
                47, false, 58);
        Pico pic_5 = new Pico("piquito", 97, 89,
                17, true, 37);
        craft.add_elemento(cr_1);
        craft.add_elemento(me_2);
        craft.add_elemento(sie_3);
        craft.add_elemento(roc_4);
        craft.add_elemento(pic_5);
        System.out.println( craft);
        System.out.println();
        craft.ordenar_masa();
        craft.mostrarEstado();
        System.out.println();
        cr_1.getCa_quemarse();
        System.out.println( craft);
    }
}
