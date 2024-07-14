/**
 * Obtener porcentaje : Dados dos números, uno real y el otro entero. Obtenga el
porcentaje que indique el segundo número del primer número.
 */
package tp1;

public class Caballero1 {
    public static void main(String[] args) {
        System.out.println("Porcentaje."); 
        String divisor = new String("-").repeat(70);
        System.out.println(divisor);
        double numero1 = 9.8;
        int numero2 = 5;
        double porcentaje = numero2/numero1*100;
        System.out.println("\tNúmero 1: "+numero1);
        System.out.println("\tNúmero 2: "+numero2);
        System.out.println(divisor);
        System.out.printf("El porcentaje del segundo número respecto del primero es de %.2f \uff05\n",porcentaje);
    }
}
