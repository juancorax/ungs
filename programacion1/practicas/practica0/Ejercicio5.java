// Escribir un programa que te pregunte por dos numeros, y a continuacion imprima un mensaje
// del estilo “El promedio es: ” y el valor del promedio de ambos numeros.

import java.util.Scanner;

public class Ejercicio5 {

    static int[] pedirNumeros() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese el primer numero:");
        int primerNumero = scan.nextInt();
        System.out.println("Por favor, ingrese el segundo numero:");
        int segundoNumero = scan.nextInt();

        return new int[] { primerNumero, segundoNumero };
    }

    static int calcularPromedio(int[] numeros) {
        int promedio = (numeros[0] + numeros[1]) / 2;

        return promedio;
    }

    public static void main(String[] args) {
        System.out.println("El promedio es: " + calcularPromedio(pedirNumeros()));
    }
}
