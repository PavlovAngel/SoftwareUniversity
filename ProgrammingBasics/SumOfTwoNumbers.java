import java.util.Scanner;

public class SumOfTwoNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = Integer.parseInt(scanner.nextLine());
        int b = Integer.parseInt(scanner.nextLine());
        int magicNum = Integer.parseInt(scanner.nextLine());
        int result = 0;
        int count = 0;

        for (int firstNum = a; firstNum <= b; firstNum++) {
            for (int secondNum = a; secondNum <= b; secondNum++) {

                count++;
                if (firstNum + secondNum == magicNum) {
                    System.out.printf("Combination N:%d (%d + %d = %d)", count, firstNum, secondNum, magicNum);
                    result = a + b;
                    return;
                }


            }
        }
            if (result != a + b) {
                System.out.printf("%d combinations - neither equals %d", count, magicNum);
            }





    }
}



