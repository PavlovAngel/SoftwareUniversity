import java.util.Locale;
import java.util.Scanner;

public class VowelsCount {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        String word = scanner.nextLine().toLowerCase(Locale.ROOT);
        for (int i = 0; i < word.length(); i++) {
            char character = word.charAt(i);
            switch (character) {
                case 'a':
                    count++;
                    break;
                case 'u':
                    count++;
                    break;
                case 'e':
                    count++;
                    break;
                case 'i':
                    count++;
                    break;
                case 'o':
                    count++;
                    break;

            }
        }
        System.out.println(count);
    }

}

