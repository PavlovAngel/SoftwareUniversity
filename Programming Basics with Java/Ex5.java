import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int age = 0;
        int adults = 0;
        int kids = 0;
        int toys = 0;
        int sweaters = 0;



        while (!input.equals("Christmas")) {
            age = Integer.parseInt(input);
            if (age <= 16) {
                kids ++;

            }
            else {
                adults ++;
            }
           input = scanner.nextLine();
        }
        System.out.printf("Number of adults: %d%n",adults);
        System.out.printf("Number of kids: %d%n",kids);
        System.out.printf("Money for toys: %d%n",kids*5);
        System.out.printf("Money for sweaters: %d%n", adults * 15);

    }
}
