// Escribir un metodo static int maximo(int[] a) que dado un arreglo de enteros no vacıo, devuelve
// el valor mas alto que aparece.

public class Ejercicio25 {

    static int maximo(int[] a) {
        int valorMasAlto = a[0];

        for (int i : a) {
            if (i > valorMasAlto) {
                valorMasAlto = i;
            }
        }

        return valorMasAlto;
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };

        System.out.println("El valor mas alto es: " + maximo(arreglo)); // 5
    }
}
