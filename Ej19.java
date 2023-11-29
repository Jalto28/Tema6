import java.util.Random;

public class Ej19 {
    public static void main(String[] args) {
        // Generar un array de 100 enteros aleatorios entre 0 y 100
        int[] array = generarArrayAleatorio();

        // Imprimir los múltiplos de 5
        System.out.println("Múltiplos de 5:");
        imprimirMultiplosDe5(array);

        // Imprimir los elementos que son 0
        System.out.println("\nElementos que son 0:");
        imprimirElementosCero(array);

        // Imprimir los múltiplos de 10
        System.out.println("\nMúltiplos de 10:");
        imprimirMultiplosDe10(array);
    }

    // Método para generar un array de 100 enteros aleatorios entre 0 y 100
    private static int[] generarArrayAleatorio() {
        int[] array = new int[100];
        Random random = new Random();

        for (int i = 0; i < 100; i++) {
            array[i] = random.nextInt(101); // Números entre 0 y 100
        }

        return array;
    }

    // Método para imprimir los múltiplos de 5
    private static void imprimirMultiplosDe5(int[] array) {
        for (int i = 0; i < 100; i++) {
            if (array[i] % 5 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    // Método para imprimir los elementos que son 0
    private static void imprimirElementosCero(int[] array) {
        for (int i = 0; i < 100; i++) {
            if (array[i] == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    // Método para imprimir los múltiplos de 10
    private static void imprimirMultiplosDe10(int[] array) {
        for (int i = 0; i < 100; i++) {
            if (array[i] % 10 == 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }
}