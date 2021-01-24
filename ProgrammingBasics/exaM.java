import java.util.Scanner;

public class exaM {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String fruit = scanner.nextLine();
        String set = scanner.nextLine();
        int pieceSet = Integer.parseInt(scanner.nextLine());
        double finalPrice = 0;

        switch (fruit) {
            case "Watermelon":
                if (set.equals("small")) {
                    finalPrice = (2 * 56) * pieceSet;


                } else if (set.equals("big")) {
                    finalPrice = (5 * 28.70) * pieceSet;

                }

                break;
            case "Pineapple":
                if (set.equals("small")) {
                    finalPrice = (2 * 42.10) * pieceSet;

                } else if (set.equals("big")) {
                    finalPrice = (5 * 24.80) * pieceSet;

                }

                break;
            case "Mango":
                if (set.equals("small")) {
                    finalPrice = (2 * 36.66) * pieceSet;

                } else if (set.equals("big")) {
                    finalPrice = (5 * 19.60) * pieceSet;

                }

                break;
            case "Raspberry":
                if (set.equals("small")) {
                    finalPrice = (2 * 20) * pieceSet;

                } else if (set.equals("big")) {
                    finalPrice = (5 * 15.20) * pieceSet;

                }

                break;
        }
        if (finalPrice >= 400 && finalPrice <= 1000) {
            finalPrice = finalPrice - finalPrice * 0.15;
        } else if (finalPrice > 1000) {
            finalPrice = finalPrice - finalPrice * 0.50;
        }
        System.out.printf("%.2f lv.", finalPrice);
    }


}
