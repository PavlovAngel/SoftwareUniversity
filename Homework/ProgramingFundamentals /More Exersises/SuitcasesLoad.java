import java.util.Scanner;

public class SuitcasesLoad {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double capacitySize = Double.parseDouble(scanner.nextLine());
        double allSuitcasesSize = 0;
        int count = 0;
        int count1 = 0;
        String input = scanner.nextLine();
        int count2 = 0;


        while (!input.equals("End")) {
            double suitcasesSize = Double.parseDouble(input);
            count++;
            count1++;

            if (count == 3) {
                suitcasesSize = suitcasesSize + suitcasesSize * 0.10;
                count = 0;
            }
            if (capacitySize >= allSuitcasesSize + suitcasesSize) {
                allSuitcasesSize += suitcasesSize;

            } else {
                System.out.println("No more space!");
                count1 = count1 - 1;
                count2 = 1;
                break;


            }


            input = scanner.nextLine();

        }

        if (count2 == 0) {
            System.out.println("Congratulations! All suitcases are loaded!");
        }
        System.out.println("Statistic: " + count1 + " " + "suitcases loaded.");
    }
}
