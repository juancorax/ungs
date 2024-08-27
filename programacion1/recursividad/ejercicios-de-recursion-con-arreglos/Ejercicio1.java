// 1) public static void imprimir(int[] a)
// Imprime por pantalla los elementos del arreglo.

public class Ejercicio1 {

    static int[] restoDeArreglo(int[] arreglo) {
        int[] nuevoArreglo = new int[arreglo.length - 1];

        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i + 1];
        }

        return nuevoArreglo;
    }

    static void imprimir(int[] a) {
        if (a.length == 1) {
            System.out.println(a[0]);
        } else {
            System.out.println(a[0]);
            imprimir(restoDeArreglo(a));
        }
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };

        imprimir(arreglo);
    }
}