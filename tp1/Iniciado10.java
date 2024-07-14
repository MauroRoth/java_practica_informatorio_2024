/*
 * Acumulador: Se le solicita que guarde en un espacio de memoria la acumulación
de quince multiplicaciones entre dos números enteros divididos por el número de la
multiplicación. Por ejemplo:
Numero1*Numero2/1 + Numero1*Numero2/2 + … + Numero1*Numero2/15
El resultado mostrarlo por pantalla.
 */
package tp1;

public class Iniciado10 {
    public static void main(String[] args) {
        int numero1=1,numero2=2;
        double acumulador=0;
        double multiplicacion=numero1*numero2;
        for(int i=0;i<15;i++){
            acumulador += multiplicacion/(i+1);
        }
        System.out.println("Acumulador.");
        System.out.println(acumulador);
    }
}
