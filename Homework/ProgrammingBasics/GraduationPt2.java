import java.util.Scanner;

public class GraduationPt2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        int badGrade = 0;
        double averageGrade = 0;
        double allGrades = 0;
        int i = 1;

        double n = Double.parseDouble(scanner.nextLine());
        for (; i <= 12; i++) {
            allGrades = allGrades + n;
            if (n < 4) {
                badGrade++;
                if (badGrade == 2) {
                    break;
                }
            }
            else if (i == 12){
                    break;
                }


            n = scanner.nextDouble();
        }
        if (i == 12) {
            averageGrade = allGrades / 12;
            System.out.printf("%s graduated. Average grade: %.2f", name, averageGrade);

        }
        else  {
            System.out.printf("%s has been excluded at %d grade" , name , i - 1);
        }
    }
}