// Escribir un metodo static int cantidadApariciones(String s, char c) que dada una cadena
// y un caracter, cuenta la cantidad de veces que aparece c en s.

import java.util.Scanner;

public class Ejercicio17 {

    static int cantidadApariciones(String s, char c) {
        int cantidad = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == c) {
                ++cantidad;
            }
        }

        return cantidad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una cadena:");
        String cadena = scanner.nextLine();
        System.out.println("Por favor, ingrese un caracter:");
        char caracter = scanner.nextLine().charAt(0);

        System.out.println(caracter + " aparece " + cantidadApariciones(cadena, caracter) + " veces en la cadena");
    }
}
