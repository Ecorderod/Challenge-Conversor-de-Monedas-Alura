# Conversor de Monedas API

Este proyecto es una aplicación en Java que permite la conversión de monedas utilizando la API de ExchangeRate. El propósito del proyecto es aplicar los principios de Programación Orientada a Objetos (POO) y el consumo de una API externa.

## Características

- Conversión entre diferentes monedas utilizando tasas de cambio actuales.
- Consumo de API HTTP mediante la librería `HttpClient`.
- Manejo de datos en formato JSON utilizando la librería `Gson`.
- Aplicación de buenas prácticas de Programación Orientada a Objetos (POO).

## Instalación

1. Clona el repositorio:
   ```bash
   
   git clone https://github.com/ecordero/Conversor-de-Monedas-Challenge-Alura.git
   
2. Importa el proyecto en tu IDE favorito (por ejemplo, IntelliJ IDEA).

3. Asegúrate de tener las siguientes dependencias en tu archivo pom.xml( Ussis Maven):

4. Coloca tu clave de API directamente en el código donde se realiza la solicitud a la API de ExchangeRate. Ejemplos:

String apiKey = "tu_clave_api_aqui";

## Uso

Al ejecutar la aplicación, verás el siguiente menú de opciones por consola para realizar la conversión de monedas:

CONVERSOR DE MONEDAS
1. USD a COP --- Dólar >>> Peso Colombiano
2. COP a USD --- Peso Colombiano >>> Dólar
3. USD a ARS --- Dólar >>> Peso Argentino
4. ARS a USD --- Peso Argentino >>> Dólar
5. USD a BRL --- Dólar >>> Real Brasileño
6. BRL a USD --- Real Brasileño >>> Dólar
7. SALIR


Selecciona la opción deseada ingresando el número correspondiente, seguido de la cifra de dinero que deseas convertir.


## Tecnologías

- **Java 11**
- **Maven**
- **API de ExchangeRate**
- **Gson** para manipulación de JSON
- **HttpClient** para realizar solicitudes HTTP


## Estructura del Proyecto

ProyectoConversorMonedas

    herramientas
        Api.java
        Conversor.java
    modelos
        Moneda.java
    principal
        Principal.java
    .gitignore
    LEAME.md
    pom.xml

## Autor

www.linkedin.com/in/eduin-nadid-cordero-d-luyz-8b7749140

Este proyecto es una herramienta sencilla y eficiente para realizar conversiones de divisas utilizando una API externa. Gracias a la implementación del paradigma de Programación Orientada a Objetos, el código es flexible, reutilizable y fácil de mantener. Además, las mejores prácticas aplicadas en su desarrollo garantizan la claridad y estructura adecuada del código, lo que facilita futuras ampliaciones o modificaciones.
