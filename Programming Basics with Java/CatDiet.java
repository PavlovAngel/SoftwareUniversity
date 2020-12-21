import java.util.Scanner;

public class CatDiet {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        double percentFat = Double.parseDouble(scanner.nextLine());
        double percentProteins = Double.parseDouble(scanner.nextLine());
        double percentCarbohydrates = Double.parseDouble(scanner.nextLine());
        double calories = Double.parseDouble(scanner.nextLine());
        double percentWater = Double.parseDouble(scanner.nextLine());
        double result = 0;
        double grams = 0;
        double percentFatResult = (calories * (percentFat / 100)) / 9;
        double percentProteinsResult = (percentProteins * (percentProteins / 100)) / 9;
        double percentCarbohydratesResult = (percentCarbohydrates * (percentCarbohydrates / 100)) / 9;
        double waterLeftPercent = 100 - percentWater;
        grams = percentFatResult + percentProteinsResult + percentCarbohydratesResult;
        double caloriesPerGram = calories / grams;
        result = caloriesPerGram * (waterLeftPercent / 100);
        System.out.printf("%.4f", result);
    }

}
