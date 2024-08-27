// Escribir las versiones recursivas de los siguientes metodos de la Seccion 3:
// a) sumatoria: static int sumatoriaRec(int n)
// b) sumatoriaPares: static int sumatoriaParesRec(int n)
// c) potencia: static double potenciaRec(double x, int n)
// d) factorial: static int factorialRec(int n)

public class Ejercicio30 {

    static int sumatoriaRec(int n) {
        if (n == 1) {
            return 1;
        } else {
            return n + sumatoriaRec(n - 1);
        }
    }

    static int sumatoriaParesRec(int n) {
        if (n == 2) {
            return 2;
        } else if (n % 2 == 0) {
            return n + sumatoriaParesRec(n - 1);
        } else {
            return sumatoriaParesRec(n - 1);
        }
    }

    static double potenciaRec(double x, int n) {
        if (n == 1) {
            return x;
        } else {
            return x * potenciaRec(x, n - 1);
        }
    }

    static int factorialRec(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorialRec(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumatoriaRec(5)); // 15
        System.out.println(sumatoriaParesRec(5)); // 6
        System.out.println(potenciaRec(2, 3)); // 8.0
        System.out.println(factorialRec(5)); // 120
    }
}