package t1.a1;

public class Hora {
    protected int hora = 0;
    protected  int minuto = 0;

    public Hora(int hora, int minuto) {
        Set_hora(hora);
        Set_minuto(minuto);
    }
    public void Set_hora( int hora ) {
        if ( hora <= 23 && hora >=0 ) {
            this.hora = hora;
        } else {
            System.out.println("La hora debe ser entre 0 y 23");
        }
    }
    public void Set_minuto( int minuto ) {
        if ( minuto <= 59 && minuto >=0 ) {
            this.minuto = minuto;
        } else {
            System.out.println("El minuto debe ser entre 0 y 60");
        }
    }
    public void Inc(){
        minuto++;
        Ajustar_minuto();
        Ajustar_hora();
    }
    public void Ajustar_hora() {
        while (hora > 23) {
            hora -= 24;
        }
    }
    public void Ajustar_minuto() {
        while (minuto > 59) {
            minuto -= 60;
            hora++;
        }
    }
    public String ToString() {
        String reloj;
        reloj = hora + ":" + minuto;
        return reloj;
    }
}
