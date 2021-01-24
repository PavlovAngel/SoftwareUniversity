import java.util.Scanner;

public class ExcursionSale {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int see = Integer.parseInt(scanner.nextLine());
        int mountain = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int profit = 0;

        while (!input.equals("Stop")) {
            if (input.equals("mountain")) {
                mountain -= 1;
                if (mountain >= 0) {
                    profit += 499;
                }
            } else {

                see -= 1;
                if (see >= 0) {
                    profit += 680;
                }

            }
            if (see <= 0 && mountain <= 0){
                System.out.printf("Good job! Everything is sold.%n");
                break;
            }


            input = scanner.nextLine();

        }
        System.out.printf("Profit: %d leva." , profit);


    }

    }

