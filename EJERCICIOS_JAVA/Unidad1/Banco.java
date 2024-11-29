public class Banco {
    public static void main(String[] args) {
        // Variables
        double saldoInicial = 1000.0;
        double retiroSemanal = 200.0;
        int semanas = 4;

        // Cálculo del saldo final
        double saldoFinal = saldoInicial - (retiroSemanal * semanas);

        // Resultado
        System.out.println("El saldo final después de 4 semanas es: $" + saldoFinal);
    }
}