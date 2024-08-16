// 6. Implementar la función public static boolean esPrefijoDesde(String
// prefijo, String s, int pos) que retorna true si el String prefijo coincide
// con los primeros caracteres de s a partir de la posición pasada como
// parámetro.

public class Ejercicio6 {
    static boolean esPrefijoDesde(String prefijo, String s, int pos) {
        for (int i = pos; i < (prefijo.length() + pos); i++) {
            if (prefijo.charAt(i - pos) != s.charAt(i)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esPrefijoDesde("efa", "elefante", 2)); // true
        System.out.println(esPrefijoDesde("fan", "elefante", 3)); // true
    }
}
