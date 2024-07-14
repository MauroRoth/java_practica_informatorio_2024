/*
 * Descontador: Se le solicita que guarde un número en un espacio de memoria y
discretamente dicho número 20 veces sin usar asignación. ¿Que operador podría
usar para hacerlo?
 */
package tp1;

public class Padawan2 {
    public static void main(String[] args) { 
        int numero1 = 50, numero2 = numero1;
        System.out.println("Decontador - Decremento.");
        System.out.println("\tnumero: "+numero1);
        System.out.println("--numero - numero--");
        for(int i=0;i<20;i++){
            System.out.printf("%1$d\t - \t%2$d\n",--numero1,numero2--);

        }
    }
}
