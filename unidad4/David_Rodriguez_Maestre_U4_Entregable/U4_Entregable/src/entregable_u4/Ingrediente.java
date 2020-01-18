package entregable_u4;

public class Ingrediente {
    enum  Tipo_ingre {Jamon,Atun,Queso,Chorizo,Beicon}
    private int calorias;
    private Tipo_ingre nombre_ingre;

    public Ingrediente() {
        calorias = 250;
        nombre_ingre = Tipo_ingre.Queso;
    }

    public Ingrediente(int calorias) {
        this.calorias = calorias;
        nombre_ingre = Tipo_ingre.Queso;
    }

    public Ingrediente(int calorias, Tipo_ingre nombre_ingre) {
        this.calorias = calorias;
        this.nombre_ingre = nombre_ingre;
    }

    public Ingrediente(Tipo_ingre nombre_ingre) {
        calorias = 250;
        this.nombre_ingre = Tipo_ingre.Queso;
    }

    public void mostrar(){
        System.out.println("Tipo: " + nombre_ingre + " Calorias: " + calorias);
    }

}
