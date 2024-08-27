// 1. int sumaDesdeUnoHasta(int n)
// Devuelve la suma de todos los numeros entre 1 y n.

public class Ejercicio1 {

    static int sumaDesdeUnoHasta(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumaDesdeUnoHasta(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumaDesdeUnoHasta(5)); // 15
    }
}