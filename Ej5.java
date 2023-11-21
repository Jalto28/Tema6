import java.util.Scanner;

public class Ej5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Llamar al método para encontrar la palabra más larga
        encontrarPalabraMasLarga(frase);
    }

    public static void encontrarPalabraMasLarga(String frase) {
        if (frase == null || frase.isEmpty()) {
            System.out.println("La frase es nula o vacía. Introduce una frase válida.");
            return;
        }

        // Dividir la frase en palabras usando el espacio en blanco como delimitador
        String[] palabras = frase.split(" ");

        // Inicializar variables para la palabra más larga y su longitud
        String palabraMasLarga = "";
        int longitudMasLarga = 0;

        // Iterar a través de cada palabra
        for (String palabra : palabras) {
            // Eliminar signos de puntuación al final de la palabra (si los hay)
            palabra = palabra.replaceAll("[^a-zA-Z0-9]+$", "");

            // Verificar la longitud de la palabra
            if (palabra.length() > longitudMasLarga) {
                longitudMasLarga = palabra.length();
                palabraMasLarga = palabra;
            }
        }

        // Mostrar los resultados
        System.out.println("Palabra más larga: " + palabraMasLarga);
        System.out.println("Longitud: " + longitudMasLarga + " caracteres");
    }
}