/*
 * Conversión de pesos a euros: Escribir un programa en Java que solicite al usuario
una cantidad en pesos y muestre el equivalente en euros, utilizando una tasa de
cambio fija. Por ejemplo, si la tasa de cambio es de 1 euro = 20 pesos, y el usuario
ingresa 5000 pesos, el programa deberá mostrar 250 euros.
 */
package tp1;

import java.util.Scanner;

public class Caballero5 {
    public static void main(String[] args) { 
        String titulo = "Conversor Pesos a Euros.";
        System.out.println(titulo.toUpperCase());
        System.out.print("\tIngrese Cantidad de Pesos a Convertir: ");
        Scanner scan = new Scanner(System.in);
        double pesos = scan.nextDouble();
        scan.close();
        final double tasaEurosPesos = 0.001;
        double euros = pesos*tasaEurosPesos;
        System.out.printf("\t\t%1$.2f ARS = %2$.2f EUR",pesos,euros);
    }
}
