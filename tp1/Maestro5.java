/*
 * Cálculo de la energía cinética:
Escribir un programa en Java que calcule la energía cinética de un objeto en
movimiento, dados su masa y su velocidad.
Utilizar la fórmula: E = (1/2) * m * v^2, donde E es la energía cinética, m es la masa
del objeto y v es la velocidad.
Muestre el resultado por pantalla.
 */
package tp1;

public class Maestro5 {
    public static void main(String[] args) {
        System.out.println("Energía Cinética.");
        double masa=1,velocidad=0.5;
        double energiaCinetica = (masa*Math.pow(velocidad, 2))/2;
        System.out.printf("m = %.2f kg\n",masa); 
        System.out.printf("v = %.2f m/s\n",velocidad); 
        System.out.printf("Ec = %.2f J\n",energiaCinetica); 
    }
}
