// Ejercicio 9
public class Agenda {

    private Persona[] contactos;
    private String[] telefonos;

    // a)
    public Agenda(int tamanio) {
        this.contactos = new Persona[tamanio];
        this.telefonos = new String[tamanio];
    }

    public Persona[] getContactos() {
        return contactos;
    }

    public String[] getTelefonos() {
        return telefonos;
    }

    public void setContactos(Persona[] contactos) {
        this.contactos = contactos;
    }

    public void setTelefonos(String[] telefonos) {
        this.telefonos = telefonos;
    }

    // b)
    public void redimensionarArreglos() {
        Persona[] nuevoContactos = new Persona[contactos.length + 1];
        String[] nuevoTelefonos = new String[telefonos.length + 1];

        for (int i = 0; i < contactos.length; i++) {
            nuevoContactos[i] = contactos[i];
            nuevoTelefonos[i] = telefonos[i];
        }

        setContactos(nuevoContactos);
        setTelefonos(nuevoTelefonos);
    }

    public void guardar(Persona contacto, String telefono) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] == null) {
                contactos[i] = contacto;
                telefonos[i] = telefono;

                return;
            }
        }

        redimensionarArreglos();

        contactos[contactos.length - 1] = contacto;
        telefonos[telefonos.length - 1] = telefono;
    }

    // c)
    public void eliminar(Persona contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contacto.mismaPersona(contactos[i])) {
                this.contactos[i] = null;
                this.telefonos[i] = null;

                return;
            }
        }

        System.out.println("No se encontro el contacto.");
    }

    // d)
    public boolean pertenece(Persona contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contacto.mismaPersona(contactos[i])) {
                return true;
            }
        }

        return false;
    }

    // e)
    public String dameTelefono(Persona contacto) {
        for (int i = 0; i < contactos.length; i++) {
            if (contactos[i] != null && contacto.mismaPersona(contactos[i])) {
                return telefonos[i];
            }
        }

        return null;
    }
}
