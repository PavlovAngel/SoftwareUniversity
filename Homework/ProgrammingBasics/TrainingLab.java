import java.util.Scanner;

public class TrainingLab {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double w = Double.parseDouble(scanner.nextLine());
        double h = Double.parseDouble(scanner.nextLine());
        double workplaceW = 120;
        double workplaceH = 70;
        double halllane = 100;
        double workplacesumW = Math.floor(((h * 100 ) - halllane)/  workplaceH ) ;
        double workplacesumH =  Math.floor((w * 100 ) / workplaceW  );
        double allworkplaces = workplacesumW * workplacesumH ;
        double newworkplace  = allworkplaces - 3;
        System.out.printf("%.0f",newworkplace);



    }
}
