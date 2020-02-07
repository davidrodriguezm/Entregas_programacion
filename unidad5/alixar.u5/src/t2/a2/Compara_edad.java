package t2.a2;

import java.util.Comparator;

public class Compara_edad implements Comparator {

    @Override
    public int compare( Object ob1, Object ob2 ){
        int resultado = 0;
        Cliente c1 = (Cliente) ob1;
        Cliente c2 = (Cliente) ob2;
        if (c1.edad < c2.edad) {
            resultado = -1;
        } else if (c1.edad > c2.edad) {
            resultado = 1;
        }
        return resultado;
    }
}
