package com.ChallengeConversorMonedaBackend.herramientas;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Api {
/* pendiente configurar seguridad para la clave */
    public String obtenerTasaDeCambio(String monedaBase) {

        String ApiKey = "871b8b793ff27292e0fdca80";
        String url = "https://v6.exchangerate-api.com/v6/"+ApiKey+"/latest/"+monedaBase;

        HttpClient cliente = HttpClient.newHttpClient();
        HttpRequest solicitud = HttpRequest.newBuilder()
                .uri(URI.create(url))
                .build();
        try {
            HttpResponse<String> respuesta = cliente
                    .send(solicitud, HttpResponse.BodyHandlers.ofString());
            return respuesta.body();
        } catch (IOException | InterruptedException e) {
            throw new RuntimeException("Error en la conexión con la API", e);
        }
    }
}
