package tarea8;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;

public class principal_8 {
    public static void main(String[] args) {
        Retrofit retro = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/json_entrega1/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PeticionesAlumnos respuesta = retro.create(PeticionesAlumnos.class);
        ArrayList<Alumno> resultado =  new ArrayList<>();
        try {
            Response<ArrayList<Alumno>> alumnos = respuesta.listaAlumnos().execute();
            ArrayList<Alumno> lista_alum = alumnos.body();
            Response<ArrayList<Asignatura>> asignaturas = respuesta.listaAsignaturas().execute();
            ArrayList<Asignatura> lista_asig = asignaturas.body();
            if (asignaturas.isSuccessful() && alumnos.isSuccessful()) {
                for ( Alumno alum : lista_alum ) {
                    ArrayList<Asignatura> temp_asig = new ArrayList<>();
                    for ( Asignatura asig : lista_asig ) {
                        if ( alum.getId() == asig.getAlumnoId() ) {
                            temp_asig.add(asig);
                        }
                    }
                    if ( temp_asig.size() > 0 ) {
                        alum.setAsignaturas(temp_asig);
                    }
                    resultado.add(alum);
                }
                System.out.println("Alumnos:\n" + resultado);
            } else {
                System.out.println("Peticion no valida");
            }
        } catch ( IOException e ) {
            System.out.println(e.getMessage());
        }
    }
}
