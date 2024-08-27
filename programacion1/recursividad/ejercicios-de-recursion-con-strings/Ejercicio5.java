// 5-Escribir una función que tome una cadena como parámetro y la imprima por consola
// intercalando un ’∗’ entre cada letra. Por ejemplo, si la función toma la cadena ”hola”
// como parámetro, deberá imprimir ”h∗o∗l∗a”.

public class Ejercicio5 {

    static String resto(String cadena) {
        String nuevaCadena = "";

        for (int i = 1; i < cadena.length(); i++) {
            nuevaCadena += cadena.charAt(i);
        }

        return nuevaCadena;
    }

    static String intercalarAsteriscos(String cadena) {
        if (cadena.length() == 1) {
            return cadena;
        } else {
            return cadena.charAt(0) + "*" + intercalarAsteriscos(resto(cadena));
        }
    }

    public static void main(String[] args) {
        System.out.println(intercalarAsteriscos("Juan"));
    }
}
