package t1.a5;

public class texto_5 {
    private String cadena;
    private final int tama = 16;
    static final String vocales = "aeiouáéíóú";

    public texto_5(String texto) {
        if ( texto.length() <= tama) {
            cadena = texto;
        }
    }
    public void cara_principio(char caracter) {
        if ( tama > cadena.length() ) {
            cadena = caracter + cadena;
        }
    }
    public void cara_final(char caracter) {
        if ( tama > cadena.length() ) {
            cadena = cadena + caracter;
        }
    }
    public void cade_principio( String texto) {
        if (tama >= cadena.length() + texto.length()) {
            cadena = texto + cadena;
        }
    }
    public void cade_final( String texto) {
        if (tama >= cadena.length() + texto.length()) {
            cadena =  cadena + texto;
        }
    }
    public int cont_vocales() {
        int cont_vocales = 0;
        for (int i = 0; i < cadena.length(); i++) {
            for (int j = 0; j < vocales.length() ; j++) {
                if ( vocales.substring(j, j + 1).equalsIgnoreCase(cadena.substring(i, i + 1)) ) {
                    cont_vocales++;
                }
            }
        }
        return cont_vocales;
    }
    public void mostrar() {
        System.out.println(cadena);
    }
}
