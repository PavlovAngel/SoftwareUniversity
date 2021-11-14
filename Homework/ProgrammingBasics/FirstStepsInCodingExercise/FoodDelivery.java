package ProgrammingBasics.FirstStepsInCodingExercise;

import java.util.Scanner;

public class FoodDelivery {
    public static void main(String[] args) {

        double chickenMenuPrice = 10.35;
        double fishMenuPrice = 12.40;
        double vegetarianMenuPrice = 8.15;
        double deliveryPrice = 2.50;
        Scanner scanner = new Scanner(System.in);
        int chickenMenuQuantity = Integer.parseInt(scanner.nextLine());
        int fishMenuQuantity = Integer.parseInt(scanner.nextLine());
        int vegetarianMenuQuantity = Integer.parseInt(scanner.nextLine());
        double orderPrice = (chickenMenuQuantity * chickenMenuPrice)
                + (fishMenuQuantity * fishMenuPrice)
                + (vegetarianMenuQuantity * vegetarianMenuPrice);
        double desertPrice = orderPrice * 0.20;
        double finalPrice = orderPrice + deliveryPrice + desertPrice;
        System.out.println(finalPrice);
    }
}
