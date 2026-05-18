import Models.Persona;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new Scanner(System.in);
        ArrayList<Persona> personas = new ArrayList<>();
        int cantidad;
        int edadBusca;

        do {
            System.out.println("Ingrese la cantidad de personas: ");
            cantidad = entrada.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor a cero");
            }

        } while (cantidad <= 0);

        for (int i = 0; i < cantidad; i++) {
            System.out.println("Persona " + (i + 1));

            System.out.println("Ingrese el nombre: ");
            String nombre = entrada.next();

            int edad;

            do {
                System.out.println("Ingrese la edad: ");
                edad = entrada.nextInt();

                if (edad <= 0) {
                    System.out.println("Edad debe ser mayor a 0");
                }
            } while (edad <= 0);

            System.out.println("\nLista sin ordenar");
            Persona persona = new Persona(nombre, edad);
            personas.add(persona);
        }


        BusquedaBinaria bBinaria = new BusquedaBinaria();

        bBinaria.sortByAge(personas);
        System.out.println("\nOrden por edad");
        for (Persona persona : personas) {
            System.out.println(persona + ", ");
        }

        System.out.println("Ingrese la edad que desea buscar: ");
        edadBusca = entrada.nextInt();

        int posicion = bBinaria.findByAge(personas, edadBusca);

        if (posicion != -1) {
            System.out.println("\nLa persona con la edad " + edadBusca + " es " + personas.get(posicion).getNombre());
        } else {
            System.out.println("\nPersona no encontrada");
        }

        entrada.close();

    }
}
