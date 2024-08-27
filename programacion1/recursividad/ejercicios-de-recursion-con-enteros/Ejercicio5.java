// 5. int potencia(int base, int exp) 
// Calcula base elevado a la exp. 

public class Ejercicio5 {

    static int potencia(int base, int exp) {
        if (exp == 1) {
            return base;
        } else {
            return base * potencia(base, exp - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println(potencia(2, 3)); // 8
    }
}
