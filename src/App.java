import Models.Persona;
import java.util.Scanner;
import java.util.ArrayList;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner entrada = new
        ArrayList<Persona> personas = new ArrayList<>();        
        int cantidad; 

        do{
            System.out.println("Ingrese la cantidad de personas: ");
            cantidad = entrada.nextInt();

            if (cantidad <= 0) {
                System.out.println("La cantidad debe ser mayor a cero");
            }

        }while(cantidad<=0);

        for(int i = 0; i < cantidad; i++){
            System.out.println("Persona "+ (i + 1));

            System.out.println("Ingrese el Nombre ");
            String nombre = entrada.next();

            System.out.println("Ingres la edad ");
            int edad = entrada.nextInt();

            Persona persona = new Persona(nombre, edad);

            personas.add(persona);
        }



        //BusquedaBinaria bBinaria = new BusquedaBinaria();

        // bBinaria.sortByName(products);
        // for (Product product : products) {
        //     System.out.println(product + ", ");
        // }

        // int res = bBinaria.findByName(products, "Laptop");
        // if (res >= 0){
        //     System.out.println("Encontrado en la posicion = " + res);
        // } else {
        //     System.out.println("No se encontro");
        // }

        entrada.close();

    }
}
