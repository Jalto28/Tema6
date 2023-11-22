import java.util.Scanner;

public class Ej7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que introduzca una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Llamar al método para mostrar cada palabra en una línea
        mostrarPalabrasEnLineas(frase);
    }

    public static void mostrarPalabrasEnLineas(String frase) {
        if (frase == null || frase.isEmpty()) {
            System.out.println("La frase es nula o vacía. Ingresa una frase válida.");
            return;
        }

        // Dividir la frase en palabras usando el espacio en blanco como delimitador
        String[] palabras = frase.split(" ");

        // Imprimir cada palabra en una línea diferente
        System.out.println("Palabras en líneas:");

        for (String palabra : palabras) {
            System.out.println(palabra);
        }
    }
}
