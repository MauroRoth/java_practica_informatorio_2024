/*
 * Mi nombre y edad: Se le solicita que guarde en un espacio de memoria su nombre
y apellido, luego guarde su edad e imprimalos por pantalla.
El mensaje debe tener el siguiente formato:
“Mi nombre es “ {Nombre}
“Mi edad es” {Edad}
 */
package tp1;

public class Iniciado8 {
    public static void main(String[] args) {
        String nombreYApellido = "Mauro Gonzalo Roth";
        int edad = 40;
        System.out.println("Nombre y Edad.\n");
        System.out.printf("\t\tSoy %s y tengo %d años.\n\n",nombreYApellido,edad);
        System.out.println("Mi nombre es "+nombreYApellido);
        System.out.println("Mi edad es "+edad);
    }
}
