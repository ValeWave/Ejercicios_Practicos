import java.util.Scanner; 

public class CalcularMedia {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer datos desde el teclado
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario tres números
        System.out.print("Introduce el primer número: ");
        int numero1 = scanner.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = scanner.nextInt();

        System.out.print("Introduce el tercer número: ");
        int numero3 = scanner.nextInt();

        // Calcular la media
        double media = (numero1 + numero2 + numero3) / 3;

        // Mostrar el resultado
        System.out.println("La media de los tres números es: " + media);

        // Cerrar el scanner
        scanner.close();
    }
}
