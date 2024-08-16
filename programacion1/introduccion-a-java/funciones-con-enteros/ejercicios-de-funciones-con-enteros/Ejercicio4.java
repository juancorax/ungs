// Ejercicio 4:
// a) Implementar una funcion que calcule el factorial de un numero. (*)
// b) Calcular el factorial de los numeros: 3, 7 y 16.
// c) Cual es el mayor numero del cual la computadora es capaz de calcular su
// factorial?

public class Ejercicio4 {
    static int calcularFactorial(int numero) {
        int factorial = 1;

        for (int i = 2; i <= numero; i++) {
            factorial *= i;
        }

        return factorial;
    }

    public static void main(String[] args) {
        System.out.println("3! = " + calcularFactorial(3));
        System.out.println("7! = " + calcularFactorial(7));
        System.out.println("16! = " + calcularFactorial(16));
    }
}
