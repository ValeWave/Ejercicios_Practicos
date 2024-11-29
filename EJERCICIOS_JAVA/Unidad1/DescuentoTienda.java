public class DescuentoTienda {
    public static void main(String[] args) {
        // Precios originales
        double precioCamiseta = 25.0;
        double precioPantalon = 30.0;

        // Descuentos
        final double DESCUENTO = 0.15; //15%
        final double DESCUENTO_ADICIONAL = 0.05; //5%

        // Cálculo de precios con descuento
        double precioCamisetaDescuento = precioCamiseta * (1 - DESCUENTO);
        double precioPantalonDescuento = precioPantalon * (1 - DESCUENTO);

        // Segunda camiseta con descuento adicional
        double precioSegundaCamiseta = precioCamisetaDescuento * (1 - DESCUENTO_ADICIONAL);

        // Total
        double precioTotal = precioCamisetaDescuento + precioPantalonDescuento + precioSegundaCamiseta;

        // Resultado
        System.out.println("El precio total de ambas prendas y la segunda camiseta es: $" + precioTotal);
    }
}
