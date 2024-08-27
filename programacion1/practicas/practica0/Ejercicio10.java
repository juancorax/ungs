// Escribir un metodo static int sumatoria(int n) que devuelve la sumatoria de los numeros
// desde 1 hasta n.

public class Ejercicio10 {

    static int sumatoria(int n) {
        int suma = 1;

        for (int i = 2; i <= n; i++) {
            suma += i;
        }

        return suma;
    }

    public static void main(String[] args) {
        System.out.println(sumatoria(5));
    }
}
