package n1exerici1;

import java.util.ArrayList;

public class Venda {
    private ArrayList<Producte> products;
    int totalPriceSales;

    public Venda() {
        products = new ArrayList<Producte>();
    }

    public ArrayList<Producte> getProducts() {
        return products;
    }

    public ArrayList<Producte> addProducts(Producte producte){
        products.add(producte);
        return products;
    }

    public int getTotalPriceSales() {
        return totalPriceSales;
    }
    public int  totalCost() throws EmptySaleException {

        int totalPriceSales=0;
        int i=0;


        if (products.isEmpty()) {

            throw new EmptySaleException("Per fer una compra primer has d'afegir productes");

        }else {
            for(i=0;i<products.size();i++) {
                totalPriceSales+=products.get(i).getPrice();
            }
        }


        return totalPriceSales;
    }
    public void showProducte (int index) throws ArrayIndexOutOfBoundsException{

        if (index >= 0 && index < products.size()) {
            System.out.println(products.get(index));
        } else {
            throw new ArrayIndexOutOfBoundsException("Índice fuera del rango del array");
        }

    }

}
