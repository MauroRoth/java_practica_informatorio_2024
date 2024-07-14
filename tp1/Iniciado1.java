/**
* Suma de dos números: Se le solicita que guarden dos 
números enteros y los sumen. El resultado mostrarlo por pantalla.
    */
package tp1;

public class Iniciado1 {
    public static void main(String[] args) {
        int numero1 = 25, numero2 = 12;
        int suma = numero1 + numero2;
        System.out.println("Suma de dos números enteros.");
        System.out.printf("numero 1 = %d\n", numero1);
        System.out.printf("numero 2 = %d\n", numero2);
        System.out.printf("%1$d + %2$d = %3$d", numero1,numero2,suma);
   } 
}
