package com.ChallengeConversorMonedaBackend.principal;

import com.ChallengeConversorMonedaBackend.herramientas.Conversor;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 7) {
            System.out.println("\nCONVERSOR DE MONEDAS");
            System.out.println("1. USD a COP --- Dólar >>> Peso Colombiano" +
                    "\n2. COP a USD --- Peso Colombiano >>> Dólar\n3. USD a ARS --- Dólar >>> Peso Argentino" +
                    "\n4. ARS a USD --- Peso Argentino >>> Dólar\n5. USD a BRL --- Dólar >>> Real Brasileño" +
                    "\n6. BRL a USD --- Real Brasileño >>> Dólar\n7. SALIR");
            opcion = scanner.nextInt();

            if (opcion != 7) {
                System.out.print("Ingrese la cantidad a convertir: ");
                double cantidad = scanner.nextDouble();
                realizarConversion(opcion, cantidad);
            } else {
                System.out.println("¡Gracias por usar el conversor!");
            }
        }
    }

    public static void realizarConversion(int opcion, double cantidad) {
        String monedaBase = "";
        String monedaDestino = "";

        switch (opcion) {
            case 1 -> { monedaBase = "USD"; monedaDestino = "COP"; }
            case 2 -> { monedaBase = "COP"; monedaDestino = "USD"; }
            case 3 -> { monedaBase = "USD"; monedaDestino = "ARS"; }
            case 4 -> { monedaBase = "ARS"; monedaDestino = "USD"; }
            case 5 -> { monedaBase = "USD"; monedaDestino = "BRL"; }
            case 6 -> { monedaBase = "BRL"; monedaDestino = "USD"; }
            default -> { System.out.println("Opción no válida."); return; }
        }

        Conversor conversor = new Conversor(monedaBase, monedaDestino, cantidad);
        double resultado = conversor.convertir();
        System.out.println(cantidad + " " + monedaBase + " = " + resultado + " " + monedaDestino);
    }
}

