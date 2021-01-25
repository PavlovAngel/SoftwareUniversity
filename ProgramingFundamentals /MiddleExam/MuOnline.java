import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class MuOnline {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int initialHealth = 100;
        int bitcoins = 0;
        int num = 0;
        int healedHealth = 0;
        int count = 0;
        boolean youDie = true;
        int currentHealth = 0;
        String input = scanner.nextLine();
        String[] rooms = input.split("\\|");
        for (int i = 0; i < rooms.length; i++) {
            count++;
            String[] monsters = rooms[i].split(" ");
            num = Integer.parseInt(monsters[1]);
            String name = monsters[0];
            currentHealth = initialHealth;
            if (name.equals("potion")) {
                initialHealth += num;
                if (initialHealth > 100) {
                    healedHealth = 100 - currentHealth;
                    initialHealth = 100;
                    System.out.printf("You healed for %d hp.%n", healedHealth);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                } else {
                    healedHealth = num;
                    System.out.printf("You healed for %d hp.%n", healedHealth);
                    System.out.printf("Current health: %d hp.%n", initialHealth);
                }

            } else if (name.equals("chest")) {
                System.out.printf("You found %d bitcoins.%n", num);
                bitcoins += num;
            } else {
                initialHealth -= num;
                if (initialHealth > 0) {
                    System.out.printf("You slayed %s.%n", name);
                } else {
                    System.out.printf("You died! Killed by %s.%n", name);
                    System.out.printf("Best room: %d", i+1);
                    youDie = false;
                    break;
                }
            }

        }
        if (youDie) {
            System.out.println("You've made it!");
            System.out.printf("Bitcoins: %d%n", bitcoins);
            System.out.printf("Health: %d", initialHealth);
        }

    }
}
