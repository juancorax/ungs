package acumuladores;

public class Acumuladores {

    public boolean todosMultiplosEnAlgunaFila(int[][] mat, int num) {
        int cantidadDeFilas = mat.length;

        if (cantidadDeFilas == 0 || num <= 0) {
            return false;
        }

        int cantidadDeColumnas = mat[0].length;

        boolean algunaFilaConTodosMultiplos = false;

        for (int fila = 0; fila < cantidadDeFilas; fila++) {
            boolean todosMultiplos = true;

            for (int columna = 0; columna < cantidadDeColumnas; columna++) {
                todosMultiplos = todosMultiplos && (mat[fila][columna] % num == 0);
            }

            algunaFilaConTodosMultiplos = algunaFilaConTodosMultiplos || todosMultiplos;
        }

        return algunaFilaConTodosMultiplos;
    }

    public boolean hayInterseccionPorFila(int[][] mat1, int[][] mat2) {
        int cantidadDeFilasMat1 = mat1.length;
        int cantidadDeFilasMat2 = mat2.length;

        if (cantidadDeFilasMat1 == 0 ||
                cantidadDeFilasMat2 == 0 ||
                cantidadDeFilasMat1 != cantidadDeFilasMat2) {
            return false;
        }

        int cantidadDeColumnasMat1 = mat1[0].length;
        int cantidadDeColumnasMat2 = mat2[0].length;

        boolean hayInterseccionEnTodas = true;

        for (int fila = 0; fila < cantidadDeFilasMat1; fila++) {
            boolean algunaInterseccion = false;

            for (int columnaMat1 = 0; columnaMat1 < cantidadDeColumnasMat1; columnaMat1++) {
                int elementoMat1 = mat1[fila][columnaMat1];

                for (int columnaMat2 = 0; columnaMat2 < cantidadDeColumnasMat2; columnaMat2++) {
                    int elementoMat2 = mat2[fila][columnaMat2];

                    algunaInterseccion = algunaInterseccion || (elementoMat1 == elementoMat2);
                }
            }

            hayInterseccionEnTodas = hayInterseccionEnTodas && algunaInterseccion;
        }

        return hayInterseccionEnTodas;
    }

    public boolean algunaFilaSumaMasQueLaColumna(int[][] mat, int nColum) {
        int cantidadDeFilas = mat.length;

        if (cantidadDeFilas == 0) {
            return false;
        }

        int cantidadDeColumnas = mat[0].length;

        if (nColum < 0 || nColum > cantidadDeColumnas - 1) {
            return false;
        }

        int sumaDeColumna = 0;

        for (int fila = 0; fila < cantidadDeFilas; fila++) {
            sumaDeColumna += mat[fila][nColum];
        }

        boolean algunaFilaConSumaMayor = false;

        for (int fila = 0; fila < cantidadDeFilas; fila++) {
            int sumaDeFila = 0;

            for (int columna = 0; columna < cantidadDeColumnas; columna++) {
                sumaDeFila += mat[fila][columna];
            }

            algunaFilaConSumaMayor = algunaFilaConSumaMayor || (sumaDeFila > sumaDeColumna);
        }

        return algunaFilaConSumaMayor;
    }

    public boolean hayInterseccionPorColumna(int[][] mat1, int[][] mat2) {
        int cantidadDeFilasMat1 = mat1.length;
        int cantidadDeFilasMat2 = mat2.length;

        if (cantidadDeFilasMat1 == 0 || cantidadDeFilasMat2 == 0) {
            return false;
        }

        int cantidadDeColumnasMat1 = mat1[0].length;
        int cantidadDeColumnasMat2 = mat2[0].length;

        if (cantidadDeColumnasMat1 != cantidadDeColumnasMat2) {
            return false;
        }

        boolean hayInterseccionEnTodas = true;

        for (int columna = 0; columna < cantidadDeColumnasMat1; columna++) {
            boolean algunaInterseccion = false;

            for (int filaMat1 = 0; filaMat1 < cantidadDeFilasMat1; filaMat1++) {
                int elementoMat1 = mat1[filaMat1][columna];

                for (int filaMat2 = 0; filaMat2 < cantidadDeFilasMat2; filaMat2++) {
                    int elementoMat2 = mat2[filaMat2][columna];

                    algunaInterseccion = algunaInterseccion || (elementoMat1 == elementoMat2);
                }
            }

            hayInterseccionEnTodas = hayInterseccionEnTodas && algunaInterseccion;
        }

        return hayInterseccionEnTodas;
    }
}