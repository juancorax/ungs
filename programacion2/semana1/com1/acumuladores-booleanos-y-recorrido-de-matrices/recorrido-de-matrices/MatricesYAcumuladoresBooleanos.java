public class MatricesYAcumuladoresBooleanos {

    public static void main(String[] args) {
        int[][] matriz1 = {
                { 1, 2, 3 },
                { 2, 4, 6 },
                { 7, 8, 9 }
        };

        int[][] matriz2 = {};

        System.out.println(algunaFilaPar(matriz1)); // true
        System.out.println(algunaFilaPar(matriz2)); // true

        System.out.println(algunaColumnaPar(matriz1)); // true
        System.out.println(algunaColumnaPar(matriz2)); // true
    }

    public static boolean estaVacia(int[][] matriz) {
        if (matriz == null || matriz.length == 0) {
            return true;
        }

        for (int[] fila : matriz) {
            if (fila.length > 0) {
                return false;
            }
        }

        return true;
    }

    public static boolean esPar(int numero) {
        return (numero % 2 == 0);
    }

    public static boolean algunaFilaPar(int[][] matriz) {
        if (estaVacia(matriz)) {
            return true;
        }

        boolean algunaFilaDePares = false;

        for (int fila = 0; fila < matriz.length; fila++) {
            boolean todosElementosPares = true;

            for (int columna = 0; columna < matriz[0].length; columna++) {
                todosElementosPares = todosElementosPares && esPar(matriz[fila][columna]);
            }

            algunaFilaDePares = algunaFilaDePares || todosElementosPares;
        }

        return algunaFilaDePares;
    }

    public static boolean algunaColumnaPar(int[][] matriz) {
        if (estaVacia(matriz)) {
            return true;
        }

        boolean algunaColumnaDePares = false;

        for (int columna = 0; columna < matriz[0].length; columna++) {
            boolean todosElementosPares = true;

            for (int fila = 0; fila < matriz.length; fila++) {
                todosElementosPares = todosElementosPares && esPar(matriz[fila][columna]);
            }

            algunaColumnaDePares = algunaColumnaDePares || todosElementosPares;
        }

        return algunaColumnaDePares;
    }
}