// Implementar una función que, dada una matriz de enteros, verifique ambas condiciones:
// a) todas las filas están en orden estrictamente ascendente.
// b) todas las columnas tienen al menos un elemento impar, y otro par.

public class Ejercicio7 {

    public static void main(String[] args) {
        int[][] matriz1 = {
                { 1, 2, 3 },
                { 4, 5, 6 }
        };

        int[][] matriz2 = {
                { 1, 2, 3 },
                { 4, 5, 5 }
        };

        System.out.println(filasCrecientesParImpar(matriz1)); // true
        System.out.println(filasCrecientesParImpar(matriz2)); // false
    }

    public static boolean filasCrecientesParImpar(int[][] mat) {
        int cantidadDeFilas = mat.length;
        int cantidadDeColumnas = mat[0].length;

        boolean todasLasFilasEnOrdenAscendente = true;

        for (int fila = 0; fila < cantidadDeFilas; fila++) {
            for (int columna = 0; columna < cantidadDeColumnas - 1; columna++) {
                boolean esMenorQueElSiguiente = (mat[fila][columna] < mat[fila][columna + 1]);

                todasLasFilasEnOrdenAscendente = todasLasFilasEnOrdenAscendente && esMenorQueElSiguiente;
            }
        }

        boolean todasLasColumnasTienenParEImpar = true;

        for (int columna = 0; columna < cantidadDeColumnas; columna++) {
            boolean algunPar = false;
            boolean algunImpar = false;

            for (int fila = 0; fila < cantidadDeFilas; fila++) {
                int elemento = mat[fila][columna];

                algunPar = algunPar || (elemento % 2 == 0);
                algunImpar = algunImpar || (elemento % 2 != 0);
            }

            boolean tieneAlgunParEImpar = (algunPar && algunImpar);
            todasLasColumnasTienenParEImpar = todasLasColumnasTienenParEImpar && tieneAlgunParEImpar;
        }

        return todasLasFilasEnOrdenAscendente && todasLasColumnasTienenParEImpar;
    }
}
