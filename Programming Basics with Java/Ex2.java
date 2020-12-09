import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String gender = scanner.nextLine();
        double kilograms = Double.parseDouble(scanner.nextLine());
        double high = Double.parseDouble(scanner.nextLine());
        int age = Integer.parseInt(scanner.nextLine());
        String activity = scanner.nextLine();
        double bnm = 0;

        if (gender.equals("m")) {
            bnm = 66 + (13.7 * kilograms) + (5 * high * 100) - (6.8 * age);
            switch (activity) {
                case "sedentary":
                    bnm = bnm * 1.2;
                    break;
                case "lightly active":
                    bnm = bnm * 1.375;
                    break;
                case "moderately active":
                    bnm = bnm * 1.55;
                    break;
                case "very active":
                    bnm = bnm * 1.725;
                    break;
            }


        } else if (gender.equals("f")) {
            bnm = 655 + (9.6 * kilograms) + (1.8 * high * 100) - (4.7 * age);
            switch (activity) {
                case "sedentary":
                    bnm = bnm * 1.2;
                    break;
                case "lightly active":
                    bnm = bnm * 1.375;
                    break;
                case "moderately active":
                    bnm = bnm * 1.55;
                    break;
                case "very active":
                    bnm = bnm * 1.725;
                    break;
            }


        }
        System.out.printf("To maintain your current weight you will need %.0f calories per day.",Math.ceil(bnm));





    }
}
