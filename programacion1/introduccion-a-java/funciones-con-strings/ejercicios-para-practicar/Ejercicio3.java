// 3. Hacer una función que se llame public static boolean sonIguales(String s1,
// String s2) y devuelva true si ambos String son iguales. No usar el método
// .equals().

public class Ejercicio3 {
    static boolean sonIguales(String s1, String s2) {
        if (s1.length() != s2.length()) {
            return false;
        }

        for (int i = 0; i < s1.length(); i++) {
            if (s1.charAt(i) != s2.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(sonIguales("elefante", "elefan")); // false
        System.out.println(sonIguales("elefante", "elefante")); // true
        System.out.println(sonIguales("elefante", "efelante")); // false
        System.out.println(sonIguales("elefante", "ELEFANTE")); // false
    }
}
