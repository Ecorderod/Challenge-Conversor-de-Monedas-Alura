package com.ChallengeConversorMonedaBackend.modelos;

import com.google.gson.annotations.SerializedName;

import java.util.Map;

public class Moneda {

    @SerializedName("base_code")
    private String codigoMoneda;

    @SerializedName("conversion_rates")
    private Map<String, Double> tasasDeCambio;

    public String getCodigoMoneda() {
        return codigoMoneda;
    }

    public Map<String, Double> getTasasDeCambio() {
        return tasasDeCambio;
    }
}
