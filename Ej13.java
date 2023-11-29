import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Crear un array de 10 elementos
        int[] array = new int[10];

        // Utilizar un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Introducir los valores en el array
        System.out.println("Introduce los valores del array:");

        for (int i = 0; i < 10; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            array[i] = scanner.nextInt();
        }

        // Cerrar el scanner después de su uso
        scanner.close();

        // Visualizar los valores del array
        System.out.println("Valores del array:");

        for (int i = 0; i < 10; i++) {
            System.out.print(array[i] + " ");
        }

        // Calcular la media de los elementos
        double suma = 0;

        for (int i = 0; i < 10; i++) {
            suma += array[i];
        }

        double media = suma / 10;

        // Visualizar la media
        System.out.println("\nMedia de los elementos: " + media);
    }