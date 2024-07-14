/*
 * Conversión de libras esterlinas a dólares: Escribir un programa en Java que
solicite al usuario una cantidad en libras esterlinas y muestre el equivalente en
dólares, utilizando una tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1
libra esterlina = 1.40 dólares, y el usuario ingresa 50 libras esterlinas, el programa
deberá mostrar 70 dólares.
 */
package tp1;

import java.util.Scanner;

public class Caballero4 {
    public static void main(String[] args) {
        String titulo = "Conversor Libras Esterlinas a Dólares.";
        System.out.println(titulo.toUpperCase());
        System.out.print("\tIngrese Cantidad de Libras Esterlinas a Convertir: ");
        Scanner scan = new Scanner(System.in);
        double libras = scan.nextDouble();
        scan.close();
        final double tasaDolaresLibras = 1.4;
        double dolares = libras*tasaDolaresLibras;
        System.out.printf("\t\t%1$.2f GBP = %2$.2f USD",libras,dolares);
    }
}
