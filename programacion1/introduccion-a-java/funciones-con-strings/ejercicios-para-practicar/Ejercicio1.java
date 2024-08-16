// 1. Hacer una función que tome un String y cuente la cantidad de veces que
// aparece la letra 'e' ya sea mayúscula o minúscula. Probarla en una función
// main() de pruebas en un archivo aparte.

public class Ejercicio1 {
    static int contarCantidadDeLetrasE(String string) {
        String stringEnMinusculas = string.toLowerCase();
        int contador = 0;

        for (int i = 0; i < stringEnMinusculas.length(); i++) {
            if (stringEnMinusculas.charAt(i) == 'e') {
                contador++;
            }
        }

        return contador;
    }

    public static void main(String[] args) {
        System.out.println("El string 'elefante' tiene " + contarCantidadDeLetrasE("elefante") + " letras 'e'");
    }
}
