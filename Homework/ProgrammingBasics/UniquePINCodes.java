import java.util.Scanner;

public class UniquePINCodes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1 = Integer.parseInt(scanner.nextLine());
        int num2 = Integer.parseInt(scanner.nextLine());
        int num3 = Integer.parseInt(scanner.nextLine());
        int i = 0;
        int j = 0;
        int k = 0;
        while (i <= num1 && j <= num2 && k <= num3) {
            for (i = 1; i <= num1; i++) {
                for (j = 2; j <= num2; j++) {

                    for (k = 1; k <= num3; k++) {
                        if (i % 2 == 0 && k % 2 == 0 && (j == 2 || j == 3 || j == 5 || j == 7)) {


                            System.out.printf("%d %d %d%n", i, j, k);

                        }

                    }
                }
            }
        }
    }
}




