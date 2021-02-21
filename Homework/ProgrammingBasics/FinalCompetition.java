import java.util.Scanner;

public class FinalCompetition {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int dancers = Integer.parseInt(scanner.nextLine());
        double points = Double.parseDouble(scanner.nextLine());
        String season = scanner.nextLine();
        String place = scanner.nextLine();
        double money = 0;
        double moneyPerDancer = 0;
        double charity = 0;
        double moneyForCharity = 0;

        if (place.equals("Bulgaria")) {
            money = dancers * points;

            if (season.equals("summer")) {
                money = money - money * 0.05;
            } else {
                money = money - money * 0.08;

            }
            moneyForCharity = money - money * 0.75;
            charity = money - moneyForCharity;
            money = money - money * 0.75;
            moneyPerDancer = money / dancers;
            System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charity, moneyPerDancer);

        } else {
            money = dancers * points;
            money = money + money * 0.50;
            if (season.equals("summer")) {
                money = money - money * 0.10;

            } else {
                money = money - money * 0.15;
            }
            moneyForCharity = money - money * 0.75;
            charity = money - moneyForCharity;
            money = money - money * 0.75;
            moneyPerDancer = money / dancers;


            System.out.printf("Charity - %.2f%nMoney per dancer - %.2f", charity, moneyPerDancer);

        }


        }

}
