// 8. boolean esPar(int n) 
// Indica si un número es par o no.

public class Ejercicio8 {

    static boolean esPar(int n) {
        if (n == 0) {
            return true;
        } else if (n == 1) {
            return false;
        } else {
            return esPar(n % 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(esPar(4)); // true
        System.out.println(esPar(5)); // false
    }
}
