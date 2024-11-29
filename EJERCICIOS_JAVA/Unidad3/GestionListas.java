package Unidad3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class GestionListas {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();
        lista.add("Elemento 1");
        lista.add("Elemento 2");
        lista.add("Elemento 3");

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese el índice del elemento a obtener: ");
            int indice = scanner.nextInt();

            String elemento = lista.get(indice);
            System.out.println("Elemento obtenido: " + elemento);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: El índice está fuera del rango válido. Intente con un índice entre 0 y " + (lista.size() - 1));
        } finally {
            scanner.close();
        }
    }
}
