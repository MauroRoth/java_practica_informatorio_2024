/*
 * Potencia de 2 y 3: Se le solicita que guarde en un espacio de memoria un número y
luego haga la potencia de ese número al cuadrado y al cubo.
 */
package tp1;
 
public class Iniciado9 {
    public static void main(String[] args) {
        int numero = 2;
        double cuadrado = Math.pow(numero, 2);
        double cubo = Math.pow(numero, 3);
        System.out.println("");
        System.out.println("Potencia de 2 y 3.");
        System.out.println("\tNúmero: "+numero);
        System.out.println("\tCuadrado: "+cuadrado);
        System.out.println("\tCubo: "+cubo);
    }
}
