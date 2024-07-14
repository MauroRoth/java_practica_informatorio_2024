/**
 * Caracteres : Guarde en distintos espacios de memoria los caracteres de su nombre
y luego imprimirlos por pantalla. ¿Por qué no puede usar "" en el char?
 */
package tp1;

public class Iniciado3 {
    public static void main(String[] args) {
        char c1='M', c2='A', c3='U', c4='R', c5='O';
        System.out.println("Caracteres de mi nombre.");
        System.out.printf("%1$c%2$c%3$c%4$c%5$c",c1,c2,c3,c4,c5);
    }
    


}
