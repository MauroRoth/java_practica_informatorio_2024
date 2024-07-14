/*
 * Cálculo de la media aritmética:
Escribir un programa en Java que calcule la media aritmética de un conjunto de
números. Utilizar la fórmula: media = (n1 + n2 + ... + nk) / k, donde n1, n2, ..., nk son
los números y k es el número total de elementos. Utilicen variables y constantes
según corresponda.
 */
package tp1;

public class Maestro4 {
    public static void main(String[] args) {
        System.out.println("Media Artimética.");
        int [] conjunto = new int[]{1,3,5,9,7};
        final int k = conjunto.length;
        double acumulador = 0;
        System.out.print("Conjunto = {");
        for (int i=0;i<k;i++){
            acumulador += conjunto[i];
            if (i==k-1){System.out.printf("%d",conjunto[i]);}
            else{System.out.printf("%d,",conjunto[i]);}
        }
        System.out.print("}\n");
        double media = acumulador/k;
        System.out.printf("Media = %.2f",media);
    }
}
