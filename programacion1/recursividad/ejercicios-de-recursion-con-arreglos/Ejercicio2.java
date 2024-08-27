// 2) public static int suma(int[] a)
// Hacer una función recursiva que sume los elementos de un arreglo.

public class Ejercicio2 {

    static int[] restoDeArreglo(int[] arreglo) {
        int[] nuevoArreglo = new int[arreglo.length - 1];

        for (int i = 0; i < nuevoArreglo.length; i++) {
            nuevoArreglo[i] = arreglo[i + 1];
        }

        return nuevoArreglo;
    }

    static int suma(int[] a) {
        if (a.length == 1) {
            return a[0];
        } else {
            return a[0] + suma(restoDeArreglo(a));
        }
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };

        System.out.println(suma(arreglo)); // 15
    }
}
