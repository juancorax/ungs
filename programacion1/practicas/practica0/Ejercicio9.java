// Escribir un metodo static void imprimirFecha(int dia, int mes, int anio) que imprime la
// fecha pasada como parametro en formato del estilo “5 de Julio de 2030”.

public class Ejercicio9 {

    static void imprimirFecha(int dia, int mes, int anio) {
        String[] meses = { "Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre",
                "Octubre", "Noviembre", "Diciembre" };

        String mesAString = "";

        for (int i = 0; i < meses.length; i++) {
            if (mes == i + 1) {
                mesAString = meses[i];
                break;
            }
        }

        System.out.println(dia + " de " + mesAString + " de " + anio);
    }

    public static void main(String[] args) {
        imprimirFecha(5, 7, 2030);
    }
}
