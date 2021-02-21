import java.util.Scanner;

public class Numbers1toNwithStep3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int i = Integer.parseInt(scanner.nextLine());
        for (int a = 1; a <= i; a += 3){
            System.out.println(a);
        }
    }
}
