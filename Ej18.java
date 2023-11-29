import java.util.Random;

public class Ej18 {
    public static void main(String[] args) {
        // Generar dos arrays de 10 elementos entre 1 y 10
        int[] array1 = generarArrayAleatorio();
        int[] array2 = generarArrayAleatorio();

        // Calcular la suma de los elementos de los dos arrays
        int[] sumaArray = sumarArrays(array1, array2);

        // Calcular la división de los elementos de los dos arrays
        double[] divisionArray = dividirArrays(array1, array2);

        // Mostrar los resultados
        System.out.println("Array 1: " + arrayToString(array1));
        System.out.println("Array 2: " + arrayToString(array2));
        System.out.println("Suma de los arrays: " + arrayToString(sumaArray));
        System.out.println("División de los arrays: " + arrayToString(divisionArray));
    }

    // Método para generar un array de 10 elementos de tipo entero entre 1 y 10
    private static int[] generarArrayAleatorio() {
        int[] array = new int[10];
        Random random = new Random();

        for (int i = 0; i < 10; i++) {
            array[i] = random.nextInt(10) + 1; // Números entre 1 y 10
        }

        return array;
    }

    // Método para sumar los elementos de dos arrays
    private static int[] sumarArrays(int[] array1, int[] array2) {
        int[] sumaArray = new int[10];

        for (int i = 0; i < 10; i++) {
            sumaArray[i] = array1[i] + array2[i];
        }

        return sumaArray;
    }

    // Método para dividir los elementos de dos arrays
    private static double[] dividirArrays(int[] array1, int[] array2) {
        double[] divisionArray = new double[10];

        for (int i = 0; i < 10; i++) {
            // Evitar la división por cero
            if (array2[i] != 0) {
                divisionArray[i] = (double) array1[i] / array2[i];
            } else {
                divisionArray[i] = Double.NaN; // Indicar que la división no es válida
            }
        }

        return divisionArray;
    }

    // Método para convertir un array en una cadena para su visualización
    private static String arrayToString(int[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    // Método para convertir un array de double en una cadena para su visualización
    private static String arrayToString(double[] array) {
        StringBuilder sb = new StringBuilder("[");
        for (int i = 0; i < array.length; i++) {
            sb.append(array[i]);
            if (i < array.length - 1) {
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }
}