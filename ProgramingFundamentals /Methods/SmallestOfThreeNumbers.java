import java.util.Scanner;

public class SmallestOfThreeNumbers {
    private static int minNum = Integer.MAX_VALUE;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 3 ; i++) {

            findSmallestNum(scanner);
        }
        System.out.println(minNum);
    }

    private static int findSmallestNum(Scanner scanner) {
        int input = Integer.parseInt(scanner.nextLine());

        if (input < minNum) {
            minNum = input;
        }
        return input;
    }

}
