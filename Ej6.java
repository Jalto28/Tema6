import java.util.Scanner;

public class Ej6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese una frase
        System.out.print("Introduce una frase: ");
        String frase = scanner.nextLine();

        // Solicitar al usuario que ingrese un factor de multiplicación
        System.out.print("Introduce un factor de multiplicación: ");
        int factorMultiplicacion = scanner.nextInt();

        // Llamar al método para repetir la frase
        String resultado = repetirFrase(frase, factorMultiplicacion);

        // Mostrar el resultado
        System.out.println("Resultado: " + resultado);
    }

    public static String repetirFrase(String frase, int factorMultiplicacion) {
        if (frase == null || frase.isEmpty() || factorMultiplicacion <= 0) {
            System.out.println("La frase es nula o vacía, o el factor de multiplicación no es válido.");
            return "";
        }

        // Inicializar un StringBuilder para construir la frase repetida
        StringBuilder resultado = new StringBuilder();

        // Construir la frase repetida
        for (int i = 0; i < factorMultiplicacion; i++) {
            resultado.append(frase);
        }

        return resultado.toString();
    }
}