/*
 * Promedio de edad : Guarde en diferentes espacios de memoria distintos valores de
edad y los nombres de esas personas, luego saque su promedio e imprima por
pantalla el nombre de la persona, su edad. Por último imprimir el promedio de sus
edades.
 */
package tp1;

public class Padawan4 {
    public static void main(String[] args) {
        System.out.println("Promedio de edades.");
        int [] edades = new int[]{15,25,19};
        String [] nombres = new String[]{"Mario","Miguel","Xiomara"};
        double acumulador = 0;
        for(int i=0;i<3;i++){
            System.out.printf("Nombre: %1$s -- Edad: %2$d años\n",nombres[i],edades[i]);
            acumulador += edades[i];
        }
        double promedio = acumulador/edades.length;
        System.out.printf("El promedio de edades es de %5.2f años.",promedio);
    }
}
