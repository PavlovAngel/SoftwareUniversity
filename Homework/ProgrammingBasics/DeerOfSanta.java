import java.util.Scanner;

public class DeerOfSanta {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int daysWithoutSanta = Integer.parseInt(scanner.nextLine());
        int kgFood = Integer.parseInt(scanner.nextLine());
        double  deerFood1 = Double.parseDouble(scanner.nextLine());
        double deerFood2 = Double.parseDouble(scanner.nextLine());
        double deerFood3 = Double.parseDouble(scanner.nextLine());
        double foodNeed = daysWithoutSanta * deerFood1 + daysWithoutSanta * deerFood2 + daysWithoutSanta * deerFood3;

        if (foodNeed > kgFood){
            System.out.printf("%.0f more kilos of food are needed.", Math.ceil( Math. abs( foodNeed - kgFood)));

        }
        else {
            System.out.printf("%.0f kilos of food left.", Math.floor (kgFood - foodNeed));
        }
    }


}
