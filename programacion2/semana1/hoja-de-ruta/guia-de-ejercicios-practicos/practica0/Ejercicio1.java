// Implementar con acumuladores booleanos una función booleana “mayor10” que recibe una
// lista de números enteros, y devuelve True si todos los elementos son mayores a 10.

public class Ejercicio1 {

    public static void main(String[] args) {
        int[] lista1 = { 1, 2, 3, 4, 5 };
        int[] lista2 = { 11, 12, 13, 14, 15 };

        System.out.println(mayor10(lista1)); // false
        System.out.println(mayor10(lista2)); // true
    }

    public static boolean mayor10(int[] lista) {
        boolean todosMayoresA10 = true;

        for (int i = 0; i < lista.length; i++) {
            todosMayoresA10 = todosMayoresA10 && (lista[i] > 10);
        }

        return todosMayoresA10;
    }
}