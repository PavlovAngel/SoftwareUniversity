import java.util.Scanner;

public class ToyShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceVacation = Double.parseDouble(scanner.nextLine());
        int puzzles = Integer.parseInt(scanner.nextLine());
        int speakDoll = Integer.parseInt(scanner.nextLine());
        int bearsDoll = Integer.parseInt(scanner.nextLine());
        int minions = Integer.parseInt(scanner.nextLine());
        int trick = Integer.parseInt(scanner.nextLine());
        double allMoney = puzzles * 2.60 + speakDoll * 3 + bearsDoll * 4.10 + minions * 8.20 + trick * 2;
        int allToys = puzzles + speakDoll + bearsDoll + minions + trick;

        if (allToys >= 50) {
            allMoney = allMoney - allMoney * 0.25;

        }
        double moneyForVacation = allMoney - allMoney * 0.10;

        double neededMoney = (priceVacation - moneyForVacation);
        double lefMoney = (moneyForVacation - priceVacation);

        if (moneyForVacation >= priceVacation) {

            System.out.printf("Yes! %.2f lv left.", lefMoney);
        } else {
            System.out.printf("Not enough money! %.2f lv needed.", neededMoney);
        }
    }
}
