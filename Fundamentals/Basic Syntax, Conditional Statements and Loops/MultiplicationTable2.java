import java.util.Scanner;

public class MultiplicationTable2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int i = Integer.parseInt(scanner.nextLine());
        int sum = 0;
        if (i <= 10) {
            for (; i <= 10; i++) {
                sum = num * i;
                System.out.printf("%d X %d = %d%n", num, i, sum);
            }
        }
            else{
                sum = num * i;
                System.out.printf("%d X %d = %d%n", num, i, sum);

            }


    }
}
