package ProgrammingBasics.ConditionalStatements;

import java.util.Scanner;

public class AreaOfFigures {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String figure = scanner.nextLine();
        if ("square".equals(figure)) {
            double a = Double.parseDouble(scanner.nextLine());
            double result = a * a;
            System.out.printf("%.3f", result);
        } else if ("rectangle".equals(figure)) {
            double b = Double.parseDouble(scanner.nextLine());
            double c = Double.parseDouble(scanner.nextLine());
            double result = b * c;
            System.out.printf("%.3f", result);
        } else if ("circle".equals(figure)) {
            double r = Double.parseDouble(scanner.nextLine());
            double result = (r * r )* Math.PI;
            System.out.printf("%.3f", result);
        } else if ("triangle".equals(figure)) {
            double d = Double.parseDouble(scanner.nextLine());
            double e = Double.parseDouble(scanner.nextLine());
            double result = (d * e) / 2;
            System.out.printf("%.3f", result);
        }


    }
}
