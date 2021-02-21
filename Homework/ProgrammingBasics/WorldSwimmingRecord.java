import java.util.Scanner;

public class WorldSwimmingRecord {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double worldRecordSeconds = Double.parseDouble(scanner.nextLine());
        double swimmingMeters = Double.parseDouble(scanner.nextLine());
        double timeForMeter = Double.parseDouble(scanner.nextLine());
        double waterResist = Math.floor(swimmingMeters / 15) * 12.5;
        double finalTime = (swimmingMeters * timeForMeter) + waterResist;

         
        if (finalTime < worldRecordSeconds) {
            System.out.printf("Yes, he succeeded! The new world record is %.2f seconds.", finalTime);
        } else if (finalTime >= worldRecordSeconds) {
            System.out.printf("No, he failed! He was %.2f seconds slower.", finalTime - worldRecordSeconds);
        }


    }
}




