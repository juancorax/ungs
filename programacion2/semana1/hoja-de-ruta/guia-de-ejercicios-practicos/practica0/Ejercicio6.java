// Implementar, utilizando acumuladores booleanos, una función que reciba una matriz de
// enteros, y devuelva verdadero en cada una de las filas, existe al menos un número negativo.

public class Ejercicio6 {

    public static void main(String[] args) {
        int[][] matriz1 = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        int[][] matriz2 = {
                { 1, -2, 3 },
                { 4, 5, -6 },
                { 7, -8, 9 }
        };

        System.out.println(tieneNegativos(matriz1)); // false
        System.out.println(tieneNegativos(matriz2)); // true
    }

    public static boolean tieneNegativos(int[][] matriz) {
        boolean algunNegativoEnCadaFila = true;

        for (int fila = 0; fila < matriz.length; fila++) {
            boolean algunNegativo = false;

            for (int columna = 0; columna < matriz[0].length; columna++) {
                algunNegativo = algunNegativo || (matriz[fila][columna] < 0);
            }

            algunNegativoEnCadaFila = algunNegativoEnCadaFila && algunNegativo;
        }

        return algunNegativoEnCadaFila;
    }
}
