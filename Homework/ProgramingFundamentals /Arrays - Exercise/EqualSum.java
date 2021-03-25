import java.util.Arrays;
import java.util.Scanner;

public class EqualSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int leftSum = 0;
        int rightSum = 0;
        boolean isEqual = false;
        int[] input = Arrays.stream(scanner.nextLine()
                .split(" "))
                .mapToInt(Integer::parseInt)
                .toArray();
        for (int middleIndex = 0; middleIndex <= input.length - 1; middleIndex++) {


            for (int leftIndex = 0; leftIndex < middleIndex; leftIndex++) {
                leftSum += input[leftIndex];
            }
            for (int rightIndex = middleIndex + 1; rightIndex <= input.length - 1; rightIndex++) {
                rightSum += input[rightIndex];
            }
            if (leftSum == rightSum){
                isEqual = true;
                System.out.println(middleIndex);
                break;
            }
            if (input.length==1){
                isEqual = true;
                System.out.println("0");
                break;
            }

            leftSum = 0;
            rightSum = 0;
        }
        if (!isEqual){
            System.out.println("no");
        }


    }
}
