import Models.Persona;
import java.util.ArrayList;

public class BusquedaBinaria {

    public void mostrarEdades(ArrayList<Persona> personas, int bajo, int alto) {

        for (int i = bajo; i <= alto; i++) {
            System.out.print(personas.get(i).getEdad());

            if (i < alto) {
                System.out.print(" | ");
            }
        }

        System.out.println();
    }

    public int findByAge(ArrayList<Persona> personas, int edad) {

        int alto = personas.size() - 1;
        int bajo = 0;

        while (bajo <= alto) {

            mostrarEdades(personas, bajo, alto);

            int central = (bajo + alto) / 2;
            int valorCentro = personas.get(central).getEdad();

            System.out.print("bajo=" + bajo);
            System.out.print("\talto=" + alto);
            System.out.print("\tcentro=" + central);
            System.out.print("\tvalorCentro=" + valorCentro);

            if (valorCentro == edad) {
                System.out.println("\t--> ENCONTRADO");
                return central;
            }

            if (valorCentro < edad) {
                System.out.println("\t--> DERECHA");
                bajo = central + 1;
            } else {
                System.out.println("\t--> IZQUIERDA");
                alto = central - 1;
            }

            System.out.println();
        }

        return -1;
    }

    public void sortByAge(ArrayList<Persona> personas) {

        boolean cambio;

        for (int i = 0; i < personas.size() - 1; i++) {
            cambio = false;
            for (int j = 0; j < personas.size() - 1 - i; j++) {
                if (personas.get(j).getEdad() > personas.get(j + 1).getEdad()) {
                    Persona aux = personas.get(j);
                    personas.set(j, personas.get(j + 1));
                    personas.set(j + 1, aux);
                    cambio = true;
                }

            }

            if (!cambio) {
                break;
            }
        }
    }

}
