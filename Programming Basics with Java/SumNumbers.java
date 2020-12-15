import java.util.Scanner;

public class SumNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = Integer.parseInt(scanner.nextLine());
        int input = 0;
        int numbs = 0;
        while (num > 0) {
            input = scanner.nextInt();
            num = num - input;
            numbs = numbs + input;

        }
        System.out.println(numbs);
    }
}
