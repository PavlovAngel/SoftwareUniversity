import java.util.Scanner;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int num = 0;
        int[] nums = new int[n];
        for (int i = 0; i < n; i++) {
            num = Integer.parseInt(scanner.nextLine());
            nums[i] = num;

        }
        for (int i = n - 1 ; i >= 0; i--) {
            System.out.println(nums[i]);

        }
    }
}
