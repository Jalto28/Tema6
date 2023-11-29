import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Utilizar un objeto Scanner para leer la entrada del usuario
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que introduzca el número de estaturas (N)
        System.out.print("Introduce el número de estaturas (N): ");
        int N = scanner.nextInt();

        // Crear un array para almacenar las estaturas
        double[] estaturas = new double[N];

        // Introducir las estaturas en el array
        System.out.println("Introduce las estaturas de las personas:");

        for (int i = 0; i < N; i++) {
            System.out.print("Estatura de persona " + (i + 1) + ": ");
            estaturas[i] = scanner.nextDouble();
        }

        // Cerrar el scanner después de su uso
        scanner.close();

        // Calcular la media de todas las estaturas
        double sumaEstaturas = 0;

        for (int i = 0; i < N; i++) {
            sumaEstaturas += estaturas[i];
        }

        double mediaEstaturas = sumaEstaturas / N;

        // Contar cuántas personas tienen estatura superior a la media
        int contadorEstaturasSuperiores = 0;

        for (int i = 0; i < N; i++) {
            if (estaturas[i] > mediaEstaturas) {
                contadorEstaturasSuperiores++;
            }
        }

        // Mostrar la información
        System.out.println("Media de estaturas: " + mediaEstaturas);
        System.out.println("Número de personas con estatura superior a la media: " + contadorEstaturasSuperiores);
    }
}