package t1.a3;

import t1.a1.Hora;

public class HoraExacta extends Hora {
    protected int segundo;
    public HoraExacta(int hora, int minuto, int segundo) {
        super(hora, minuto);
        if ( segundo < 60 && segundo >= 0 ) {
            this.segundo = segundo;
        } else {
            System.out.println("Los segundos debe ser entre 0 y 59");
        }
    }
    public void Set_segundo( int segundo ) {
        if ( segundo <= 59 && segundo >= 0 ) {
            this.segundo = segundo;
        } else {
            System.out.println("Los segundos debe ser entre 0 y 59");
        }
    }
    @Override
    public void Inc(){
        segundo++;
        Ajustar_segundo();
        Ajustar_minuto();
        Ajustar_hora();
    }
    public void Ajustar_segundo() {
        while (segundo > 59) {
            segundo -= 60;
            minuto++;
        }
    }
    @Override
    public String ToString() {
        String reloj;
        reloj = hora + ":" + minuto + ":" + segundo;
        return reloj;
    }
}
