package t1.a4;

import t1.a1.Hora;

public class HoraExacta_4 extends Hora {
    protected int segundo;
    public HoraExacta_4(int hora, int minuto, int segundo) {
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
    @Override
    public boolean equals(Object otra_hora) {
        HoraExacta_4 otraHoraExacta = (HoraExacta_4) otra_hora;
        boolean iguales = false;
        if (this.hora == otraHoraExacta.hora && this.minuto == otraHoraExacta.minuto
                && this.segundo == otraHoraExacta.segundo) {
            iguales = true;
        }
        return iguales;
    }
}
