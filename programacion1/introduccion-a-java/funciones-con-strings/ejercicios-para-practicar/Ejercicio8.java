// 8. Implementar una función que indique si una palabra es palíndrome. Una
// palabra es palíndrome si se lee igual al derecho y al revés, por ejemplo,
// "ala", "ojo", "neuquen".

public class Ejercicio8 {
    static boolean esPalindrome(String string) {
        String stringAlReves = "";

        for (int i = string.length() - 1; i >= 0; i--) {
            stringAlReves += string.charAt(i);
        }

        if (string.equals(stringAlReves)) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        System.out.println(esPalindrome("ala")); // true
        System.out.println(esPalindrome("ojo")); // true
        System.out.println(esPalindrome("neuquen")); // true
        System.out.println(esPalindrome("elefante")); // false
    }
}
