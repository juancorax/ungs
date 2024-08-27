// 4- Escribir una función recursiva llamada combinar que tome dos Strings
// y devuelva el String que resulta de comparar los strings caracter a caracter
// y colocar el menor de ellos en el resultado. Si tienen longitudes distintas,
// tomamos el resto del string que quede.
// Ejemplo:
// String res = combinar(“abd”, "bbc")
//res vale "abc"
// String res = combinar(“fgd”, "adfxgtgs")
//res vale "addxgtgs"

public class Ejercicio4 {

    static String resto(String cadena) {
        String nuevaCadena = "";

        for (int i = 1; i < cadena.length(); i++) {
            nuevaCadena += cadena.charAt(i);
        }

        return nuevaCadena;
    }

    static String combinar(String cadena1, String cadena2) {
        if (cadena1.length() == 1 || cadena2.length() == 1) {
            if (cadena1.charAt(0) < cadena2.charAt(0)) {
                return cadena1 + resto(cadena2);
            }
            return cadena2 + resto(cadena1);
        } else {
            if (cadena1.charAt(0) < cadena2.charAt(0)) {
                return cadena1.charAt(0) + combinar(resto(cadena1), resto(cadena2));
            }
            return cadena2.charAt(0) + combinar(resto(cadena1), resto(cadena2));
        }
    }

    public static void main(String[] args) {
        System.out.println(combinar("abd", "bbc")); // "abc"
        System.out.println(combinar("fgd", "adfxgtgs")); // "addxgtgs"
    }
}
