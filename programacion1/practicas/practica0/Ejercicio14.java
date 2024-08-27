// Escribir un metodo static int cantCifras(int n) que devuelve la cantidad de cifras de n.
// Probarlo adecuadamente llamandola desde el main.

import java.util.Scanner;

public class Ejercicio14 {

    static int cantCifras(int n) {
        int cantidadDeCifras = 0;
        int copiaDelNumero = n;

        while (copiaDelNumero != 0) {
            copiaDelNumero /= 10;
            cantidadDeCifras += 1;
        }

        return cantidadDeCifras;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ingrese un numero entero:");
        int numero = scanner.nextInt();

        System.out.println("La cantidad de cifras de " + numero + " es: " + cantCifras(numero));
        System.out.println(numero);
    }
}
