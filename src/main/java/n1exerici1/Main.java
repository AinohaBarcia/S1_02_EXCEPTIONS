package n1exerici1;

public class Main {
    public static void main(String[] args) {


        Venda compra1 = new Venda();
        compra1.addProducts(new Producte("pa", 10));
        compra1.addProducts(new Producte("sindria", 32));

        Venda compra2 = new Venda();

        System.out.println("En la compra1 hem afegit pa i sindria pel que ens " +
                "mostrarà el total de la venta");
        try {
            int totalPriceSales = compra1.totalCost();
            System.out.println("La compra 1 te un cost de: " + compra1.totalCost() + " euros");

        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Ara veurem que com la compra2 no te productes llençarà la excepció");
        try {
            int totalPriceSales = compra2.totalCost();
            System.out.println("La compra 1 te un cost de: " + compra2.totalCost() + " euros");
        } catch (EmptySaleException e) {
            System.out.println(e.getMessage());
        }
        System.out.println();
        System.out.println("Ara  probarem la cauistica de ArrayIndexOutOfBonds");

        String[] products = { "pineapple", "watermelon","bread" };
        try {
            String s = products[10];

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
            System.out.println("El programa no ha petat");
        }

/*
        if () {

        } else {
            throw new ArrayIndexOutOfBoundsException("Índice fuera del rango del array");
        }*/

        }


}
