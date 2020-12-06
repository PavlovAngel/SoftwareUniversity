import java.util.Scanner;

public class CharityCampaign {
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int days = Integer.parseInt(scanner.nextLine());
    int chefs = Integer.parseInt(scanner.nextLine());
    int cake  = Integer.parseInt(scanner.nextLine());
    int waffles = Integer.parseInt(scanner.nextLine());
    int pancakes = Integer.parseInt(scanner.nextLine());
    int cakeprice = cake * 45;
    double wafflesprice = waffles * 5.80;
    double pancakesprice = pancakes * 3.20;
    double allmoneyperchef = (cakeprice + wafflesprice + pancakesprice) * chefs ;
    double  allmoneyperday = (allmoneyperchef * days);
    double finalprice = (allmoneyperday / 8) * 7 ;


        System.out.printf("%.2f" , finalprice);

    }

    }

