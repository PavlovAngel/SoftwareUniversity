import java.util.Scanner;

public class AccountBalance {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double newMoney = 0;
        double allMoney = 0;
        while (!input.equals("NoMoreMoney")) {
            newMoney = Double.parseDouble(input);
            if (newMoney < 1) {
                System.out.println("Invalid operation!");
                break;
            } else {
                allMoney = allMoney + newMoney;
                System.out.printf("Increase: %.2f%n" , newMoney);
                input = scanner.nextLine();

            }

        }
        System.out.printf("Total: %.2f" , allMoney);

    }
}
