/**
 * Suma de dos números bis: Se les solicita que guarden dos números enteros y los
sumen. El resultado guardarlo, mostrarlo por pantalla junto con un mensaje que
indique si se trata de un número par o impar.
 */
package tp1;

public class Iniciado2 {
    public static void main(String[] args) {
        int numero1 = 25, numero2 = 12;
        int suma = numero1 + numero2;
        System.out.println("Suma de dos números enteros (bis)(con paridad).");
        System.out.printf("numero 1 = %d\n", numero1);
        System.out.printf("numero 2 = %d\n", numero2);
        System.out.printf("%1$d + %2$d = %3$d\n", numero1,numero2,suma);
        String paridad;
        if (suma%2==0){paridad = "par";}
        else{paridad = "impar";}
        System.out.printf("El resultado de la suma es %1$d y este valor es %2$s",suma,paridad);
    }
}
