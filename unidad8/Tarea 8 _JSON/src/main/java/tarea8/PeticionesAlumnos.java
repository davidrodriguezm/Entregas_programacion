package tarea8;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.ArrayList;

public interface PeticionesAlumnos {

    @GET("alumnos")
    Call<ArrayList<Alumno>> listaAlumnos();

    @GET("asignaturas")
    Call<ArrayList<Asignatura>> listaAsignaturas();
}
