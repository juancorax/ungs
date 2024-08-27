// Escribir un metodo static int maximoIndice(int[] a) que dado un arreglo de enteros no vacıo,
// devuelve el ındice del valor mas alto que aparece.

public class Ejercicio26 {

    static int maximoIndice(int[] a) {
        int valorMasAlto = a[0];
        int indiceDelValorMasAlto = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] > valorMasAlto) {
                valorMasAlto = a[i];
                indiceDelValorMasAlto = i;
            }
        }

        return indiceDelValorMasAlto;
    }

    public static void main(String[] args) {
        int[] arreglo = { 1, 2, 3, 4, 5 };

        System.out.println("El indice del valor mas alto es: " + maximoIndice(arreglo)); // 4
    }
}
