// Escribir un metodo static String sinRepetidos(String s) que dada una cadena, devuelve
// una nueva cadena donde cada uno de los caracteres que aparecıan en s, aparecen solo una vez.
// Se debe mantener la posicion relativa de los caracteres: para aquellos que se encuentren repetidos
// puede conservarse cualquiera de sus apariciones. Por ejemplo, para la palabra ‘‘casos’’ puede
// devolver ‘‘caso’’ o ‘‘caos’’, conservando la primera o la segunda letra s respectivamente.

public class Ejercicio22 {

    static String sinRepetidos(String s) {
        String cadenaSinRepetidos = "";

        for (int i = 0; i < s.length(); i++) {
            boolean esRepetida = false;

            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    esRepetida = true;
                    break;
                }
            }

            if (!esRepetida) {
                cadenaSinRepetidos += s.charAt(i);
            }
        }

        return cadenaSinRepetidos;
    }

    public static void main(String[] args) {
        System.out.println(sinRepetidos("casos")); // caos
        System.out.println(sinRepetidos("elefante")); // lfante
        System.out.println(sinRepetidos("astronauta")); // sronuta
    }
}
