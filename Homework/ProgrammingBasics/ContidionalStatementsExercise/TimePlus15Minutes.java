package ProgrammingBasics.ContidionalStatementsExercise;

import java.util.Scanner;

public class TimePlus15Minutes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int hours = Integer.parseInt(scanner.nextLine());
        int minutes = Integer.parseInt(scanner.nextLine());
        int hoursInMin = hours * 60;
        int allMinutes = hoursInMin + minutes + 15;
        int H = allMinutes / 60;
        int M = allMinutes % 60;
        if (H > 23 ){
            H = 0;
        }


        System.out.printf("%d:%02d", H , M);


    }
}
