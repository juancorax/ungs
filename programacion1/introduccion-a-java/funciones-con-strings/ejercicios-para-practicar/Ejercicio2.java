// 2. Hacer una función que devuelva true si el String está compuesto solamente
// por letras 'e', y false en caso contrario.

public class Ejercicio2 {
    static boolean compuestoPorLetrasE(String string) {
        String stringEnMinusculas = string.toLowerCase();

        for (int i = 0; i < stringEnMinusculas.length(); i++) {
            if (stringEnMinusculas.charAt(i) != 'e') {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(compuestoPorLetrasE("elefante")); // false
        System.out.println(compuestoPorLetrasE("eeeeeeee")); // true
    }
}
