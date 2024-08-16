// 7. Hacer la funcion public static boolean esSubstring(String s1, String s2)
// que retorna true si y sólo si s1 esta incluido en s2.

public class Ejercicio7 {
    static boolean esPrefijoDesde(String prefijo, String s, int pos) {
        for (int i = pos; i < (prefijo.length() + pos); i++) {
            if (prefijo.charAt(i - pos) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    static boolean esSubstring(String s1, String s2) {
        for (int i = 0; i < s2.length(); i++) {
            if (s2.charAt(i) == s1.charAt(0)) {
                if (esPrefijoDesde(s1, s2, i)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(esSubstring("efa", "elefante")); // true
        System.out.println(esSubstring("fan", "elefante")); // true
        System.out.println(esSubstring("fat", "elefante")); // false
    }
}
