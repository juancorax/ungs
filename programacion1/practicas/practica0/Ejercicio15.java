// Escribir un metodo static boolean esDivisible(int n, int m) que devuelve true si n es divi-
// sible por m y false en caso contrario. Probarlo adecuadamente llamandola desde el main.

import java.util.Scanner;

public class Ejercicio15 {

    static boolean esDivisible(int n, int m) {
        return n % m == 0;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor ingrese el numero 'n':");
        int n = scanner.nextInt();
        System.out.println("Por favor ingrese el numero 'm':");
        int m = scanner.nextInt();

        System.out.println(n + " es divisible por " + m + " : " + esDivisible(n, m));
    }
}
