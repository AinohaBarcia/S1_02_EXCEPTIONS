package n1exerici1;

public class Main {
    public static void main(String[] args) throws Exception {


        Venda compra1 = new Venda ();
        //compra1.addProducts(new Producte("pa",10));
        //compra1.addProducts(new Producte("sindria",32));

        //System.out.println(compra1.totalCost());




        try {
            int totalPriceSales = compra1.totalCost();
        }catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }
}
