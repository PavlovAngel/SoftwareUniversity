package ProgrammingBasics.FirstStepsInCoding;

import java.util.Scanner;

public class InchesToCentimeters {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        double Centimeters = Double.parseDouble(scanner.nextLine());
        double b = 2.54 ;
        double inches = Centimeters * b ;
        System.out.println(inches);

    }
}
