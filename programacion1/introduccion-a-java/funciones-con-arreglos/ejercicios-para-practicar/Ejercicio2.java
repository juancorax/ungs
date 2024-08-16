// Implementar una función public static double prom(int[] a) que dado un
// arreglo de enteros, devuelva el promedio de sus elementos.

public class Ejercicio2 {
    static double prom(int[] a) {
        int suma = 0;

        for (int i = 0; i < a.length; i++) {
            suma += a[i];
        }

        double promedio = suma / a.length;
        return promedio;
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };

        System.out.println(prom(arreglo));
    }
}
