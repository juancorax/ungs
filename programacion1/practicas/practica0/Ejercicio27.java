// Escribir un metodo static int suma(int[] a) que dado un arreglo de enteros, devuelve el valor
// de la suma de todos sus elementos.

public class Ejercicio27 {

    static int suma(int[] a) {
        int suma = 0;

        for (int i : a) {
            suma += i;
        }

        return suma;
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };

        System.out.println("La suma de todos los elementos es: " + suma(arreglo)); // 15
    }
}
