package t1.a6;

import t1.a5.Instrumento;

public class Piano extends Instrumento {

    public Piano() {
        super();
    }
    @Override
    public void Interpretar() {
        for (int i = 0; i < cont_tama ; i++) {
            System.out.print(notas[i]);
            System.out.print(" ");
        }
        System.out.println();
    }
}
