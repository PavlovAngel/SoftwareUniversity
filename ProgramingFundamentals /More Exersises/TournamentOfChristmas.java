import java.util.Scanner;

public class TournamentOfChristmas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int tournamentDays = Integer.parseInt(scanner.nextLine());
        String input = scanner.nextLine();
        String result = "";
        int winsPerDay = 0;
        int losesPerDay = 0;
        double moneyPerDay = 0.0;
        int totalWins = 0;
        int totalLoses = 0;
        double totalMoney = 0.0;
        for (int i = 0; i < tournamentDays; i++) {

            while (!input.equals("Finish")) {
                result = scanner.nextLine();
                if (result.equals("win")) {
                    winsPerDay++;
                    moneyPerDay += 20;
                } else {
                    losesPerDay++;
                }
                input = scanner.nextLine();
            }

            if (winsPerDay > losesPerDay) {
                moneyPerDay = moneyPerDay + moneyPerDay * 0.10;
            }
            totalWins += winsPerDay;
            totalLoses += losesPerDay;
            totalMoney += moneyPerDay;
            winsPerDay = 0;
            losesPerDay = 0;
            moneyPerDay = 0;

            if (i != tournamentDays - 1) {

                input = scanner.nextLine();
            }

        }
        if (totalWins > totalLoses) {
            totalMoney = totalMoney + totalMoney * 0.20;
            System.out.printf("You won the tournament! Total raised money: %.2f", totalMoney);
        } else {
            System.out.printf("You lost the tournament! Total raised money: %.2f", totalMoney);
        }

    }
}
