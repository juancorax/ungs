// Escribir un programa que te pregunte tu nombre y a continuaci´on imprima un
// saludo del estilo
// “Hola nombre”.

import java.util.Scanner;

public class Ejercicio2 {
    static String pedirNombre() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese su nombre:");
        return scan.nextLine();
    }

    public static void main(String[] args) {
        System.out.println("Hola " + pedirNombre());
    }
}