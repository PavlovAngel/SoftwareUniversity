import java.util.Scanner;
import java.util.function.IntUnaryOperator;

public class ExcellentResult {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int grade = Integer.parseInt(scanner.nextLine());

        if (grade > 4 ){
            System.out.println("Excellent!");
        }
    }
}
