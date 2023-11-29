public class Ej20 {
    public static void main(String[] args) {
        // Ejemplo de uso
        int[] miArray = {1, 3, 5, 7, 9, 11};
        int numeroBuscado = 5;

        // Llamada al método y muestra del resultado
        boolean resultado = buscarNumeroEnArray(miArray, numeroBuscado);

        if (resultado) {
            System.out.println("El número " + numeroBuscado + " está en el array.");
        } else {
            System.out.println("El número " + numeroBuscado + " no está en el array.");
        }
    }

    // Método para buscar un número en un array
    private static boolean buscarNumeroEnArray(int[] array, int numero) {
        for (int elemento : array) {
            if (elemento == numero) {
                return true;  // El número está en el array
            }
        }
        return false;  // El número no está en el array
    }
}
