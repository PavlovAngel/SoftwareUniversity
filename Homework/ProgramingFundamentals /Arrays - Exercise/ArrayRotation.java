import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class ArrayRotation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        int n = Integer.parseInt(scanner.nextLine());
        List<String> list = new ArrayList<>(Arrays.asList(input));
        for (int i = 0; i <n ; i++) {
            list.add(list.remove(0));

        }


        System.out.println(String.join(" ",list));
    }
}
