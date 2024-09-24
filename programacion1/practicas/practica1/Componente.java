// Ejercicio 12
public class Componente {

    private String nombre;
    private String tipo;
    private Marca marca;

    public Componente(String nombre, String tipo, String nombreDeMarca, float calidadDeMarca) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.marca = new Marca(nombreDeMarca, calidadDeMarca);
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public Marca getMarca() {
        return marca;
    }
}
