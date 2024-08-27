// 7. int cantidadPrimosEntre(int n, int m) 
// Calcula la cantidad de números primos que hay entre n y m. Obs: Asumir que se tiene una función 
// que indica si un número es primo o no (i.e., hacerla antes!) 
// Asumir que m >= n.

public class Ejercicio7 {

    static boolean esPrimo(int n) {
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    static int cantidadPrimosEntre(int n, int m) {
        if (m == n) {
            if (esPrimo(m)) {
                return 1;
            } else {
                return 0;
            }
        } else if (esPrimo(m)) {
            return 1 + cantidadPrimosEntre(n, m - 1);
        } else {
            return cantidadPrimosEntre(n, m - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(cantidadPrimosEntre(28, 38)); // 3
    }
}
