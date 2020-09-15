//Kabrina Brady

import java.util.Scanner;

public class UpdatedBookOrderBrady {
    public static void main (String[] args) {
        double subtotal;
        int numBooks;
        final double TAXRATE = 0.055;
        final double SHIPPINGPERBOOK = 1.5;
        double finalPrice;

        //Gets number of books purchased
        System.out.println("Number of books purchased: ");
        Scanner input = new Scanner(System.in);
        numBooks = input.nextInt();

        //Gets book subtotal
        System.out.println("Book Subtotal: ");
        subtotal = input.nextDouble();

        finalPrice = taxAndShip(subtotal, TAXRATE, SHIPPINGPERBOOK, numBooks);

        //Prints the receipt
        System.out.println("Number of books purchased: " + numBooks);
        System.out.println("Book Subtotal: $" + subtotal);
        System.out.printf("Order Total: $%.2f", finalPrice);
    }

    public static double taxAndShip(double sub, double taxr, double ship, int numb) {
        double tax;
        double shipping;
        double priceOfOrder;

        //Computes the tax
        tax = sub * taxr;

        //Computes the shipping
        shipping = ship * numb;

        //Computes the final price
        priceOfOrder = sub + tax + shipping;

        return priceOfOrder;
    }
}