/*
 * Conversión de bitcoins a dólares: Escribir un programa en Java que solicite al
usuario una cantidad en bitcoins y muestre el equivalente en dólares, utilizando una
tasa de cambio fija. Por ejemplo, si la tasa de cambio es de 1 bitcoin = 50000
dólares, y el usuario ingresa 0.5 bitcoins, el programa deberá mostrar 25000 dólares.
 */
package tp1;

import java.util.Scanner;

public class Caballero6 {
    public static void main(String[] args) { 
        String titulo = "Conversor Bitcoins a Dólares.";
        System.out.println(titulo.toUpperCase());
        System.out.print("\tIngrese Cantidad de Bitcoins a Convertir: ");
        Scanner scan = new Scanner(System.in);
        double bitcoins = scan.nextDouble();
        scan.close();
        final double tasaDolaresBitcoins = 60014.60;
        double dolares = bitcoins*tasaDolaresBitcoins;
        System.out.printf("\t\t%1$.2f BTC = %2$.2f USD",bitcoins,dolares);
    }
}
