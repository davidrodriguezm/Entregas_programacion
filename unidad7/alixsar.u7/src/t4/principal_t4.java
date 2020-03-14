package t4;

import java.io.*;
import java.util.LinkedHashMap;
import java.util.Scanner;

public class principal_t4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        LinkedHashMap<String,Empleado> dic = new LinkedHashMap<>();
        System.out.println( "Introduzca 1 para leer los datos del fichero, cualquier otro numero (int) para introducirlos a mano");
        int menu = teclado.nextInt();
        teclado.nextLine();
        if ( menu == 1 ) {
            try (ObjectInputStream entrada = new ObjectInputStream( new FileInputStream("src\\t4\\datos_empleados.dat"))){
                dic = (LinkedHashMap<String,Empleado>) entrada.readObject();
            } catch ( Exception e) {
                System.out.println(e.getMessage());
            }
        } else {
            for ( int continuar = 1; continuar == 1; ) {
                System.out.println("Introduzca el dni (String)");
                String dni = teclado.nextLine();
                System.out.println("Introduzca el nombre (String)");
                String nombre = teclado.nextLine();
                System.out.println("Introduzca la edad (int)");
                int edad = teclado.nextInt();
                teclado.nextLine();
                System.out.println("Introduzca la estatura (float) metros");
                float estatura = teclado.nextFloat();
                teclado.nextLine();
                System.out.println("Introduzca el sueldo (int)");
                int sueldo = teclado.nextInt();
                teclado.nextLine();
                Empleado em = new Empleado(dni, nombre, edad, estatura, sueldo);
                dic.put(em.getDni(),em);
                System.out.println("Para introducir mas empleados Introduzca (int): 1 continuar, otro parar");
                continuar = teclado.nextInt();
                teclado.nextLine();
            }
        }
        while ( true ) {
            System.out.println("Introduzca (int):\n 1 visualizar listado, 2 borrar empleado, 3 visualizar empleado, " +
                    "4 modificar empleado, 5 introducir empleado y 6 salir del menu");
            int opcion = teclado.nextInt();
            teclado.nextLine();
            if ( opcion == 6) {
                break;
            }
            switch ( opcion ) {
                case 1:
                    System.out.println("Listado:\n" + dic);
                    break;
                case 2:
                    int continuar_bo = 1;
                    while ( continuar_bo == 1 ) {
                        System.out.println("Introduzca el dni del empleado a borrar");
                        String dni_bo = teclado.nextLine();
                        if ( dic.containsKey(dni_bo) ) {
                            dic.remove(dni_bo);
                            System.out.println("Listado:\n" + dic);
                        } else {
                            System.out.println("No existe ese empleado");
                        }
                        System.out.println("Para borrar mas empleados Introduzca (int): 1 continuar, otro parar");
                        continuar_bo = teclado.nextInt();
                        teclado.nextLine();
                    }
                    break;
                case 3:
                    System.out.println("Introduzca el dni del empleado a visualizar");
                    String dni_visu = teclado.nextLine();
                    if ( dic.containsKey(dni_visu) ) {
                        System.out.println( dic.get(dni_visu) );
                    } else {
                        System.out.println("No existe ese empleado");
                    }
                    break;
                case 4:
                    int continuar_modi = 1;
                    while ( continuar_modi == 1 ) {
                        System.out.println("Introduzca el dni del empleado a modificar (String)");
                        String dni_modi = teclado.nextLine();
                        if ( dic.containsKey(dni_modi) ) {
                            System.out.println( dic.get(dni_modi) );
                            System.out.println("Introduzca el nombre (String)");
                            String nombre_modi = teclado.nextLine();
                            System.out.println("Introduzca la edad (int)");
                            int edad_modi = teclado.nextInt();
                            teclado.nextLine();
                            System.out.println("Introduzca la estatura (float) metros");
                            float estatura_modi = teclado.nextFloat();
                            teclado.nextLine();
                            System.out.println("Introduzca el sueldo (int)");
                            int sueldo_modi = teclado.nextInt();
                            teclado.nextLine();
                            Empleado em = dic.get(dni_modi);
                            em.setNombre(nombre_modi);
                            em.setEdad(edad_modi);
                            em.setEstatura(estatura_modi);
                            em.setSueldo(sueldo_modi);
                            dic.put(em.getDni(),em);
                        } else {
                            System.out.println("No existe ese empleado");
                        }
                        System.out.println("Listado:\n" + dic);
                        System.out.println("Para modificar mas empleados Introduzca (int): 1 continuar, otro parar");
                        continuar_modi = teclado.nextInt();
                        teclado.nextLine();
                    }
                    break;
                case 5:
                    int continuar_intro = 1;
                    while ( continuar_intro == 1 ) {
                        System.out.println("Introduzca el dni (String)");
                        String dni_intro = teclado.nextLine();
                        System.out.println("Introduzca el nombre (String)");
                        String nombre_intro = teclado.nextLine();
                        System.out.println("Introduzca la edad (int)");
                        int edad_intro = teclado.nextInt();
                        teclado.nextLine();
                        System.out.println("Introduzca la estatura (float) metros");
                        float estatura_intro = teclado.nextFloat();
                        teclado.nextLine();
                        System.out.println("Introduzca el sueldo (int)");
                        int sueldo_intro = teclado.nextInt();
                        teclado.nextLine();
                        Empleado em = new Empleado(dni_intro, nombre_intro, edad_intro, estatura_intro, sueldo_intro);
                        dic.put(em.getDni(),em);
                        System.out.println("Listado:\n" + dic);
                        System.out.println("Para introducir mas empleados Introduzca (int): 1 continuar, otro parar");
                        continuar_intro = teclado.nextInt();
                        teclado.nextLine();
                    }
                    break;
            }
        }
        try (ObjectOutputStream salida = new ObjectOutputStream( new FileOutputStream("src\\t4\\datos_empleados.dat"))){
            salida.writeObject(dic);
        } catch ( Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
