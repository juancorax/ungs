// 3- Escribir una función recursiva llamada inverso() que tomé un String
// y devuelva el String que resulta de invertir todos sus caracteres.

public class Ejercicio3 {

    static String resto(String cadena) {
        String nuevaCadena = "";

        for (int i = 1; i < cadena.length(); i++) {
            nuevaCadena += cadena.charAt(i);
        }

        return nuevaCadena;
    }

    static String inverso(String cadena) {
        if (cadena.length() == 1) {
            return cadena;
        } else {
            return inverso(resto(cadena)) + cadena.charAt(0);
        }
    }

    public static void main(String[] args) {
        System.out.println(inverso("elefante")); // etnafele
    }
}
