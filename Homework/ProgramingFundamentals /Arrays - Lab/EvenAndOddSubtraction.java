import java.util.Scanner;

public class EvenAndOddSubtraction {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String [] input = scanner.nextLine().split(" ");
        int [] numbers = new int[input.length];

        for (int i = 0; i <input.length ; i++) {
            numbers[i] = Integer.parseInt(input[i]);
        }
        int evenSum = 0;
        int oddSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if(numbers[i]%2==0){
                evenSum += numbers[i];
            }
            else {
                oddSum+= numbers[i];
            }
        }
        int result = evenSum - oddSum;
        System.out.println(result);
    }
}
