import java.util.Scanner;

public class GodzillaVsKong {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double budget = Double.parseDouble(scanner.nextLine());
        int staticMan = Integer.parseInt(scanner.nextLine());
        double dressPrice = Double.parseDouble(scanner.nextLine());
        double decor = budget * 0.10;
        double staticManDressPrice = staticMan * dressPrice;
        if (staticMan > 150) {
            staticManDressPrice = staticManDressPrice - 0.10 * staticManDressPrice;
        }

        double allPrice = staticManDressPrice + decor;
        double leftMoney = budget - allPrice;
        double needMoney = allPrice - budget;

        if (leftMoney >= 0) {
            System.out.printf("Action!%nWingard starts filming with %.2f leva left.", leftMoney);
        } else {
            System.out.printf("Not enough money!%nWingard needs %.2f leva more.", needMoney);
        }


    }
}
