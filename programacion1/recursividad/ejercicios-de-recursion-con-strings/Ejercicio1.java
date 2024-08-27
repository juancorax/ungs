// 1- Escribir una función recursiva llamada imprimirEspaciado que tome un
// String e imprima el String con espacios entre cada caracter.
// Ejemplo:
// String res = imprimirEspaciado(“Juan”)
// res vale "J u a n"
// Hacer primero la función auxiliar resto(String s) que devuelva toda la
// cadenas menos el primer caracter.

public class Ejercicio1 {

    static String resto(String cadena) {
        String nuevaCadena = "";

        for (int i = 1; i < cadena.length(); i++) {
            nuevaCadena += cadena.charAt(i);
        }

        return nuevaCadena;
    }

    static String imprimirEspaciado(String cadena) {
        if (cadena.length() == 1) {
            return cadena;
        } else {
            return cadena.charAt(0) + " " + imprimirEspaciado(resto(cadena));
        }
    }

    public static void main(String[] args) {
        System.out.println(imprimirEspaciado("Juan"));
    }
}