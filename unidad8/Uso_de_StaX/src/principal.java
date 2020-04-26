public class principal {
    public static void main(String[] args) {
        CrearStaxCero stax_cero = new CrearStaxCero();
        //Creo 10 objetos y los introduzco en el ArryList
        Personaje p1 = new Personaje("Ladron",20,10,15,110,
                17,"Fuego","Agua");
        stax_cero.addObjeto(p1);
        Personaje p2 = new Personaje("Mago",30,40,100,296,
                40,"Magico","Fisico");
        stax_cero.addObjeto(p2);
        Personaje p3 = new Personaje("Guerrero",120,80,30,430,
                50);
        stax_cero.addObjeto(p3);
        Personaje p4 = new Personaje("Caballero",50,70,10,354,
                34,"Tierra","Rayo");
        stax_cero.addObjeto(p4);
        Personaje p5 = new Personaje("Clerigo",20,40,50,140,
                20,"Agua","Rayo");
        stax_cero.addObjeto(p5);
        Personaje p6 = new Personaje("Asesino",60,50,30,309,
                53);
        stax_cero.addObjeto(p6);

        Personaje p7 = new Personaje("Chaman",30,50,90,372,
                61);
        stax_cero.addObjeto(p7);
        Personaje p8 = new Personaje("Samurai",70,90,20,389,
                68,"Fisico","Magico");
        stax_cero.addObjeto(p8);
        Personaje p9 = new Personaje("Nigromante",35,53,67,270,
                57);
        stax_cero.addObjeto(p9);
        Personaje p10 = new Personaje("Sanador",20,27,40,140,
                27,"Rayo","Tierra");
        stax_cero.addObjeto(p10);
        //Guardo el contenido del ArrayList en el fichero stax.xml
        stax_cero.guardarStax();
        MostrarStax stax_mostrar = new MostrarStax("src\\Personas.xml");
        //Recorro y muestro el fichero de la tarea 1 Unidad 8
        stax_mostrar.mostrarContenido();
    }
}
