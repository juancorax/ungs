// 4. Hacer una función que tome un String y devuelva true si es duódromo, y
// false en caso contrario. Un String es duódromo si está compuesto solamente
// por letras duplicadas contiguas. Por ejemplo "llaammaa" es duódroma, "ssaabb"
// es duódroma.

public class Ejercicio4 {
    static boolean esDuodroma(String string) {
        int i = 0;
        while (i < string.length()) {
            if (string.charAt(i) == string.charAt(i + 1)) {
                i += 2;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        System.out.println(esDuodroma("llaammaa")); // true
        System.out.println(esDuodroma("ssaabb")); // true
        System.out.println(esDuodroma("llall")); // false
        System.out.println(esDuodroma("palabra")); // false
    }
}
