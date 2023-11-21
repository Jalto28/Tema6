import java.util.Scanner;

public class Ej1 {
    public static void main(String[] args) {
        // Solicitar al usuario que introduzca una frase
        Scanner scanner = new Scanner(System.in);
        System.out.print("Introduce una frase: ");
        String inputFrase = scanner.nextLine();

        // Llamar al método para capitalizar la primera letra
        String resultado = capitalizarPrimeraLetra(inputFrase);

        // Mostrar los resultados
        System.out.println("Entrada: " + inputFrase);
        System.out.println("Resultado: " + resultado);
    }

    public static String capitalizarPrimeraLetra(String frase) {
        if (frase == null || frase.isEmpty()) {
            // Manejar casos especiales, como cadena nula o vacía
            return frase;
        }

        // Obtener la primera letra y convertirla a mayúscula
        char primeraLetra = Character.toUpperCase(frase.charAt(0));

        // Construir la nueva cadena con la primera letra en mayúsculas
        StringBuilder resultado = new StringBuilder(primeraLetra + frase.substring(1));

        return resultado.toString();
    }
}