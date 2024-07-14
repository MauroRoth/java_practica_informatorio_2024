/*
 * Cálculo de la hipotenusa de un triángulo:
Escribir un programa en Java que calcule la hipotenusa de un triángulo rectángulo,
dados los valores de los catetos. Utilizar la fórmula: h^2 = a^2 + b^2, donde h es la
hipotenusa, a y b son los catetos.
 */
package tp1;

public class Maestro3 {
    public static void main(String[] args) {
        double catetoA=5, catetoB=12;
        double hipotenusa = Math.sqrt(Math.pow(catetoA, 2)+Math.pow(catetoB, 2));
        System.out.println("Hipotenusa de un Triángulo Rectángulo.");
        System.out.printf("Cateto A = %.2f\n",catetoA);
        System.out.printf("Cateto B = %.2f\n",catetoB);
        System.out.printf("Hipotenusa = %.2f\n",hipotenusa);
    }
}
