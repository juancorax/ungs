// Escribir un metodo static boolean esSinRepetidos(String s) que dada una cadena, devuelve
// true si no hay letras repetidas en la cadena. En caso contrario, devuelve false. No utilizar el metodo
// del ejercicio 22.

public class Ejercicio21 {

    static boolean esSinRepetidos(String s) {
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esSinRepetidos("abcdefghij")); // true
        System.out.println(esSinRepetidos("abcaefghij")); // false
    }
}
