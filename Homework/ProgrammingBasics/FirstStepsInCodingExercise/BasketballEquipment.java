package ProgrammingBasics.FirstStepsInCodingExercise;

import java.util.Scanner;

public class BasketballEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        int pricePerYear = Integer.parseInt(scanner.nextLine());
        double shoesPrice = pricePerYear - (pricePerYear * 0.40);
        double outfitPrice = shoesPrice - (shoesPrice * 0.20);
        double ballPrice = outfitPrice / 4;
        double accessoriesPrice = ballPrice / 5;
        double finalPrice = shoesPrice + outfitPrice + ballPrice + accessoriesPrice + pricePerYear;
        System.out.println(finalPrice);

    }
}
