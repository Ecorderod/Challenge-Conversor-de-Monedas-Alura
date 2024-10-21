package com.ChallengeConversorMonedaBackend.herramientas;

import com.ChallengeConversorMonedaBackend.modelos.Moneda;
import com.google.gson.Gson;

public class Conversor {

    private String monedaBase;
    private String monedaDestino;
    private double cantidad;

    public Conversor(String monedaBase, String monedaDestino, double cantidad) {
        this.monedaBase = monedaBase;
        this.monedaDestino = monedaDestino;
        this.cantidad = cantidad;
    }

    public double convertir() {
        Api api = new Api();
        Gson gson = new Gson();

        String respuestaJson = api.obtenerTasaDeCambio(monedaBase);

        // Imprime el JSON para verificar si llega correctamente
        //System.out.println("Respuesta JSON de la API: " + respuestaJson);

        // Convierte el JSON en un objeto Moneda
        Moneda moneda = gson.fromJson(respuestaJson, Moneda.class);

        if (moneda.getTasasDeCambio() == null) {
            throw new RuntimeException("No se pudieron obtener las tasas de cambio. Verifica la respuesta de la API.");
        }

        // Obtiene la tasa de cambio para la moneda de destino
        Double tasaDeCambio = moneda.getTasasDeCambio().get(monedaDestino.toUpperCase());

        if (tasaDeCambio != null) {
            return tasaDeCambio * cantidad;
        } else {
            throw new IllegalArgumentException("La moneda de destino no es válida.");
        }
    }
}
