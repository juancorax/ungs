// Implementar una clase en Java que tenga métodos estáticos que reciban una matriz por
// parámetro y muestre los elementos de la matriz por filas y otro que los muestre por columnas,
// y un tercer método que sume todos sus elementos.

// Agregar a la clase anterior métodos estáticos que reciban por parámetro una matriz y devuelvan
// un arreglo con la suma de cada fila de la matriz (cuya dimensión sea la cantidad de filas de la
// matriz). Crear otro que haga lo mismo, pero con las columnas.

import java.util.Arrays;

public class Ejercicio4Y5 {

    public static void main(String[] args) {
        int[][] matriz = {
                { 1, 2, 3 },
                { 4, 5, 6 },
                { 7, 8, 9 }
        };

        imprimirMatrizPorFilas(matriz);
        imprimirMatrizPorColumnas(matriz);

        System.out.println(sumarElementosDeMatriz(matriz)); // 45

        int[] sumaDeCadaFila = sumarCadaFila(matriz);
        int[] sumaDeCadaColumna = sumarCadaColumna(matriz);

        System.out.println(Arrays.toString(sumaDeCadaFila)); // [6, 15, 24]
        System.out.println(Arrays.toString(sumaDeCadaColumna)); // [12, 15, 18]
    }

    public static void imprimirMatrizPorFilas(int[][] matriz) {
        int cantidadDeFilas = matriz.length;
        int cantidadDeColumnas = matriz[0].length;

        for (int fila = 0; fila < cantidadDeFilas; fila++) {
            for (int columna = 0; columna < cantidadDeColumnas; columna++) {
                String separador = ", ";

                if ((fila == cantidadDeFilas - 1) && (columna == cantidadDeColumnas - 1)) {
                    separador = "\n";
                }

                System.out.print(matriz[fila][columna] + separador);
            }
        }
    }

    public static void imprimirMatrizPorColumnas(int[][] matriz) {
        int cantidadDeColumnas = matriz[0].length;
        int cantidadDeFilas = matriz.length;

        for (int columna = 0; columna < cantidadDeColumnas; columna++) {
            for (int fila = 0; fila < cantidadDeFilas; fila++) {
                String separador = ", ";

                if ((fila == cantidadDeFilas - 1) && (columna == cantidadDeColumnas - 1)) {
                    separador = "\n";
                }

                System.out.print(matriz[fila][columna] + separador);
            }
        }
    }

    public static int sumarElementosDeMatriz(int[][] matriz) {
        int suma = 0;

        for (int fila = 0; fila < matriz.length; fila++) {
            for (int columna = 0; columna < matriz[0].length; columna++) {
                suma += matriz[fila][columna];
            }
        }

        return suma;
    }

    public static int[] sumarCadaFila(int[][] matriz) {
        int cantidadDeFilas = matriz.length;
        int cantidadDeColumnas = matriz[0].length;

        int[] arregloConSumaDeCadaFila = new int[cantidadDeFilas];

        for (int fila = 0; fila < cantidadDeFilas; fila++) {
            int sumaDeFila = 0;

            for (int columna = 0; columna < cantidadDeColumnas; columna++) {
                sumaDeFila += matriz[fila][columna];
            }

            arregloConSumaDeCadaFila[fila] = sumaDeFila;
        }

        return arregloConSumaDeCadaFila;
    }

    public static int[] sumarCadaColumna(int[][] matriz) {
        int cantidadDeColumnas = matriz[0].length;
        int cantidadDeFilas = matriz.length;

        int[] arregloConSumaDeCadaColumna = new int[cantidadDeColumnas];

        for (int columna = 0; columna < cantidadDeColumnas; columna++) {
            int sumaDeColumna = 0;

            for (int fila = 0; fila < cantidadDeFilas; fila++) {
                sumaDeColumna += matriz[fila][columna];
            }

            arregloConSumaDeCadaColumna[columna] = sumaDeColumna;
        }

        return arregloConSumaDeCadaColumna;
    }
}
