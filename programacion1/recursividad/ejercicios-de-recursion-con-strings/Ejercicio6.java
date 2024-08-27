// 6- Implementar el método esAbecedaria. Una palabra se dice que es "abecedaria" si las letras
// en la palabra aparecen en orden alfabético o si la cadena está vacía o es de 1 caracter,
// se consindera "abecedaria". La función debe devolver un booleano.
// Por ejemplo, la siguientes son todas palabras abecedarias del castellano.
// adios, afín, año, ágil, bello, celos, cenó, chinos dijo, dimos, dios, fijos, finos, hijos, hilos, himno

public class Ejercicio6 {

    static String resto(String cadena) {
        String nuevaCadena = "";

        for (int i = 1; i < cadena.length(); i++) {
            nuevaCadena += cadena.charAt(i);
        }

        return nuevaCadena;
    }

    static boolean esAbecedaria(String cadena) {
        if (cadena.length() == 1) {
            return true;
        } else if (cadena.charAt(0) < cadena.charAt(1)) {
            return esAbecedaria(resto(cadena));
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(esAbecedaria("agil")); // true
        System.out.println(esAbecedaria("elefante")); // false
    }
}
