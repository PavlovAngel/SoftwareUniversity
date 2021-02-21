import java.util.Scanner;

public class WaterOverflow {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = Integer.parseInt(scanner.nextLine());
        int litersInTank = 0;
        for (int i = 0; i < n ; i++) {
            int liters = Integer.parseInt(scanner.nextLine());
            if(litersInTank + liters <= 255){
                litersInTank += liters;
                int snake = 5;
                System.out.println(snake);
            }
            else {
                System.out.println("Insufficient capacity!");

            }

        }
        System.out.println(litersInTank);


    }
}
