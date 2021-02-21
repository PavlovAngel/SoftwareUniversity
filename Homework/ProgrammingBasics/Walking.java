import java.util.Scanner;

public class Walking {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        int allSteps = 0;
        int needSteps = 0;
        int leftSteps = 0;
	String input  = "Hello"
<D-i><D-i><D-d>
        while (!input.equals("Going home")){
           int steps = Integer.parseInt(input);

            allSteps += steps;

           if (allSteps>= 10000){
               leftSteps = allSteps - 10000;
               System.out.printf("Goal reached! Good job!%n%d steps over the goal!",leftSteps);
               break;
           }
            input =  scanner.nextLine();
        }
        if (input.equals("Going home")){
          int  steps = scanner.nextInt();
            allSteps += steps;
          needSteps = 10000 - allSteps;
          leftSteps = allSteps - 10000;

            if (allSteps < 10000) {
                System.out.printf("%d more steps to reach goal.", needSteps);
            }
            else if  {
                System.out.printf("Goal reached! Good job!%n%d steps over the goal!", leftSteps);
            }
        }

    }
}
