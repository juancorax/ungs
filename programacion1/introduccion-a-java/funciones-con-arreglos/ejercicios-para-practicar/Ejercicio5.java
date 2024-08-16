// Escribir el método public static int[] pedirArreglo(int n) que construye un
// arreglo de enteros, solicitando al usuario el valor de cada una de las n
// posiciones y devuelve el arreglo construído.

import java.util.Scanner;

public class Ejercicio5 {
    static int[] pedirArreglo(int n) {
        int[] arreglo = new int[n];

        Scanner scan = new Scanner(System.in);

        for (int i = 0; i < n; i++) {
            System.out.println("Ingrese el valor para la posicion " + i + ":");
            arreglo[i] = scan.nextInt();
        }

        return arreglo;
    }

    public static void main(String[] args) {
        int[] arreglo = pedirArreglo(5);

        for (int i = 0; i < arreglo.length; i++) {
            System.out.println(arreglo[i]);
        }
    }
}
