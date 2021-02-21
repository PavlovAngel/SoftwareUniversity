import java.security.spec.RSAOtherPrimeInfo;
import java.util.Scanner;

public class Vacation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int group = Integer.parseInt(scanner.nextLine());
        String ticket = scanner.nextLine();
        String day = scanner.nextLine();
        double pricePerPerson = 0.0;
        double finalPrice = 0.0;

        if (ticket.equals("Students")) {
            if (day.equals("Friday")) {
                pricePerPerson = 8.45;

            } else if (day.equals("Saturday")) {
                pricePerPerson = 9.80;
            } else if (day.equals("Sunday")) {
                pricePerPerson = 10.46;

            }
            finalPrice = pricePerPerson * group;
            if (group >= 30) {
                finalPrice = finalPrice - (finalPrice * 0.15);
            }


        }
        if (ticket.equals("Business")) {
            if (day.equals("Friday")) {
                pricePerPerson = 10.90;

            } else if (day.equals("Saturday")) {
                pricePerPerson = 15.60;

            } else if (day.equals("Sunday")) {

                pricePerPerson = 16;

            }
            finalPrice = pricePerPerson * group;
            if (group >= 100) {

                finalPrice = finalPrice - (pricePerPerson * 10);
            }
        }
        if (ticket.equals("Regular")) {
            if (day.equals("Friday")) {
                pricePerPerson = 15;

            } else if (day.equals("Saturday")) {
                pricePerPerson = 20;

            } else if (day.equals("Sunday")) {
                pricePerPerson = 22.50;

            }
            finalPrice = pricePerPerson * group;
            if (group >= 10 && group <= 20) {
                finalPrice = finalPrice - (finalPrice * 0.05);
            }
        }


        System.out.printf("Total price: %.2f", finalPrice);
    }
}
