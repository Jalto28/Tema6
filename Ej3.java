import java.util.Scanner;

public class Ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String frase = teclado.nextLine();
        int resultado = contarPalabras(frase);
        System.out.println("Número de palabras: " + resultado);
    }

    public static int contarPalabras(String frase) {
        if (frase == null || frase.isEmpty()) {
            // Manejar casos especiales, como cadena nula o vacía
            return 0;
        }

        // Dividir la cadena en palabras usando el espacio en blanco como delimitador con Split
        String[] palabras = frase.split(" ");

        // El número de palabras es la longitud del array resultante
        return palabras.length;
    }
}
