package ProgrammingBasics.FirstStepsInCodingExercise;

import java.util.Scanner;

public class Repainting {
    public static void main(String[] args) {
        double nylonPricePerMeter = 1.5;
        double paintPricePerLiter = 14.50;
        double thinnerPricePerLiter = 5;
        double nylonBagPrice = 0.40;

        Scanner scanner = new Scanner(System.in);

        int nylonQuantity = Integer.parseInt(scanner.nextLine());
        int paintLiters = Integer.parseInt(scanner.nextLine());
        int thinnerLiters = Integer.parseInt(scanner.nextLine());
        int hoursOfWork = Integer.parseInt(scanner.nextLine());

        double priceForMaterials = ((nylonQuantity + 2) * nylonPricePerMeter) +
                ((paintLiters + (paintLiters * 0.10)) * paintPricePerLiter) +
                (thinnerLiters * thinnerPricePerLiter) + nylonBagPrice;


        double pricePerHour = priceForMaterials * 0.30;


        double finalPrice = priceForMaterials + pricePerHour;
        System.out.println(finalPrice);


    }
}