/*
 * Conversión de euros a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en euros y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 1.20 dólares, y
el usuario ingresa 100 euros, el programa deberá mostrar 120 dólares.
 */
package tp1;

import java.util.Scanner;

public class Caballero3 {
    public static void main(String[] args) { 
        String titulo = "Conversor Euros a Dólares.";
        System.out.println(titulo.toUpperCase());
        System.out.print("\tIngrese Cantidad de Euros a Convertir: ");
        Scanner scan = new Scanner(System.in);
        double euros = scan.nextDouble();
        scan.close();
        final double tasaDolaresEuros = 1.0905;
        double dolares = euros*tasaDolaresEuros;
        System.out.printf("\t\t%1$.2f EUR = %2$.2f USD",euros,dolares);
    }
}
