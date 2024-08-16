// Ejercicio 2:
// a) Implementar la funcion esPrimo que tome un parametro entero y retorne
// verdadero o falso segun el entero sea primo o no. (*)
// b) Decir cuales de los siguientes numeros son primos: 37, 633 y 3592.

public class Ejercicio2 {
    static boolean esPrimo(int numero) {
        for (int i = 2; i < numero; i++) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }

    static String decirSiEsPrimo(int numero) {
        if (esPrimo(numero)) {
            return numero + " es primo";
        }
        return numero + " no es primo";
    }

    public static void main(String[] args) {
        System.out.println(decirSiEsPrimo(37));
        System.out.println(decirSiEsPrimo(633));
        System.out.println(decirSiEsPrimo(3592));
    }
}
