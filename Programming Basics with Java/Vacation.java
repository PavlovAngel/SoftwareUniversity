import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double priceForVacation = Double.parseDouble(scanner.nextLine());
        double savedMoney = Double.parseDouble(scanner.nextLine());
        int spendDays = 0;
        int allDays = 0;

        String input = scanner.nextLine();
        double newMoney = 0;
        while (spendDays < 5) {


            if (input.equals("spend")) {
                newMoney = scanner.nextDouble();
                spendDays++;
                allDays++;
                savedMoney -= newMoney;
                if (savedMoney < 0) {
                    savedMoney = 0;
                }


            } else if (input.equals("save")) {
                newMoney = scanner.nextDouble();
                savedMoney += newMoney;
                spendDays = 0;
                allDays++;

                if (priceForVacation <= savedMoney) {
                    System.out.printf("You saved the money for %d days.", allDays);
                    break;
                }
                }
                input = scanner.nextLine();

        }

        if (spendDays >= 5) {
            System.out.printf("You can't save the money.%n%d", allDays);
        }
        {

        }


    }
}
