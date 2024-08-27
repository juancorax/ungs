// Escribir un metodo static void ponerNota(double x, double y) que toma dos numeros de-
// cimales y los promedia. En caso que el promedio sea mayor o igual a 7, debera imprimir
// ‘‘Promocionado’’, si es mayor o igual a 4 pero menor que 7, imprime ‘‘Aprobado’’ y si es menor
// que 4 imprime ‘‘Debe recuperar’’. Probarla llamandola desde el main con distintos numeros.
// Luego, pedirle ambos numeros al usuario (usando nextFloat() del Scanner) para pasarselos a
// ponerNota.

import java.util.Scanner;

public class Ejercicio8 {

    static float[] pedirNumeros() {
        Scanner scan = new Scanner(System.in);

        System.out.println("Por favor, ingrese el primer numero:");
        float primerNumero = scan.nextFloat();
        System.out.println("Por favor, ingrese el segundo numero:");
        float segundoNumero = scan.nextFloat();

        return new float[] { primerNumero, segundoNumero };
    }

    static String ponerNota(float[] numeros) {
        String resultado;

        float promedio = (numeros[0] + numeros[1]) / 2;

        if (promedio >= 7) {
            resultado = "Promocionado";
        } else if (promedio >= 4 && promedio < 7) {
            resultado = "Aprobado";
        } else {
            resultado = "Debe recuperar";
        }

        return resultado;
    }

    public static void main(String[] args) {
        System.out.println(ponerNota(pedirNumeros()));
    }
}
