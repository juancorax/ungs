// Escribir el metodo static boolean esCapicua(String s) que dada una cadena, devuelve true
// si la cadena es igual de atras hacia adelante o de adelante hacia atras. En caso contrario, devuelve
// false.

import java.util.Scanner;

public class Ejercicio20 {

    static boolean esCapicua(String s) {
        String cadenaAlReves = "";

        for (int i = s.length() - 1; i >= 0; i--) {
            cadenaAlReves += s.charAt(i);
        }

        return s.equals(cadenaAlReves);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una cadena:");
        String cadena = scanner.nextLine();

        System.out.println("La cadena es capicua: " + esCapicua(cadena));
    }
}
