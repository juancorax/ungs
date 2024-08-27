// Escribir un metodo static double factorial(int n) que toma un entero positivo n y calcula
// n! (el factorial de n) que se define como el producto de todos los naturales desde 1 hasta n. Por
// ejemplo 5! = 5 × 4 × 3 × 2 × 1 = 120. Ojo: por definicion, el factorial de 0, es 1 (0! = 1).

import java.util.Scanner;

public class Ejercicio13 {

    static double factorial(int n) {
        double factorial = 1;

        for (int i = 2; i <= n; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese un numero entero:");
        int numero = scanner.nextInt();

        System.err.println(numero + "! = " + factorial(numero));
    }
}