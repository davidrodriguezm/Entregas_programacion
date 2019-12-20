package t1.a3paquete.a3prueba;

import t1.a3paquete.a3.CuentaCorriente_3;

public class principal_3_prueba {
    public static void main(String[] args) {
        CuentaCorriente_3 c = new CuentaCorriente_3( "David", "666");
        // double saldo = c.saldo; Al ser private solo se puede ver dentro  de misma la clase
        String nombre = c.nombre;
        // String dni = c.dni; Al ser protected solo se puede ver en la dentro del mismo paquete
        // int limite_descubimiento = c.limite_descubimiento; Al ser private solo se puede ver dentro  de misma la clase

    }
}
