// 2- Escribir una función  int longitud(String s)
// Devuelve la longitud de la cadena s. No vale usar length(). 

public class Ejercicio2 {

    static String resto(String cadena) {
        String nuevaCadena = "";

        for (int i = 1; i < cadena.length(); i++) {
            nuevaCadena += cadena.charAt(i);
        }

        return nuevaCadena;
    }

    static int longitud(String s) {
        if (s == "") {
            return 0;
        } else {
            return 1 + longitud(resto(s));
        }
    }

    public static void main(String[] args) {
        System.out.println(longitud("Elefante")); // 8
    }
}
