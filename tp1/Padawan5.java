/*
 * Conversión a kilogramos: Guarde en un espacio de memoria sus libras y luego, en
otro espacio de memoria realice la conversión de esas libras a kilogramos. Utilice
una constante de los valores que no van a cambiar en esta conversión. Muestre el
resultado por pantalla
 */
package tp1;

public class Padawan5 {
    public static void main(String[] args) {
        double libras = 171.5;
        final double factorDeConversionLbKg = 0.453592;
        double kilogramos = libras*factorDeConversionLbKg;
        System.out.println("Conversor libras a kilogramos.");
        System.out.printf("%1$6.2f libras = %2$6.2f kilogramos\n",libras,kilogramos);
    }
}
