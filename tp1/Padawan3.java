/*
 * Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
en unicode y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
¿Qué es unicode?
 */
package tp1;

public class Padawan3 {
    public static void main(String[] args) {
        char c1='\u004d', c2='\u0041', c3='\u0055', c4='\u0052', c5='\u004f';
        System.out.println("Caracteres de mi nombre.");
        System.out.printf("%1$c%2$c%3$c%4$c%5$c",c1,c2,c3,c4,c5);
    } 
}
