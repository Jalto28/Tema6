import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un array de 10 elementos de tipo char
        char[] array = new char[10];

        // Utilizar un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Introducir los valores en el array
        System.out.println("Introduce los valores del array de tipo char:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.next().charAt(0);
        }

        // Cerrar el scanner después de su uso
        scanner.close();

        // Visualizar los elementos en las posiciones pares
        System.out.println("\nElementos en posiciones pares:");

        for (int i = 0; i < 10; i += 2) {
            System.out.print(array[i] + " ");
        }

        // Visualizar los elementos en las posiciones impares
        System.out.println("\nElementos en posiciones impares:");

        for (int i = 1; i < 10; i += 2) {
            System.out.print(array[i] + " ");
        }
    }
}