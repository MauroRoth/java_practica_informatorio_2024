/*
 * Triangulo de asteriscos : Se le solicita que creen un programa que imprima un
triángulo de asteriscos en la consola.
 */
package tp1;

public class Iniciado5 {
    public static void main(String[] args) {
        System.out.println("Triágulo de Asteriscos");
        System.out.println("Con String:");
        String fila = "";
        for(int i=0;i<10;i++){
            fila = fila.concat("*");
            System.out.println(fila);
        }

        System.out.println("\nCon array de char:");
        char[][] arr = new char[10][10];
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                if(i<=j || i==0 || j==9){arr[i][j] = '*';}
                else{arr[i][j] = ' ';}
        }
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < 10; j++)
                System.out.print(arr[i][j]);
                System.out.println();
        }
            

    } 
}
