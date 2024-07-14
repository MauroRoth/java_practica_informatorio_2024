/*
 * Cálculo de divisibilidad: Se le solicita que guarden dos números enteros y los
sumen, determine si el primer número es divisible por el segundo número y muestre
el resultado.
 */

package tp1;

public class Iniciado4 {
    public static void main(String[] args) {
        int numero1 = 36, numero2 = 12;
        int suma = numero1 + numero2;

        System.out.println("Suma de dos numeros enteros.");
        System.out.println("Divisibilidad entre los dos números");
    
        System.out.printf("numero 1 = %d\n", numero1);
        System.out.printf("numero 2 = %d\n", numero2);
        System.out.printf("%1$d + %2$d = %3$d\n", numero1,numero2,suma);
    
        if (numero1%numero2==0){System.out.printf("%1$d es divisible entre %2$d.",numero1,numero2);}
        else{System.out.printf("%1$d no es divisible entre %2$d.",numero1,numero2);}
    } 
}
