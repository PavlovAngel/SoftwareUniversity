import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int cakePieces = 0;
        int cakeWidth = Integer.parseInt(input);
        input = scanner.nextLine();
        int cakeLength = Integer.parseInt(input);
        int cakeSize = cakeLength * cakeWidth;
        int leftPieces = 0;
        input = scanner.nextLine();


        while (!input.equals("STOP")) {

            cakePieces = Integer.parseInt(input);
            cakeSize -= cakePieces;

            if (cakeSize <= 0) {
                System.out.printf("No more cake left! You need %d pieces more.", Math.abs(cakeSize));
                break;
            }
            input = scanner.nextLine();
        }
        if (input.equals("STOP")) {
            System.out.printf("%d pieces are left.", cakeSize);
        }


    }
}
