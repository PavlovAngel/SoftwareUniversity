import java.util.Arrays;
import java.util.Scanner;

public class Top5Integers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] input = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        boolean isBigger = false;
        int numbers = 0;
        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i+1; j <= input.length - 1; j++) {
                if (input[i] > input[j]) {
                    isBigger = true;
                } else {
                    isBigger = false;
                    break;
                }
            }
            if (isBigger) {
                numbers = input[i];
                System.out.print(numbers + " ");
            }

        }
        numbers = input[input.length - 1];
        System.out.print(numbers);
    }
}
