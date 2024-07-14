/*
 * Cálculo de la velocidad final:
Escribir un programa en Java que calcule la velocidad final de un objeto en caída
libre, dados su velocidad inicial, la aceleración de la gravedad y el tiempo
transcurrido. Utilizar la fórmula: v_f = v_i + g * t, donde v_f es la velocidad final, v_i
es la velocidad inicial, g es la aceleración de la gravedad y t es el tiempo
transcurrido.
 */
package tp1;

public class Maestro6 {
    public static void main(String[] args) {
        System.out.println("Velocidad Final en Caída Libre.");
        String divisor = new String("-").repeat(50);
        System.out.println(divisor);
        double velocidadInicial=0,tiempo=10;
        final double g = 9.8;
        double velocidadFinal = velocidadInicial + g*tiempo;
        System.out.printf("vi = %.2f m/s\n",velocidadInicial); 
        System.out.printf("g = %.2f m/s\u00b2\n",g); 
        System.out.printf("t = %.2f s\n",tiempo); 
        System.out.println(divisor);
        System.out.printf("vf = %.2f m/s\n",velocidadFinal); 
    }
}
