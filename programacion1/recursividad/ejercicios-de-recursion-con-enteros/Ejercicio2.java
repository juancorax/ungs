// 2. void imprimirHasta(int n) 
// Imprime por pantalla los números entre 1 y n (en orden ascendente). 

public class Ejercicio2 {

    static void imprimirHasta(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            imprimirHasta(n - 1);
            System.out.println(n);
        }
    }

    public static void main(String[] args) {
        imprimirHasta(5);
    }
}
