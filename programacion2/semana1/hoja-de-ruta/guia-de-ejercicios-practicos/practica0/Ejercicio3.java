// Implementar una función que determine si un arreglo es subconjunto de otro
// Casos borde a tener en cuenta:
// - elems está vacío (y la función devuelve verdadero)
// - arreglo está vacío (y la función devuelve falso)
// - alguno de los arreglos contiene duplicados (no influye, es suficiente con que estén una vez)

public class Ejercicio3 {

    public static void main(String[] args) {
        int[] subconjunto1 = { 1, 2 };
        int[] subconjunto2 = { 4, 1 };
        int[] subconjunto3 = { 2, 2 };
        int[] subconjunto4 = {};

        int[] arreglo1 = { 3, 2, 1 };
        int[] arreglo2 = { 1, 2, 3 };
        int[] arreglo3 = {};

        System.out.println(pertenecenTodos(subconjunto1, arreglo1)); // true
        System.out.println(pertenecenTodos(subconjunto2, arreglo2)); // false
        System.out.println(pertenecenTodos(subconjunto3, arreglo2)); // true

        System.out.println("");

        System.out.println(pertenecenTodos(subconjunto4, arreglo1)); // true
        System.out.println(pertenecenTodos(subconjunto1, arreglo3)); // false
    }

    public static boolean pertenecenTodos(int[] elems, int[] arreglo) {
        if (elems == null || elems.length == 0) {
            return true;
        }
        if (arreglo == null || arreglo.length == 0) {
            return false;
        }

        boolean todosPertenecen = true;

        for (int i = 0; i < elems.length; i++) {
            boolean perteneceAlArreglo = false;

            for (int j = 0; j < arreglo.length; j++) {
                perteneceAlArreglo = perteneceAlArreglo || (elems[i] == arreglo[j]);
            }

            todosPertenecen = todosPertenecen && perteneceAlArreglo;
        }

        return todosPertenecen;
    }
}
