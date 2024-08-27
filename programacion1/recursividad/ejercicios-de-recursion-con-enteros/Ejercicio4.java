// 4. int sumaDeCuadradosHasta(int n) 
// Devuelve la suma de todos los numeros elevados al cuadrado entre 1 y n. 

public class Ejercicio4 {

    static int sumaDeCuadradosHasta(int n) {
        if (n == 1) {
            return 1;
        } else {
            return (n * n) + sumaDeCuadradosHasta(n - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumaDeCuadradosHasta(3)); // 14
    }
}
