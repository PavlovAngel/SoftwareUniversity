import java.util.Scanner;

public class ExamPreparation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int badGrades = Integer.parseInt(scanner.nextLine());
        String problem = scanner.nextLine();
        double averageGrade = 0 ;
        double i = 0 ;
        int allGrades = 0;
        double problems = 0;
        String lastProblem = "";



        while (!problem.equals("Enough")) {
            lastProblem = problem;
        problems ++;
            int grade = Integer.parseInt(scanner.nextLine());
            if (grade <=4  ){
                i++;
            }

            if (i == badGrades){
                System.out.printf("You need a break, %d poor grades.", badGrades);

                break;
            }
            allGrades +=grade;
            averageGrade = allGrades / problems;
            problem = scanner.nextLine();

        }
        if (problem.equals("Enough")){
            System.out.printf("Average score: %.2f%n", averageGrade);
            System.out.printf("Number of problems: %d%n",(int)(problems));
            System.out.printf("Last problem: %s", lastProblem);

        }
        }

}
