import java.util.Scanner;

public class Workout {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int days = Integer.parseInt(scanner.nextLine());
        double km = Double.parseDouble(scanner.nextLine());
        double kmNeed = 0;
        double kmLeft = 0;
        double percents = 0;
        double allKm = km;

        for (int i = 0; i < days; i++) {

            percents = scanner.nextDouble();
            km += km * (percents / 100);
            allKm += km;

        }
        if (allKm < 1000) {
            kmNeed = 1000 - allKm;
            System.out.printf("Sorry Mrs. Ivanova, you need to run %.0f more kilometers", Math.ceil(kmNeed));
        } else {
            kmLeft = allKm - 1000;
            System.out.printf("You've done a great job running %.0f more kilometers!", Math.ceil(kmLeft));
        }


    }
}
