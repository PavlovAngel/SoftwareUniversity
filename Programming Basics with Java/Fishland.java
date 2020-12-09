import java.util.Scanner;

public class Fishland {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double SkumriaPrice = Double.parseDouble(scanner.nextLine());
        double CacaPrice = Double.parseDouble(scanner.nextLine());
        double PalamudKg = Double.parseDouble(scanner.nextLine());
        double SafridKg = Double.parseDouble(scanner.nextLine());
        int MidiKg = Integer.parseInt(scanner.nextLine());
        double PalamudPrice = SkumriaPrice + SkumriaPrice * 0.60;
        double SafridPrice = CacaPrice + CacaPrice * 0.80;
        double MidiPrice = MidiKg * 7.5;
        double PalamudSum = PalamudKg * PalamudPrice ;
        double SafridSum = SafridKg * SafridPrice;
        double FinalPrice = MidiPrice + PalamudSum + SafridSum;
        System.out.printf("%.2f", FinalPrice);



    }
}
