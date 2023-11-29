import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un array de 20 elementos numéricos
        int[] array = new int[20];

        // Utilizar un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Introducir los valores en el array
        System.out.println("Introduce los valores del array:");

        for (int i = 0; i < 20; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Cerrar el scanner después de su uso
        scanner.close();

        // Visualizar los elementos de 4 en 4 en una tabla tabulada
        System.out.println("\nValores del array (de 4 en 4):");

        for (int i = 0; i < 20; i += 4) {
            System.out.printf("%-5d%-5d%-5d%-5d\n", array[i], array[i + 1], array[i + 2], array[i + 3]);
        }
    }
}