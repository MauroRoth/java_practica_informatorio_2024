/*
 * Cálculo del área de un círculo: Escribir un programa en Java que calcule el área
de un círculo con un radio de 5 unidades. Buscar la fórmula con la que se
resuelve.
 */
package tp1;

public class Maestro1 {
    public static void main(String[] args) {
        double radio = 5;
        double areaCirculo = Math.PI*Math.pow(radio, 2);
        System.out.println("Área de un círculo.");
        System.out.printf("Radio = %6.2f\n",radio);
        System.out.printf("Área = %6.2f\n",areaCirculo);

    }
}
