// Implementar el metodo que devuelve el n-esimo elemento de la sucesion:
// a) usando recursividad, con la siguiente signatura: static int fibrec(int n)
// b) usando un ciclo, con la siguiente signatura: static int fibiter(int n)

public class Ejercicio31 {

    static int fibrec(int n) {
        return (n >= 0 && n < 2) ? n : fibrec(n - 1) + fibrec(n - 2);
    }

    static int fibiter(int n) {
        if (n >= 0 && n < 2) {
            return n;
        } else {
            int elemento0 = 0;
            int elemento1 = 1;
            int elementoActual = 1;

            for (int i = 2; i <= n; i++) {
                elemento1 += elemento0;
                elemento0 = elementoActual;
                elementoActual = elemento1;
            }

            return elementoActual;
        }
    }

    public static void main(String[] args) {
        System.out.println(fibrec(6)); // 8
        System.out.println(fibiter(6)); // 8
    }
}
