package ProgrammingBasics.FirstStepsInCodingExercise;

import java.util.Scanner;

public class SuppliesForSchool {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double penPackPrice = 5.80;
        double markerPackPrice = 7.20;
        double preparationPricePerLiter = 1.20;

        int penQuantity = Integer.parseInt(scanner.nextLine());
        int markerQuantity = Integer.parseInt(scanner.nextLine());
        int preparationLiters = Integer.parseInt(scanner.nextLine());
        int percentDiscount = Integer.parseInt(scanner.nextLine());

        double bill = ((penQuantity * penPackPrice)+
                (markerPackPrice * markerQuantity)+
                (preparationLiters * preparationPricePerLiter));
        double finalBill = bill - (percentDiscount * bill / 100 );



        System.out.println(finalBill);



    }
}
