import java.util.Scanner;

public class DaysOfWeek {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numOfDay = Integer.parseInt(scanner.nextLine()) -1;

        String [] days = {
          "Monday",
          "Tuesday",
          "Wednesday",
          "Thursday",
          "Friday",
          "Saturday",
          "Sunday"
        };
        if (numOfDay >= 0 && numOfDay  < 7){
            System.out.println(days[numOfDay]);

        }
        else {
            System.out.println("Invalid day!");
        }

    }
}
