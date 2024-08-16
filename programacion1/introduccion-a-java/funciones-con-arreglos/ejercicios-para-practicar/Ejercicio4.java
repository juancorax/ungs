// Implementar una función public static int[] reverso(int[] a), que dado un
// arreglo de enteros devuelva un nuevo arreglo con los elementos en orden
// inverso.

public class Ejercicio4 {
    static int[] invertirArreglo(int[] a) {
        int[] nuevoArreglo = new int[a.length];

        int i = a.length - 1;
        int j = 0;

        while (i >= 0) {
            nuevoArreglo[j] = a[i];

            i--;
            j++;
        }

        return nuevoArreglo;
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };
        int[] arregloInvertido = invertirArreglo(arreglo);

        for (int i = 0; i < arregloInvertido.length; i++) {
            System.out.println(arregloInvertido[i]);
        }
    }
}
