import java.util.Scanner;

public class BonusScoringSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int countOfStudents = Integer.parseInt(scanner.nextLine());
        int countOfLectures = Integer.parseInt(scanner.nextLine());
        int initialBonus = Integer.parseInt(scanner.nextLine());
        double bonus = 0.0f;
        double maxBonus = 0.0f;
        int maxAttendances = 0;
        for (int i = 0; i < countOfStudents; i++) {
            int attendancesOfEachStudent = Integer.parseInt(scanner.nextLine());
            bonus = (double) (attendancesOfEachStudent) / (countOfLectures) * (5 + initialBonus);
            if(bonus > maxBonus){
                maxBonus = bonus;
            }
            if (attendancesOfEachStudent > maxAttendances){
                maxAttendances = attendancesOfEachStudent;
            }
        }
        System.out.printf("Max Bonus: %.0f.%n", Math.ceil(maxBonus));
        System.out.printf("The student has attended %d lectures.",maxAttendances);

        //{total bonus} = {student attendances} / {course lectures} * (5 + {additional bonus})

    }
}
