import java.util.Scanner;

public class MetricConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double num = Double.parseDouble(scanner.nextLine());
        String first = scanner.nextLine();
        String second = scanner.nextLine();
        double result = 0;

        if (first.equals("mm") && second.equals("m")) {
            result = num * 0.001;
        } else if (first.equals("mm") && second.equals("cm")) {
            result = num * 0.1;

        } else if (first.equals("m") && second.equals("mm")) {
            result = num * 1000;

        } else if (first.equals("m") && second.equals("cm")) {
            result = num * 100;
        } else if (first.equals("cm") && second.equals("m")) {
            result = num * 0.01;

        } else if (first.equals("cm") && second.equals("mm")){
            result = num * 10;

        }
        System.out.printf("%.3f", result);

    }
}
