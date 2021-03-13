import java.util.Arrays;
import java.util.Scanner;

public class ReverseArrayOfStrings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] strings = scanner.nextLine().split(" ");
        String [] reversedStrings = new String[strings.length];
        for (int i = strings.length-1; i >=0; i--) {
            System.out.print(strings[i]+" ");
        }
    }
}
