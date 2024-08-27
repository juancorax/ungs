// 9. boolean esImpar(int n) 
// Indica si un número es impar o no.

public class Ejercicio9 {

    static boolean esImpar(int n) {
        if (n == 0) {
            return false;
        } else if (n == 1) {
            return true;
        } else {
            return esImpar(n % 2);
        }
    }

    public static void main(String[] args) {
        System.out.println(esImpar(4)); // false
        System.out.println(esImpar(5)); // true
    }
}
