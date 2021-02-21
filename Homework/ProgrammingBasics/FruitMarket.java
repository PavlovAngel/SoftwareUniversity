import java.util.Scanner;

public class FruitMarket {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double strawberryprice = Double.parseDouble(scanner.nextLine());
        double bananas = Double.parseDouble(scanner.nextLine());
        double oranges = Double.parseDouble(scanner.nextLine());
        double raspberryes = Double.parseDouble(scanner.nextLine());
        double strawberries = Double.parseDouble(scanner.nextLine());
        double rasspberryprice = strawberryprice / 2 ;
        double orangesprice = rasspberryprice - (0.40 * rasspberryprice);
        double bananaprice = rasspberryprice - (0.80 * rasspberryprice);
        double bananaprice1 = bananas * bananaprice;
        double orangeprice1 = oranges * orangesprice;
        double raspberryprice1 = raspberryes * rasspberryprice;
        double strawberryprice1 = strawberries * strawberryprice;
        double finalprice = bananaprice1 + orangeprice1 + raspberryprice1 + strawberryprice1;
        System.out.printf("%.2f",finalprice );

    }
}
