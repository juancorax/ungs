
// Ejercicio 8
import java.util.Scanner;

public class Main {

    // a)
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Por favor, ingrese el nombre o ubicacion de la imagen:");
            String ubicacion = scanner.nextLine();

            if (ubicacion.equals("")) {
                System.out.println("No se ha ingresado un nombre o ubicacion.");
                break;
            }

            Imagen imagen = new Imagen(ubicacion);

            Dibujador.dibujar(imagen);
        }
    }
}
