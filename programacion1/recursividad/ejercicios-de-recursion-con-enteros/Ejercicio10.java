// 10. int cantidadDigitos(int n) 
// Indica la cantidad de digitos de un número..

public class Ejercicio10 {

    static int cantidadDigitos(int n) {
        if (n / 10 == 0) {
            return 1;
        } else {
            return 1 + cantidadDigitos(n / 10);
        }
    }

    public static void main(String[] args) {
        System.out.println(cantidadDigitos(1)); // 1
        System.out.println(cantidadDigitos(15)); // 2
        System.out.println(cantidadDigitos(150)); // 3
        System.out.println(cantidadDigitos(1500)); // 4
    }
}
