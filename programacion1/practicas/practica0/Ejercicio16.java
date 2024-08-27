// Escribir un programa que pida por pantalla un texto y a continuacion lo imprima de atras para
// adelante. Para obtener las letras de una cadena de caracteres pueden utilizar el metodo charAt
// de String. Por ejemplo, cadena.charAt(0) devuelve el primer caracter del String cadena.

import java.util.Scanner;

public class Ejercicio16 {

    static String devolverAlReves(String texto) {
        String textoAlReves = "";

        for (int i = texto.length() - 1; i >= 0; i--) {
            textoAlReves += texto.charAt(i);
        }

        return textoAlReves;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, escriba algo:");
        String texto = scanner.nextLine();

        System.out.println("Al reves es:");
        System.out.println(devolverAlReves(texto));
    }
}
