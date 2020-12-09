import java.util.Scanner;

public class BirthdayParty {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double hallprice = Double.parseDouble(scanner.nextLine());
        double cake = hallprice * 0.20;
        double drinks = cake - .45 * cake ;
        double clown  = hallprice / 3;
        System.out.println(hallprice + cake + drinks + clown);
    }
}
