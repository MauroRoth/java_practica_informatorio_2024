/*
 * Multiplicación: Se le solicita que guarde dos números reales y los multiplique, luego
guarde otros dos números enteros y multiplicarlos. Guarde en un espacio de
memoria la suma entre estas dos multiplicaciones ¿Que resultado le da? ¿Entero o
real? ¿Por qué?
 */
package tp1;

public class Iniciado7 {
    public static void main(String[] args) {
        double numero1=5.56, numero2=6.25; 
        int numero3=4,numero4=8; 
        double multiplicacionReal = numero1*numero2;
        int multiplicacionEntera = numero3*numero4;
        System.out.println("Multiplicación y tipos de datos.\n");
        System.out.println("\tMultiplicación entre Reales:");
        System.out.printf("\t%1$5.2f x %2$5.2f = %3$5.2f\n\n",numero1,numero2,multiplicacionReal);
        System.out.println("\tMultiplicación entre Enteros:");
        System.out.printf("\t%1$d x %2$d = %3$d\n\n",numero3,numero4,multiplicacionEntera);
        System.out.printf("Suma de ambas multiplicaciones: %5.2f\n",(multiplicacionReal+multiplicacionEntera));
        System.out.print("Tipo de dato de la suma de las multiplicaciones: ");
        System.out.println(((Object)(multiplicacionReal+multiplicacionEntera)).getClass().getName()); 
    }
    
    

}
