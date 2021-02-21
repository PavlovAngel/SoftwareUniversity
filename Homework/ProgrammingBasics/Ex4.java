import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int m = Integer.parseInt(scanner.nextLine());
        int s = Integer.parseInt(scanner.nextLine());

        for (; m >= n; m--)
            if (m % 2 ==0 && m == s && m % 3 ==0) {
                break;
            }
        else if (m % 2 == 0 && m % 3 == 0) {
            System.out.print(m + " ");

        }
    }
}
