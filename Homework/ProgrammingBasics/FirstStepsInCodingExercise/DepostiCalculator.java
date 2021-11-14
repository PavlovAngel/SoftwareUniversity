package ProgrammingBasics.FirstStepsInCodingExercise;

import java.util.Scanner;

public class DepostiCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double sum = Double.parseDouble(scanner.nextLine());
        int mounth = Integer.parseInt(scanner.nextLine());
        double yearpercent = Double.parseDouble(scanner.nextLine());
        double yearpercent2 = yearpercent  / 100;
        System.out.println(sum + mounth * ((sum * yearpercent2) /12));
       
    }

}
