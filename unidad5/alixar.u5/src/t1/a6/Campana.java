package t1.a6;

import t1.a5.Instrumento;

public class Campana extends Instrumento {

    public Campana() {
        super();
    }
    @Override
    public void Interpretar() {
        for (int i = 0; i < cont_tama ; i++) {
            switch ( notas[i] ) {
                case DO:
                    System.out.print("Doooo");
                    break;
                case RE:
                    System.out.print("Reeee");
                    break;
                case MI:
                    System.out.print("Miiii");
                    break;
                case FA:
                    System.out.print("Faaaa");
                    break;
                case SOL:
                    System.out.print("Soooool");
                    break;
                case LA:
                    System.out.print("Laaaaa");
                    break;
                case SI:
                    System.out.print("Siiiii");
                    break;
            }
            System.out.print(" ");
        }
        System.out.println();
    }
}
