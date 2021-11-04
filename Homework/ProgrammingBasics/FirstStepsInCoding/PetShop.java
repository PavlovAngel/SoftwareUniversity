package ProgrammingBasics.FirstStepsInCoding;

import java.util.Scanner;

public class PetShop {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dogs = scanner.nextLine();
        String animals = scanner.nextLine();
        double dogfood = Double.parseDouble(dogs) * 2.5;
        double animalsfood = Double.parseDouble(animals) * 4;
        double finalprice = animalsfood + dogfood;

        System.out.println(finalprice);


    }
}


