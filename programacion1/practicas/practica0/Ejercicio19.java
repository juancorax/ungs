// Una palabra se dice que es “abecedaria” si las letras en la palabra aparecen en orden alfabetico.
// Implementar un algoritmo para decidir si una palabra dada es abecedaria, asumiendo que la misma
// contiene solo letras minusculas.

public class Ejercicio19 {

    static String devolverSinAcentos(String s) {
        String cadenaSinAcentos = "";
        char[] vocalesConAcento = { 'á', 'é', 'í', 'ó', 'ú' };
        char[] vocales = { 'a', 'e', 'i', 'o', 'u' };

        for (int i = 0; i < s.length(); i++) {
            boolean letraConAcento = false;

            for (int j = 0; j < vocalesConAcento.length; j++) {
                if (s.charAt(i) == vocalesConAcento[j]) {
                    cadenaSinAcentos += vocales[j];
                    letraConAcento = true;
                    break;
                }
            }

            if (!letraConAcento) {
                cadenaSinAcentos += s.charAt(i);
            }
        }

        return cadenaSinAcentos;
    }

    static boolean esAbecedaria(String s) {
        String copiaDeCadena = devolverSinAcentos(s);

        for (int i = 0; i < copiaDeCadena.length() - 1; i++) {
            if (copiaDeCadena.charAt(i) > copiaDeCadena.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        System.out.println(esAbecedaria("adios"));
        System.out.println(esAbecedaria("ágil"));
    }
}
