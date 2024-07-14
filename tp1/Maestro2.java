/*
 * Conversión de grados Celsius a grados Fahrenheit : Escribir un programa en
Java que convierta una temperatura en grados Celsius a grados Fahrenheit. Buscar
la fórmula con la que se resuelve.
 */
package tp1;

public class Maestro2 {
    public static void main(String[] args) {
        double celsius = 6;
        double fahrenheit = celsius*1.8+32;
        System.out.println("Conversor Celsius a Fahrenheit."); 
        System.out.printf("%1$6.2f ºC  = %2$6.2f ºF\n",celsius,fahrenheit);
    }
}
