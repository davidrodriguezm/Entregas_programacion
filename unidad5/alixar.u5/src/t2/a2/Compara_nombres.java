package t2.a2;

import java.util.Comparator;

public class Compara_nombres implements Comparator {

    @Override
    public int compare( Object ob1, Object ob2 ){
        Cliente c1 = (Cliente) ob1;
        Cliente c2 = (Cliente) ob2;
        return c1.nombre.compareTo( c2.nombre);
    }
}
