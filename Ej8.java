import java.util.Scanner;

public class Ej8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Llamar al método para mostrar cada palabra y su longitud en dos columnas
        mostrarPalabrasConLongitud(frase);
    }

    public static void mostrarPalabrasConLongitud(String frase) {
        if (frase == null || frase.isEmpty()) {
            System.out.println("La frase es nula o vacía. Ingresa una frase válida.");
            return;
        }

        // Dividir la frase en palabras usando el espacio en blanco como delimitador
        String[] palabras = frase.split(" ");

        // Imprimir cada palabra y su longitud en dos columnas
        System.out.printf("%-20s%s%n", "Palabra", "Longitud");
        System.out.println("--------------------");

        for (String palabra : palabras) {
            int longitud = palabra.length();
            System.out.printf("%-20s%d%n", palabra, longitud);
        }
    }
}
