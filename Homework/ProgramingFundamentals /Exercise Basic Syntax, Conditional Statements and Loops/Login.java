import java.util.Scanner;

public class Login {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String login = scanner.nextLine();
        StringBuilder password = new StringBuilder();
        int wrongPassword = 1;
        for (int i = login.length()-1 ; i >= 0 ; i--) {
           password.append(login.charAt(i));
        }
        String inputPassword = scanner.nextLine();
        if (inputPassword.contentEquals(password)){
            System.out.printf("User %s logged in.", login);
        }

        while (!inputPassword.contentEquals(password)){
            System.out.println("Incorrect password. Try again.");
            inputPassword = scanner.nextLine();
                if (inputPassword.contentEquals(password)){
                    System.out.printf("User %s logged in.", login);
                    break;
                }
            if (wrongPassword == 3) {
                System.out.printf("User %s blocked!",login);
                break;
            }
            wrongPassword++;
        }


    }
    }

