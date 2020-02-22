import java.util.Arrays;
import java.util.Comparator;

public class Minecraft {
    private Material[] materiales;
    private final int capa_max = 10;
    private int n_elementos = 0;

    public Minecraft() {
        materiales = new Material[n_elementos + 1];
    }

    public void add_elemento( Material  material) {
        if ( materiales.length <= capa_max ) {
            if ( materiales.length <= n_elementos ) {
                materiales = Arrays.copyOf(materiales, materiales.length + 1);
            }
            n_elementos++;
            materiales[n_elementos - 1] = material;
        }
    }

    @Override
    public String toString() {
        return "Minecraft{" +
                "materiales=" + Arrays.toString(materiales) + '}';
    }

    public void mostrarEstado() {
        System.out.println( "Minecraft{" +
                "materiales=" + Arrays.toString(materiales) + '}');
    }

    public void ordenar_masa() {
        Arrays.sort(materiales);
    }

    public void ordenar_quemarse() {
        Arrays.sort(materiales, new Comparator() {
            public int compare( Object ob1, Object ob2 ){
                Material m_1 = (Material) ob1;
                Material m_2 = (Material) ob2;
                int devuelve = 0;
                if ( m_1.getCa_quemarse() < m_2.getCa_quemarse() ) {
                    devuelve = -1;
                } else if ( m_1.getCa_quemarse() > m_2.getCa_quemarse() ) {
                    devuelve = 1;
                } else {
                    devuelve = 0;
                }
                return devuelve;
            }
        });
    }

    public void ordenar_diluirse() {
        Arrays.sort(materiales, new Comparator() {
            public int compare( Object ob1, Object ob2 ){
                Material m_1 = (Material) ob1;
                Material m_2 = (Material) ob2;
                int devuelve = 0;
                if ( m_1.getCa_diluirse() < m_2.getCa_diluirse() ) {
                    devuelve = -1;
                } else if ( m_1.getCa_diluirse() > m_2.getCa_diluirse() ) {
                    devuelve = 1;
                } else {
                    devuelve = 0;
                }
                return devuelve;
            }
        });
    }

    public void ultimoMaterialQueQueda() {

    }

    public void MaterialSinMasa() {

    }

}