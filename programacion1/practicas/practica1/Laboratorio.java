// Ejercicio 12
public class Laboratorio {

    private int numero;
    private int capacidad;
    private PC[] computadoras;

    public Laboratorio(int numero, int capacidad, int cantidadDeComputadoras) {
        this.numero = numero;
        this.capacidad = capacidad;
        this.computadoras = new PC[cantidadDeComputadoras];
    }

    public int getNumero() {
        return numero;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public PC[] getComputadoras() {
        return computadoras;
    }
}
