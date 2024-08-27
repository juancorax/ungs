// Escribir un metodo static int cantidadVocales(String s) que dada una cadena que contiene
// solo letras minusculas sin acentuar, devuelve la cantidad de vocales en dicha cadena. Nota: se puede
// utilizar el metodo definido en el ejercicio anterior.

import java.util.Scanner;

public class Ejercicio18 {

    static int cantidadVocales(String s) {
        int cantidad = 0;
        char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < vocales.length; j++) {
                if (s.charAt(i) == vocales[j]) {
                    ++cantidad;
                }
            }
        }

        return cantidad;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, ingrese una cadena:");
        String cadena = scanner.nextLine();

        System.out.println("La cadena tiene " + cantidadVocales(cadena) + " vocales");
    }
}
