import java.util.Scanner;

public class StrongNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

      int num = Integer.parseInt(scanner.nextLine());
      String numToString = Integer.toString(num);
      int sum = 0;
      int factorial = 1;
      int charToInt = 0;

        for (int i = 0; i < numToString.length(); i++) {
            charToInt = Character.getNumericValue(numToString.charAt(i));
            for (int n = 1; n <= charToInt ; n++) {
                factorial *= n;

            }
            sum += factorial;
            factorial = 1;
        }
        if (num == sum){
            System.out.println("yes");
        }
        else   {
            System.out.println("no");
        }

    }
}
