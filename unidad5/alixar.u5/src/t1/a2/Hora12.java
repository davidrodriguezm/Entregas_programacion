package t1.a2;

import t1.a1.Hora;

public class Hora12 extends Hora {
    private Meridiano dia_noche;

    public Hora12(int hora, int minuto, Meridiano dia_noche) {
        super(hora,minuto);
        Set_hora(hora);
        this.dia_noche = dia_noche;
    }
    @Override
    public void Set_hora( int hora ) {
        if ( hora <= 12 && hora >=0 ) {
            super.hora = hora;
        } else {
            System.out.println("La hora debe ser entre 0 y 12");
        }
    }
    @Override
    public void Inc(){
        minuto++;
        Ajustar_minuto();
        Ajustar_hora();
    }
    @Override
    public void Ajustar_hora() {
        if ( hora > 12) {
            hora -= 12;
            if (dia_noche.equals(Meridiano.AM)) {
                dia_noche =  Meridiano.PM;
            } else {
                dia_noche = Meridiano.AM;
            }
        }
    }
    @Override
    public String ToString( ) {
        String reloj;
        reloj = hora + ":" + minuto + " " + dia_noche;
        return reloj;
    }
}



