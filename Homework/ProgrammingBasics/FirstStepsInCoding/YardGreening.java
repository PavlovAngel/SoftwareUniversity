package ProgrammingBasics.FirstStepsInCoding;

import java.util.Scanner;

public class YardGreening {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String place = scanner.nextLine();
        double meters = Double.parseDouble(place);
        double price = 7.61;
        double discount = 0.18;
        double finalprice = meters * price;
        double finaldiscount = finalprice * discount;
        double finalprice2 = meters * price - finaldiscount;
        System.out.printf("The final price is: " + "%.2f" + " lv." + "%n", finalprice2);
        System.out.printf("The discount is: " + "%.2f" + " lv.", finaldiscount);
    }
}