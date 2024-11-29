package Unidad3;

import java.util.Scanner;

class NumeroNegativoException extends Exception {
    public NumeroNegativoException(String mensaje) {
        super(mensaje);
    }
}

public class CalculoRaizCuadrada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese un número: ");
            double numero = scanner.nextDouble();

            if (numero < 0) {
                throw new NumeroNegativoException("No se puede calcular la raíz cuadrada de un número negativo.");
            }

            double raiz = Math.sqrt(numero);
            System.out.println("La raíz cuadrada es: " + raiz);
        } catch (NumeroNegativoException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            scanner.close();
        }
    }
}

