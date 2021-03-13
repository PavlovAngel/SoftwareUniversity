import java.util.*;

public class PrintNumbersInReverseOrder {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int[] numbers = new int[n];
        int[] reverseNumbers = new int[n];
        for (int i = 0; i < n; i++) {
            numbers[i] = Integer.parseInt(scanner.nextLine());
        }
        int index = 0;
        for (int i = numbers.length-1; i >= 0; i--) {
            reverseNumbers[index] = numbers[i];
            index++;
        }
        System.out.println(Arrays.toString(reverseNumbers)
                .replaceAll("\\]"," ")
                .replaceAll("\\[","")
                .replaceAll(",",""));
    }
}