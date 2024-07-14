/*
 * Conversión de dólares a pesos: Escribir un programa en Java que solicite al
usuario una cantidad en dólares y muestre el equivalente en pesos, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 dólar = 20 pesos, y el
usuario ingresa 50 dólares, el programa deberá mostrar 1000 pesos.
 */
package tp1;

import java.util.Scanner;

public class Caballero2 {
    public static void main(String[] args) {
        String titulo = "Conversor Dólares a Pesos.";
        System.out.println(titulo.toUpperCase());
        System.out.print("\tIngrese Cantidad de Dólares a Convertir: ");
        Scanner scan = new Scanner(System.in);
        double dolares = scan.nextDouble();
        scan.close();
        final double tasaPesosDolares = 1000;
        double pesos = dolares*tasaPesosDolares;
        System.out.printf("\t\t%1$.2f USD = %2$.2f ARS",dolares,pesos);
    }
}
