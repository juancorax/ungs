// 3. void imprimirDesde(int n) 
// Imprime por pantalla los números entre 1 y n (en orden descendente). 

public class Ejercicio3 {

    static void imprimirDesde(int n) {
        if (n == 1) {
            System.out.println(n);
        } else {
            System.out.println(n);
            imprimirDesde(n - 1);
        }
    }

    public static void main(String[] args) {
        imprimirDesde(5);
    }
}
