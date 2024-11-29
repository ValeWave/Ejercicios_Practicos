import java.util.Scanner;

public class MultiplicacionMatriz {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);
        
        //Se pide el orden de las matrices
        System.out.println("Ingrese el numero de filas de la matriz A");
        int filaA = sc.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz A");
        int columnaA = sc.nextInt();
        int[][] A = new int[filaA][columnaA];
        System.out.println("Ingrese el numero de filas de la matriz B");
        int filaB = sc.nextInt();
        System.out.println("Ingrese el numero de columnas de la matriz B");
        int columnaB = sc.nextInt();
        int[][] B = new int[filaB][columnaB];

        //Se verifica que la operación es valida
        if (columnaA==filaB){

            //Se crea la matriz C
            int[][] C = new int[filaA][columnaB];

            //Se pide ingresar cada valor de las matrices según la posición
            for (int i = 0; i < A.length; i++) {
                for (int j = 0; j < A[i].length; j++) {
                    System.out.println("Ingrese el valor de la posición " + i + ", " + j + " de la matriz A");
                    A[i][j] = sc.nextInt();
                }
            }
            for (int i = 0; i < B.length; i++) {
                for (int j = 0; j < B[i].length; j++) {
                    System.out.println("Ingrese el valor de la posición " + i + ", " + j + " de la matriz B");
                    B[i][j] = sc.nextInt();
                }
            }

            //Multiplicación de matrices
            for (int i = 0; i < filaA; i++) {
                for (int j = 0; j < columnaB; j++) {
                    for (int k = 0; k < columnaA; k++) {
                        C[i][j] += A[i][k] * B[k][j];
                    }
                }
            }

            //Imprimimos la matriz C
            System.out.println("Resultado de la multiplicación de matrices: ");
            for (int i = 0; i < C.length; i++) {
                for (int j = 0; j < C[i].length; j++) {
                    System.out.print(C[i][j] + " ");
                }
            System.out.println();
            }
        }
        else{
            System.out.println("La multiplicación de las matrices no se pude realizar por el orden de las mismas");
            System.out.println("Recuerde el número de filas de A debe ser igual al número de columnas de B");
        }
        sc.close();
    }
}