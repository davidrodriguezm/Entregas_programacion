public class principal {
    public static void main(String[] args) {
        DomDesdeCero cero = new DomDesdeCero();
        //Creo 10 objetos y los introduzco en el ArryList
        Personaje p1 = new Personaje("Eustaquio","Caballero",50,70,10,354,
                34,"Tierra","Rayo");
        cero.addObjeto(p1);
        Personaje p2 = new Personaje("Fermin","Ladron",20,10,15,110,
                17,"Fuego","Agua");
        cero.addObjeto(p2);
        Personaje p3 = new Personaje("Enriqueta","Mago",30,40,100,296,
                40,"Magico","fisico");
        cero.addObjeto(p3);
        Personaje p4 = new Personaje("Prudencio","Guerrero",120,80,30,430,
                50);
        cero.addObjeto(p4);
        Personaje p5 = new Personaje("Oristila","Clerigo",20,40,50,140,
                20,"Agua","Rayo");
        cero.addObjeto(p5);
        Personaje p6 = new Personaje("Eufrasio","Asesino",60,50,30,309,
                53);
        cero.addObjeto(p6);
        Personaje p7 = new Personaje("Ortensia","Sanador",20,27,40,140,
                27,"Rayo","Tierra");
        cero.addObjeto(p7);
        Personaje p8 = new Personaje("Filipito","Mago",30,50,90,372,
                61);
        cero.addObjeto(p8);
        Personaje p9 = new Personaje("Eustaquio","Caballero",70,90,20,389,
                68,"Fisico","Magico");
        cero.addObjeto(p9);
        Personaje p10 = new Personaje("Ansio","Sanador",35,53,67,270,
                57);
        cero.addObjeto(p10);
        //Guardo el contenido del ArrayList en el fichero cero.xml
        cero.guardarDOM();
    }
}
