// Ejercicio 12
public class PC {

    private String serial;
    private String modelo;
    private String os;
    private Componente[] componentes;

    public PC(String serial, String modelo, String os, int cantidadDeComponentes) {
        this.serial = serial;
        this.modelo = modelo;
        this.os = os;
        this.componentes = new Componente[cantidadDeComponentes];
    }

    public String getSerial() {
        return serial;
    }

    public String getModelo() {
        return modelo;
    }

    public String getOs() {
        return os;
    }

    public Componente[] getComponentes() {
        return componentes;
    }
}
