package tarea3;

import java.util.Scanner;

public class principal_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        while ( true ) {
            System.out.println("Introduzca (int):\n 1.Insertar cliente, 2.Asignar empleado a cliente, " +
                    "3.Añadir producto a pedido, 4.Mostrar con detalle un pedido, 5.Salir de la aplicación");
            int menu = teclado.nextInt();
            teclado.nextLine();
            if ( menu == 5) {
                ConexionBD_3.close();
                break;
            }
            System.out.println();
            switch ( menu ) {
                case 1:
                    InsertarCliente.insertar_cliente();
                    break;
                case 2:
                    AsignarEmpleado.asignar_empleado();
                    break;
                case 3:
                    ProductoPedido.producto_pedido();
                    break;
                case 4:
                    MostrarPedido.mostrar_pedido();
                    break;
                default:
                    System.out.println("Introducir (int) del 1 al 5");
                    break;
            }
        }
    }
}
