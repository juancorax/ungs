// Ejercicio 6
public class Arreglos {

    // a)
    public static boolean esSinRepetidos(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] == arr[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    // b)
    public static int[] pegar(int[] arr, int[] arr2) {
        int[] nuevoArreglo = new int[arr.length + arr2.length];

        for (int i = 0; i < nuevoArreglo.length; i++) {
            if (i < arr.length) {
                nuevoArreglo[i] = arr[i];
            } else {
                nuevoArreglo[i] = arr2[i - arr.length];
            }
        }

        return nuevoArreglo;
    }

    // c)
    public static int[] agregarAlFinal(int[] arr, int elem) {
        int[] nuevoArreglo = new int[arr.length + 1];

        for (int i = 0; i < nuevoArreglo.length; i++) {
            if (i == nuevoArreglo.length - 1) {
                nuevoArreglo[i] = elem;
            } else {
                nuevoArreglo[i] = arr[i];
            }
        }

        return nuevoArreglo;
    }

    // d)
    public static int[] sinRepetidos(int[] arr) {
        int[] nuevoArreglo = new int[] { arr[0] };

        for (int i = 1; i < arr.length; i++) {
            boolean estaEnElArreglo = false;

            for (int j = 0; j < nuevoArreglo.length; j++) {
                if (arr[i] == nuevoArreglo[j]) {
                    estaEnElArreglo = true;
                    break;
                }
            }

            if (!(estaEnElArreglo)) {
                nuevoArreglo = agregarAlFinal(nuevoArreglo, arr[i]);
            }
        }

        return nuevoArreglo;
    }

    // e)
    public static void invertir(int[] arr) {
        int i = arr.length - 1;
        int j = 0;

        while (i > j) {
            int variableAuxiliar = arr[i];
            arr[i] = arr[j];
            arr[j] = variableAuxiliar;

            i--;
            j++;
        }
    }
}
