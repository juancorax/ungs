// Ejercicio 5
public class Persona {

    private String nombre;
    private int edad;

    // a)
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    // b)
    public boolean masJovenQue(Persona otro) {
        return this.getEdad() < otro.getEdad();
    }

    // c)
    public boolean tocayo(Persona otro) {
        return this.getNombre().equals(otro.getNombre());
    }

    // d)
    public boolean mismaPersona(Persona otro) {
        boolean mismoNombre = this.getNombre().equals(otro.getNombre());
        boolean mismaEdad = this.getEdad() == otro.getEdad();

        return mismoNombre && mismaEdad;
    }

    // Ejercicio 7

    // a)
    public static Persona masJoven(Persona[] grupo) {
        Persona personaMasJoven = grupo[0];

        for (Persona persona : grupo) {
            if (persona.getEdad() < personaMasJoven.getEdad()) {
                personaMasJoven = persona;
            }
        }

        return personaMasJoven;
    }

    // b)
    public static Persona buscar(Persona[] grupo, String nombre) {
        for (Persona persona : grupo) {
            if (persona.getNombre().equals(nombre)) {
                return persona;
            }
        }

        return null;
    }
}