package tarea7;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class principal_7 {
    public static void main(String[] args) {
        Retrofit retro = new Retrofit.Builder()
                .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        PeticionJugadores jugadores = retro.create(PeticionJugadores.class);
        try {
            Response<List<Jugador>> respuesta = jugadores.listaFutblistas().execute();
            if (respuesta.isSuccessful()) {
                List<Jugador> futbolistas = respuesta.body();
                System.out.println(futbolistas);
            } else {
                System.out.println("Peticion no valida");
            }
        } catch ( IOException e ) {
            System.out.println(e.getMessage());
        }
    }
}
