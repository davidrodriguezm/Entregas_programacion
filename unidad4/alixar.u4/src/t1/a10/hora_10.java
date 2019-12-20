package t1.a10;

public class hora_10 {
    private int hora;
    private int minuto;
    private int segundo;

    public void set_hora( int hora ) {
        if ( hora <= 23 && hora >=0 ) {
            this.hora = hora;
        } else {
            System.out.println("La hora debe ser entre 0 y 23");
        }
    }
    public int get_hora() {
        return hora;
    }
    public void set_minuto( int minuto ) {
        if ( minuto <= 59 && minuto >=0 ) {
            this.minuto = minuto;
        } else {
            System.out.println("El minuto debe ser entre 0 y 60");
        }
    }
    public int get_minuto() {

        return minuto;
    }
    public void set_segundos( int segundo ) {
        if ( segundo <= 59 && segundo >= 0 ) {
            this.segundo = segundo;
        } else {
            System.out.println("El segundo deben ser entre 0 y 60");
        }
    }
    public int get_segundo() {
        return segundo;
    }
    public void sumar_segundos( int sum_segundos ) {
        segundo += sum_segundos;
        if ( segundo > 59 ) {
            while (segundo > 59) {
                segundo -= 60;
                minuto++;
            }
            while (minuto > 59) {
                minuto -= 60;
                hora++;
            }
            while (hora > 23) {
                hora -= 24;
            }
        }
    }
}
