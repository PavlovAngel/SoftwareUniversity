import java.util.Scanner;

public class OldBook {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String searchedBook = scanner.nextLine();
        String booksName = scanner.nextLine();
        int booksSum = 0;
        while (!booksName.equals(searchedBook)){
            booksName = scanner.nextLine();
            booksSum++;

            if (booksName.equals("No More Books")){
                System.out.printf("The book you search is not here!%nYou checked %d books." , booksSum);
                break;
            }
        }
        if (booksName.equals(searchedBook)){
            System.out.printf("You checked %d books and found it.", booksSum);
        }
    }
}
