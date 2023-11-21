import java.util.Scanner;

public class Ej4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Llamar al método para contar vocales y consonantes por palabra
        contarVocalesConsonantesPorPalabra(frase);
    }

    public static void contarVocalesConsonantesPorPalabra(String frase) {
        if (frase == null || frase.isEmpty()) {
            System.out.println("La frase es nula o vacía. Ingresa una frase válida.");
            return;
        }

        // Dividir la frase en palabras usando el espacio en blanco como delimitador
        String[] palabras = frase.split(" ");

        // Iterar a través de cada palabra
        for (String palabra : palabras) {
            int vocales = 0;
            int consonantes = 0;

            // Convertir la palabra a minúsculas para facilitar el conteo
            palabra = palabra.toLowerCase();

            // Iterar a través de cada caracter en la palabra
            for (int i = 0; i < palabra.length(); i++) {
                char caracter = palabra.charAt(i);

                // Verificar si el caracter es una vocal
                if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                    vocales++;
                } else if (Character.isLetter(caracter)) {
                    // Verificar si el caracter es una letra (y no es una vocal)
                    consonantes++;
                }
            }

            // Mostrar los resultados por palabra
            System.out.println("Palabra: " + palabra);
            System.out.println("  Número de vocales: " + vocales);
            System.out.println("  Número de consonantes: " + consonantes);
        }
    }
}