import java.util.Scanner;

public class Operadores {

    public static void main(String[] args) {
        //Crear scanner 
        Scanner scanner = new Scanner(System.in);
        //Pedir datos por scannen
        System.out.print("Ingrese el primer número: ");
        int numero1 = scanner.nextInt();
        System.out.print("Ingrese el segundo número: ");
        int numero2 = scanner.nextInt();

        //realizar operaciones y asignar a variables
        int suma = numero1 + numero2;
        int resta = numero1 - numero2;
        int multiplicacion = numero1 * numero2;
        int division = numero1 / numero2;
        int modulo = numero1 % numero2;

        //Mostrar operaciones por pantalla
        System.out.println("Suma: " + suma);
        System.out.println("Resta: " + resta);
        System.out.println("Multiplicación: " + multiplicacion);
        System.out.println("División: " + division);
        System.out.println("Módulo: " + modulo);

        //Cerrar scanner
        scanner.close();
    }
}
