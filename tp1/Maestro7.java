/*
 * Cálculo de la fuerza centrípeta:
Escribir un programa en Java que calcule la fuerza centrípeta necesaria para
mantener un objeto en una trayectoria circular, dados su masa, la velocidad angular
y el radio de la trayectoria. Utilizar la fórmula: F_c = m * v^2 / r, donde F_c es la
fuerza centrípeta, m es la masa del objeto, v es la velocidad angular y r es el radio
de la trayectoria.
Muestre el resultado por pantalla.
 */
package tp1;

public class Maestro7 {
    public static void main(String[] args) { 
        System.out.println("Fuerza Centrípeta.");
        String divisor = new String("-").repeat(50);
        System.out.println(divisor);

        double masa=2.5,velocidadTangencial=10,radio=0.5;
        double fuerzaCentripeta = masa*Math.pow(velocidadTangencial, 2)/radio;

        System.out.printf("m = %.2f kg\n",masa); 
        System.out.printf("v(tangencial) = %.2f m/s\n",velocidadTangencial); 
        System.out.printf("r = %.2f m\n",radio); 
        System.out.println(divisor);
        System.out.printf("Fc = %.2f N\u20d7\n",fuerzaCentripeta); 
    }
}
