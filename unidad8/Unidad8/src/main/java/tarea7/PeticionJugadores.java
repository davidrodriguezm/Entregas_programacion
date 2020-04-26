package tarea7;

import retrofit2.Call;
import retrofit2.http.GET;

import java.util.List;

public interface PeticionJugadores {

    @GET("jugadores")
    Call<List<Jugador>> listaFutblistas();
}
