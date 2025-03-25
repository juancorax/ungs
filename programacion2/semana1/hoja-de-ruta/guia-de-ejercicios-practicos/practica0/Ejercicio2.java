// Implementar con acumuladores booleanos una función booleana “multiplo5AlgunoMayor100”
// que recibe una lista de números enteros, y devuelve True si todos los elementos son múltiplo
// de 5 y alguno de ellos es mayor a 100.

public class Ejercicio2 {

    public static void main(String[] args) {
        int[] lista1 = { 1, 2, 3, 4, 5 };
        int[] lista2 = { 10, 50, 100, 500, 1000 };

        System.out.println(multiplo5AlgunoMayor100(lista1)); // false
        System.out.println(multiplo5AlgunoMayor100(lista2)); // true
    }

    public static boolean multiplo5AlgunoMayor100(int[] lista) {
        boolean todosMultiplosDe5 = true;
        boolean algunoMayorA100 = false;

        for (int i = 0; i < lista.length; i++) {
            todosMultiplosDe5 = todosMultiplosDe5 && (lista[i] % 5 == 0);
            algunoMayorA100 = algunoMayorA100 || (lista[i] > 100);
        }

        return todosMultiplosDe5 && algunoMayorA100;
    }
}
