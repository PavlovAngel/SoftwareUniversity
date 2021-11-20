package ProgrammingBasics.ContidionalStatementsExercise;

import java.util.Scanner;

public class BonusScore {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        double bonus = 0;
        double result ;
        if (num <= 100) {
            bonus = 5;

        } else if (num < 1000) {
            bonus = num * 0.20;

        } else if (num > 1000) {
            bonus = num * 0.10 ;

        }
        if (num % 2 == 0) {
            bonus = bonus + 1;
        }
        if (num % 10 == 5) {
            bonus = bonus + 2;

        }
        result = num + bonus;

        System.out.println(bonus);
        System.out.println(result);
    }
}
