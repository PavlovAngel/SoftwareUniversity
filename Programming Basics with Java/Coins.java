import java.util.Scanner;

public class Coins {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double leftMoney = Double.parseDouble(scanner.nextLine());
        double moneyInCoins = Math.floor(leftMoney * 100);
        int coins = 0;
        while (moneyInCoins > 0)
            if (moneyInCoins >= 200) {
                moneyInCoins -= 200;
                coins++;
            } else if (moneyInCoins >= 100) {
                moneyInCoins -= 100;
                coins++;
            } else if (moneyInCoins >= 50) {
                moneyInCoins -= 50;
                coins++;
            } else if (moneyInCoins >= 20) {
                moneyInCoins -= 20;
                coins++;
            } else if (moneyInCoins >= 10) {
                moneyInCoins -= 10;
                coins++;
            } else if (moneyInCoins >= 5) {
                moneyInCoins -= 5;
                coins++;
            } else if (moneyInCoins >= 2) {
                moneyInCoins -= 2;
                coins++;
            } else if (moneyInCoins >= 1) {
                moneyInCoins -= 1;
                coins++;
            }
        System.out.println(coins);


    }

}
