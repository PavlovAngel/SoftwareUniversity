import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int chickenMenu = Integer.parseInt(scanner.nextLine());
        int  fishMenu = Integer.parseInt(scanner.nextLine());
        int veggieMenu = Integer.parseInt(scanner.nextLine());

        double price = (chickenMenu * 10.35) + (fishMenu * 12.40) + (veggieMenu * 8.15);
        double desert = price + price * 0.20;
        double  delivery  = 2.50d;

        double finalPrice =   desert + delivery;




        System.out.printf("Total: %.2f", finalPrice);


    }
}
