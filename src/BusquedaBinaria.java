import Models.Product;

public class BusquedaBinaria {

    public int findByName(Product[] products, String nombre){

        // Definamos alto y bajo

        int alto = products.length -1;
        int bajo = 0;

        while(bajo <= alto){

            // Definimos centro
            int central = (bajo + alto)/2;

            if (products[central].getNombre().equals(nombre)){
                return central;
            }

            // Si voy a la der. o iz.

            if (products[central].getNombre().compareTo(nombre) < 0){
                bajo = central + 1;
            } else {
                alto = central -1;
            }
        }
        return -1;
    }

    public void sortByName(Product[] products){

        boolean cambio;

        for(int i = 0; i < products.length -1; i++){
            cambio = false;
            for (int j = 0; j < products.length -1 -i; j++) {
                if (products[j].getNombre().compareToIgnoreCase(products[j+1].getNombre()) > 0){
                    Product aux = products[j];
                    products[j] = products[j+1];
                    products[j+1] = aux;
                    cambio = true;
                }
                
            }

            if(!cambio){
                break;
            }

        }
            
    }

}
