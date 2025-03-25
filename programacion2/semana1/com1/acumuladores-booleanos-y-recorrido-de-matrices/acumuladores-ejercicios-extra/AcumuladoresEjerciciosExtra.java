public class AcumuladoresEjerciciosExtra {

    public static void main(String[] args) {
        int[][] mat = {
                { 2, 3, 4, 5, 7 },
                { 5, 7, 7, 7, 9 },
                { 2, 3, 9, 9, 2 }
        };

        System.out.println("matriz con X");

        imprimirCambiandoPares(mat);

        System.out.println("");
        System.out.println("");

        System.out.println(cadaFilaContieneAlgunPar(mat)); // false
        System.out.println(cadaFilaContieneAlgunParModular(mat)); // false
    }

    /**
     * Imprimir una matriz cambiando los numeros
     * pares por X.
     * Recorrer por filas.
     */
    public static void imprimirCambiandoPares(int[][] mat) {
        int cantidadDeFilas = mat.length;
        int cantidadDeColumnas = mat[0].length;

        for (int fila = 0; fila < cantidadDeFilas; fila++) {
            for (int columna = 0; columna < cantidadDeColumnas; columna++) {
                int numeroActual = mat[fila][columna];
                String numero, separador;

                if (numeroActual % 2 == 0) {
                    numero = "X";
                } else {
                    numero = String.valueOf(numeroActual);
                }

                if ((fila == cantidadDeFilas - 1) && (columna == cantidadDeColumnas - 1)) {
                    separador = "";
                } else {
                    separador = ", ";
                }

                System.out.print(numero + separador);
            }
        }
    }

    /**
     * Verificar que [cada (fila contiene al
     * menos algun elemento par)].
     * 
     */
    public static boolean cadaFilaContieneAlgunPar(int[][] mat) {
        boolean cadaFilaContieneAlgunPar = true;

        for (int fila = 0; fila < mat.length; fila++) {
            boolean contieneAlgunPar = false;

            for (int columna = 0; columna < mat[0].length; columna++) {
                contieneAlgunPar = contieneAlgunPar || (mat[fila][columna] % 2 == 0);
            }

            cadaFilaContieneAlgunPar = cadaFilaContieneAlgunPar && contieneAlgunPar;
        }

        return cadaFilaContieneAlgunPar;
    }

    /**
     * Verificar si cada fila contiene al menos un elemento par,
     * utilizando un método auxiliares.
     */

    public static boolean esPar(int numero) {
        return (numero % 2 == 0);
    }

    public static boolean contieneAlgunPar(int[] arreglo) {
        boolean contieneAlgunPar = false;

        for (int i = 0; i < arreglo.length; i++) {
            contieneAlgunPar = contieneAlgunPar || esPar(arreglo[i]);
        }

        return contieneAlgunPar;
    }

    public static boolean cadaFilaContieneAlgunParModular(int[][] mat) {
        boolean cadaFilaContieneAlgunPar = true;

        for (int fila = 0; fila < mat.length; fila++) {
            cadaFilaContieneAlgunPar = cadaFilaContieneAlgunPar && contieneAlgunPar(mat[fila]);
        }

        return cadaFilaContieneAlgunPar;
    }
}