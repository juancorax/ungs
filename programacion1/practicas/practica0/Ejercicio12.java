// Escribir un metodo static double potencia(double x, int a) que toma un numero racional
// x y un entero a y calcula x**a.

public class Ejercicio12 {

    static double potencia(double x, int a) {
        double resultado = x;

        for (int i = 1; i < a; i++) {
            resultado *= x;
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(potencia(2, 4));
    }
}