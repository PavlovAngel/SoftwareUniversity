import java.util.Scanner;

public class TriplesOfLatinLetters {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());
        int stop = 97+n;
        for (int i = 97; i < stop; i++) {
            for (int j = 97; j < stop; j++) {
                for (int k = 97; k < stop; k++) {
                        System.out.printf("%c%c%c%n",i,j,k);

                    }


                }
            }

        }
    }

