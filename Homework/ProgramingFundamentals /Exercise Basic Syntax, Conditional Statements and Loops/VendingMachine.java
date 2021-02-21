import java.util.Scanner;

public class VendingMachine {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        double sum = 0;

        while (!input.equals("Start")) {

            double inputMoney = Double.parseDouble(input);
            if (inputMoney == 0.1 || inputMoney == 0.2 || inputMoney == 0.5 || inputMoney == 1 || inputMoney == 2) {
                sum += inputMoney;

            } else {
                System.out.println("Cannot accept " + inputMoney);

            }
            input = scanner.nextLine();


        }
        input = scanner.nextLine();
        while (!input.equals("End")) {
            if (input.equals("Nuts")) {
                if (sum >= 2) {
                    sum = sum - 2;
                    System.out.println("Purchased Nuts");
                } else {

                    System.out.println("Not Enough money");
                }
            } else if (input.equals("Water")) {
                if (sum >= 0.7) {
                    sum = sum - 0.7;
                    System.out.println("Purchased Water");
                } else {
                    System.out.println("Not enough money");
                }
            } else if (input.equals("Crisps")) {
                if (sum >= 1.5) {
                    sum = sum - 1.5;
                    System.out.println("Purchased Crisps");
                } else {

                    System.out.println("Not Enough money");
                }
            } else if (input.equals("Soda")) {
                if (sum >= 0.8) {
                    sum = sum - 0.8;
                    System.out.println("Purchased Soda");
                } else {

                    System.out.println("Not Enough money");
                }
            } else if (input.equals("Coke")) {
                if (sum >= 1) {
                    sum = sum - 1;
                    System.out.println("Purchased Coke");
                } else {

                    System.out.println("Sorry, not enough money");
                }
            } else {
                System.out.println("Invalid product");
            }

            input = scanner.nextLine();
        }
        System.out.printf("Change: %.2f" , sum);

    }
}
