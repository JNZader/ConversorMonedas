# Conversor de Monedas

Este proyecto es un conversor de monedas desarrollado en Java que permite a los usuarios convertir entre diferentes divisas, incluyendo Dólar estadounidense (USD), Peso Argentino (ARS), Real Brasileño (BRL) y Peso Colombiano (COP).

## Características

- Conversión bidireccional entre las siguientes monedas:
  - Dólar <-> Peso Argentino
  - Dólar <-> Real Brasileño
  - Dólar <-> Peso Colombiano
- Interfaz de línea de comandos fácil de usar
- Utiliza la API de ExchangeRate-API para obtener tasas de cambio en tiempo real
- Manejo de errores para entradas inválidas

## Requisitos

- Java JDK 11 o superior
- Conexión a Internet (para obtener tasas de cambio en tiempo real)
- Dependencias:
  - Gson (para el parsing de JSON)

## Cómo usar

1. Compile el proyecto con su IDE favorito o usando el comando `javac` en la línea de comandos.
2. Ejecute la clase `Main`.
3. Siga las instrucciones en pantalla para seleccionar el tipo de conversión que desea realizar.
4. Ingrese el monto que desea convertir cuando se le solicite.
5. El programa mostrará el resultado de la conversión.
6. Puede realizar múltiples conversiones o seleccionar la opción de salir para terminar el programa.

## Estructura del proyecto

- `Main.java`: Contiene el menú principal y la lógica de interacción con el usuario.
- `Conversor.java`: Maneja la lógica de conversión y las llamadas a la API.
- `CambioMoneda.java`: Clase record para almacenar los datos de la conversión.

## Notas

- Este proyecto utiliza la API gratuita de ExchangeRate-API. Asegúrese de revisar los términos de uso y las limitaciones de la API.
- La clave API está incluida en el código por simplicidad. En un entorno de producción, se recomienda manejar las claves API de forma más segura.
