import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String country = scanner.nextLine();
        String souvenir = scanner.nextLine();
        int souvenirCount = Integer.parseInt(scanner.nextLine());
        double price = 0;

        switch (country) {
            case "Argentina": {

                switch (souvenir) {
                    case "flags" : {
                        price = souvenirCount * 3.25;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "caps": {
                        price = souvenirCount * 7.20;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "posters" : {
                        price = souvenirCount * 5.10;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "stickers" :
                        price = souvenirCount * 1.25;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;

                    default : System.out.println("Invalid stock!");
                    break;
                }
                break;
            }


            case "Brazil": {

                switch (souvenir) {
                    case "flags" : {
                        price = souvenirCount * 4.20;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;

                    }
                    case "caps" : {
                        price = souvenirCount * 8.50;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "posters" : {
                        price = souvenirCount * 5.35;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "stickers" : {
                        price = souvenirCount * 1.20;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    default: System.out.println("Invalid stock!");
                    break;
                }
                break;
            }

            case "Croatia": {

                switch (souvenir) {
                    case "flags" : {
                        price = souvenirCount * 2.75;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "caps" : {
                        price = souvenirCount * 6.90;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "posters" : {
                        price = souvenirCount * 4.95;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "stickers" : {
                        price = souvenirCount * 1.10;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    default : System.out.println("Invalid stock!");
                    break;
                }
                break;
            }
            case "Denmark": {

                switch (souvenir) {
                    case "flags" : {
                        price = souvenirCount * 3.10;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "caps" : {
                        price = souvenirCount * 6.50;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "posters" : {
                        price = souvenirCount * 4.80;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    case "stickers" : {
                        price = souvenirCount * 0.90;
                        System.out.printf("Pepi bought %d %s of %s for %.2f lv.", souvenirCount, souvenir, country, price);
                        break;
                    }
                    default : System.out.println("Invalid stock!");
                    break;
                }
                break;
            }
            default:
                System.out.println("Invalid country!");
                break;
        }


    }
}
