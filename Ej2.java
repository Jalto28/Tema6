import java.util.Scanner;

public class Ej2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.print("Ingresa una frase: ");
        String frase = scanner.nextLine();

        // Llamar al método para contar vocales y consonantes
        contarVocalesConsonantes(frase);
    }

    public static void contarVocalesConsonantes(String frase) {
        if (frase == null || frase.isEmpty()) {
            System.out.println("La frase es nula o vacía. Ingresa una frase válida.");
            return;
        }

        // Convertir la frase a minúsculas para facilitar el conteo
        frase = frase.toLowerCase();

        int vocales = 0;
        int consonantes = 0;

        // Iterar a través de cada caracter en la frase
        for (int i = 0; i < frase.length(); i++) {
            char caracter = frase.charAt(i);

            // Verificar si el caracter es una vocal
            if (caracter == 'a' || caracter == 'e' || caracter == 'i' || caracter == 'o' || caracter == 'u') {
                vocales++;
            } else if (Character.isLetter(caracter)) {
                // Verificar si el caracter es una letra (y no es una vocal)
                consonantes++;
            }
        }

        // Mostrar los resultados
        System.out.println("Número de vocales: " + vocales);
        System.out.println("Número de consonantes: " + consonantes);
    }
}