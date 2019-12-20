package t1.a8;

public class bombilla_8 {
    static boolean i_general = true;
    private boolean interructor;
    private String bombilla;

    public bombilla_8() {
        interructor = false;
        bombilla = "Apaga";
    }
    public void enciende() {
        interructor = true;
    }
    public void apaga() {
        interructor = false;
    }
    public String estado() {
        if ( interructor && i_general ) {
            bombilla = "Encendida";
        } else {
            bombilla = "Apaga";
        }
        return bombilla;
    }
}
