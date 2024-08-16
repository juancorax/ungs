// Escribir el método public static void imprimir(int[] a) que recibe un arreglo
// de enteros y muestra el contenido del mismo por pantalla.

public class Ejercicio1 {
    static void imprimir(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4 };

        imprimir(arreglo);
    }
}
