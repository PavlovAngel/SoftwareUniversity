import java.util.Scanner;

public class Moving {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int width = Integer.parseInt(scanner.nextLine());
        int length = Integer.parseInt(scanner.nextLine());
        int high = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        int allRoomMeters = width * length * high;
        int boxes = 0;
        int metresLeft = allRoomMeters;                       //квадратите които остават

        while (!input.equals("Done")) {
            boxes = Integer.parseInt(input);
            metresLeft = metresLeft - boxes;
            boxes += boxes;

            input = scanner.nextLine();

            if (boxes > allRoomMeters) {
                System.out.printf("No more free space! You need %d Cubic meters more.", Math.abs(metresLeft));
                break;
            }                                 //ако кутийте са повече от мястото спри цикъла
            else if (metresLeft == 0) {
                System.out.printf("%d Cubic meters left.", (metresLeft));
            }

                                  //прочети новите кашони
            else if (input.equals("Done")) {
                System.out.printf("%d Cubic meters left.", Math.abs(metresLeft));
            }

        }
    }
}

