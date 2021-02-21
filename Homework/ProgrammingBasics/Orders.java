import java.util.Scanner;

public class Orders {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double quantity = Double.parseDouble(scanner.nextLine());

        switch (input) {
            case "coffee" -> coffee(quantity, 1.5);
            case "water" -> water(quantity, 1.0);
            case "coke" -> coke(quantity, 1.4);
            case "snacks" -> snacks(quantity, 2.0);
        }
    }

    static void coffee(double quantity , double price ) {
        System.out.printf("%.2f", quantity * price);


    }

    static void water(double quantity , double price) {
        System.out.printf("%.2f", quantity * price);
    }

    static void coke(double quantity , double price) {
        System.out.printf("%.2f", quantity * price);

    }

    static void snacks(double quantity , double price) {
        System.out.printf("%.2f", quantity * price);
    }


}
