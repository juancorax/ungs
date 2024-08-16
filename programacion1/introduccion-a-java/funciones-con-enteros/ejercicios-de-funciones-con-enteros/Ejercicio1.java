// Ejercicio 1:
// a) Implementar la funcion cantDivisores que tome un parametro de tipo entero
// y calcule la cantidad de divisores de ese entero. (*)
// b) Hacer un programa que use la funcion anterior.
// c) Averiguar cuantos divisores tienen los siguientes numeros: 45, 2374 y
// 3529.

public class Ejercicio1 {
    static int cantDivisores(int numero) {
        int cantidadDivisores = 0;

        for (int i = 1; i <= numero; i++) {
            if (numero % i == 0) {
                ++cantidadDivisores;
            }
        }

        return cantidadDivisores;
    }

    public static void main(String[] args) {
        System.out.println("El numero 45 tiene " + cantDivisores(45) + " divisores");
        System.out.println("El numero 2374 tiene " + cantDivisores(2374) + " divisores");
        System.out.println("El numero 3529 tiene " + cantDivisores(3529) + " divisores");
    }
}
