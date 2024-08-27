// Escribir un metodo static double promedio(double[] a) que dado un arreglo de numeros con
// coma, devuelve el valor del promedio de todos los elementos.

public class Ejercicio29 {

    static double promedio(double[] a) {
        int suma = 0;

        for (double i : a) {
            suma += i;
        }

        return (suma * 1.0) / a.length;
    }

    public static void main(String[] args) {
        double[] arreglo = { 2, 7, 10 };

        System.out.println("El promedio es: " + promedio(arreglo)); // 6.333333333333333
    }
}
