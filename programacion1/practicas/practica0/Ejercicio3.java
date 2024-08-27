// Escribir un programa que te pregunte por dos numeros, y a continuacion imprima un mensaje
// del estilo “La suma es: ” y el valor de la suma de ambos numeros.

import java.util.Scanner;

public class Ejercicio3 {

    static int[] pedirNumeros() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese un numero:");
        int primerNumero = scan.nextInt();
        System.out.println("Por favor, ingrese otro numero:");
        int segundoNumero = scan.nextInt();

        int[] numeros = { primerNumero, segundoNumero };

        return numeros;
    }

    static int sumarNumeros(int[] numeros) {
        return numeros[0] + numeros[1];
    }

    public static void main(String[] args) {
        System.out.println("La suma es: " + sumarNumeros(pedirNumeros()));
    }
}
