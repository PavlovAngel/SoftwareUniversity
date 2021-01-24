import java.util.Scanner;

public class Scholarship {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double avgSalary = Double.parseDouble(scanner.nextLine());

        double avgGrade = Double.parseDouble(scanner.nextLine());

        double minSalary = Double.parseDouble(scanner.nextLine());

        double socialScholarship =Math.floor(minSalary * 0.35);

        double scholarship = avgGrade * 25;

        if (avgSalary < minSalary) {
            if (avgGrade > 4.5) {
                if (socialScholarship < scholarship) {
                    System.out.printf("You get a scholarship excellent results %f BGN", scholarship);
                }
            } 

        } else if (avgGrade >= 5.5) {
            if (scholarship >= socialScholarship){
                System.out.printf("You get a Social scholarship for %f BGN", socialScholarship);
            }
        } else  {
            System.out.println("You cannot get a scholarship!");

        }


    }
}
