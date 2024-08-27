// 6. int sumaEntre(int n, int m) 
// Calcula la suma de los números que hay entre n y m. Incluyendo a n y a m. Asumir que m >= n. 

public class Ejercicio6 {

    static int sumaEntre(int n, int m) {
        if (m == n) {
            return n;
        } else {
            return m + sumaEntre(n, m - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(sumaEntre(1, 5)); // 15
    }
}
