import java.util.Scanner;

public class PadawanEquipment {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double amountMoney = Double.parseDouble(scanner.nextLine());
        int countStudents = Integer.parseInt(scanner.nextLine());
        double priceOfLightsaber = Double.parseDouble(scanner.nextLine());
        double priceOfRobe = Double.parseDouble(scanner.nextLine());
        double priceOfBelt = Double.parseDouble(scanner.nextLine());
        int freeBelts = 0;
        int count = 0;
        for (int i = 0; i < countStudents; i++) {
            count++;
            if (count == 6) {
                freeBelts++;
                count = 0;
            }
        }
        priceOfLightsaber = priceOfLightsaber * Math.ceil(countStudents + countStudents * 0.10);
        priceOfRobe = countStudents * priceOfRobe;
        priceOfBelt = (countStudents - freeBelts) * priceOfBelt;
        double fullPrice = priceOfLightsaber + priceOfRobe + priceOfBelt;
        if (fullPrice <= amountMoney) {
            System.out.printf("The money is enough - it would cost %.2flv.", fullPrice);
        } else {
            System.out.printf("Ivan Cho will need %.2flv more.%n", Math.abs(fullPrice - amountMoney));
        }

    }
}
