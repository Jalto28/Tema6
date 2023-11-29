import java.util.Random;

public class Main {
    public static void main(String[] args) {
        // Crear un array de 30 elementos de tipo double
        double[] notas = new double[30];

        // Generar números aleatorios entre 0 y 10 y almacenarlos en el array
        Random random = new Random();

        for (int i = 0; i < 30; i++) {
            notas[i] = random.nextDouble() * 10;
        }

        // Calcular la media de aquellos elementos mayores o iguales a 5
        double sumaMayoresOIgualesA5 = 0;
        int contadorMayoresOIgualesA5 = 0;

        for (int i = 0; i < 30; i++) {
            if (notas[i] >= 5) {
                sumaMayoresOIgualesA5 += notas[i];
                contadorMayoresOIgualesA5++;
            }
        }

        // Calcular la media total
        double sumaTotal = 0;

        for (int i = 0; i < 30; i++) {
            sumaTotal += notas[i];
        }

        double mediaTotal = sumaTotal / 30;

        // Imprimir la media de aquellos elementos mayores o iguales a 5
        if (contadorMayoresOIgualesA5 > 0) {
            double mediaMayoresOIgualesA5 = sumaMayoresOIgualesA5 / contadorMayoresOIgualesA5;
            System.out.println("Media de notas mayores o iguales a 5: " + mediaMayoresOIgualesA5);
        } else {
            System.out.println("No hay notas mayores o iguales a 5.");
        }

        // Imprimir la media total
        System.out.println("Media total de todas las notas: " + mediaTotal);
    }
}