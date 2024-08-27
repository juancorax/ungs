// Para el desarrollo de un sistema generador de juegos de palabras cruzadas, se necesita pro-
// gramar la siguiente funcion. Dadas 3 cadenas, a, b y c, se quiere saber si puede colocarse b de
// manera vertical de modo que a y c se coloquen de manera horizontal atravezando a b. Se ne-
// cesita tambien que a este mas arriba que c y tengan al menos un renglon de diferencia. Por
// ejemplo, a = ”JUGO”, b = ”BUENO”, c = ”ANANA” pueden colocarse como muestra la Figu-
// ra 1, por lo tanto el metodo debe devolver Verdadero. En cambio, a = ”JUGO”, b = ”FEO”,
// c = ”ANANA” no pueden colocarse, y por ende deberıa devolver Falso. El encabezado del meto-
// do debe ser static boolean puedenColocarse(String a, String b, String c).

public class Ejercicio23 {

    static boolean puedenColocarse(String a, String b, String c) {
        boolean seCruzaConA = false;
        boolean seCruzaConC = false;

        int i = 0;

        while (!seCruzaConC && i < b.length()) {
            int j = 0;
            int k = 0;

            while (!seCruzaConA && j < a.length()) {
                if (b.charAt(i) == a.charAt(j)) {
                    seCruzaConA = true;
                    i += 2;
                    break;
                }

                j++;
            }

            while (i < b.length() && seCruzaConA && k < c.length()) {
                if (b.charAt(i) == c.charAt(k)) {
                    seCruzaConC = true;
                    break;
                }

                k++;
            }

            i++;
        }

        return seCruzaConA && seCruzaConC;
    }

    public static void main(String[] args) {
        System.out.println(puedenColocarse("JUGO", "BUENO", "ANANA")); // true
        System.out.println(puedenColocarse("TACHO", "TECHO", "COCO")); // true
        System.out.println(puedenColocarse("JUGO", "FEO", "ANANA")); // false
        System.out.println(puedenColocarse("ROJO", "TIGRE", "TUCAN")); // false
    }
}
