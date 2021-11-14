package ProgrammingBasics.FirstStepsInCodingExercise;

import java.util.Scanner;

public class FishTank {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = Integer.parseInt(scanner.nextLine());
        int l = Integer.parseInt(scanner.nextLine());
        int h = Integer.parseInt(scanner.nextLine());
        double percent = Double.parseDouble(scanner.nextLine());
        double percentValue = percent / 100;
        double litreskb = t * l * h;
        double litres = litreskb * 0.001;
        double result = litres - (percentValue * litres);



        System.out.printf("%f",result);

    }
}
