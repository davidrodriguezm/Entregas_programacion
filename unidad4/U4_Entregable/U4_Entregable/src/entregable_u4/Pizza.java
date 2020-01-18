package entregable_u4;

public class Pizza {
    enum Size {mediana,familiar}
    private Size tama;
    private final int ingre_max = 3;
    private Ingrediente Ingredientes[] = new Ingrediente[ingre_max];
    private int cont_ingre = 0;

    public Pizza() {
        tama = Size.familiar;
    }

    public Pizza( Size tama) {
        this.tama = tama;
    }

    public void Size_diponible () {
        System.out.println("Los tamaños disponibles son mediana y familiar");
    }

    public boolean add_ingrediente ( Ingrediente Otro_ingre) {
        boolean lleno = true;
        if ( cont_ingre < ingre_max ) {
            Ingredientes[cont_ingre] = Otro_ingre ;
            cont_ingre++;
        } else {
            lleno = false;
        }
        return lleno;
    }

    public void mostrar() {
        System.out.println("Datos de pizza: tamano: " +  tama + " numero de ingredientes: " + cont_ingre);
        if ( cont_ingre > 0 ) {
            for (int i = 0; i < cont_ingre ; i++) {
                System.out.print("Ingrediente " + ( i + 1 ) + " ");
                Ingredientes[i].mostrar();
            }
        }
    }
}
