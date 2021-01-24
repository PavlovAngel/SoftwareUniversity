import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int videoCardPrice = Integer.parseInt(scanner.nextLine());
        int adapter = Integer.parseInt(scanner.nextLine());
        double pricePerDay = Double.parseDouble(scanner.nextLine());
        double profitPerDay = Double.parseDouble(scanner.nextLine());
        int paidMoney =videoCardPrice * 13 + adapter * 13 + 1000;
        double fullProfitPerDay = ((profitPerDay - pricePerDay) * 13);
        System.out.println(paidMoney);
        System.out.printf("%.0f" ,Math.ceil(paidMoney/fullProfitPerDay) );

    }
}
