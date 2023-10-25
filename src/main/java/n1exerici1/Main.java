package n1exerici1;

public class Main {
    public static void main(String[] args) throws Exception {


        Venda compra1 = new Venda ();
        compra1.addProducts(new Producte("pa",10));
        compra1.addProducts(new Producte("sindria",32));

        System.out.println("La compra 1 te un cost de: " +compra1.totalCost()+" euros");

        Venda compra2 = new Venda();
        System.out.println("La compra 1 te un cost de: " + compra2.totalCost()+" euros");




        try {
            int totalPriceSales = compra1.totalCost();
        }catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
    }
}
