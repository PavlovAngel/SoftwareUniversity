package ProgrammingBasics.FirstStepsInCodingExercise;

import java.util.Scanner;

public class RadiansToDegrees {
    public static void main(String[] arg) {
        Scanner scanner = new Scanner(System.in);
        double rad = Double.parseDouble(scanner.nextLine());
        double deg = rad * 180 / Math.PI;
        System.out.printf("%.0f" , deg);

    }
}
