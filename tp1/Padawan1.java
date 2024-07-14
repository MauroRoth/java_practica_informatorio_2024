/*
 * Contador: Se le solicita que guarde un número en un espacio de memoria e
incremente dicho número 20 veces sin usar asignación. ¿Que operador podría usar
para hacerlo?
 */
package tp1;

public class Padawan1 {
    public static void main(String[] args) {
        int numero1 = 20, numero2 = numero1;
        System.out.println("Contador - Incremento.");
        System.out.println("\tnumero: "+numero1);
        System.out.println("++numero - numero++");
        for(int i=0;i<20;i++){
            System.out.printf("%1$d \t - \t%2$d\n",++numero1,numero2++);

        }
    } 
}
