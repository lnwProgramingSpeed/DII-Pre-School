import java.util.Scanner;

public class Stick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stick1 = "------";
        String stick2 = "------";
        String stick3 = "------";
        String stick4 = "------";
        String stick5 = "------";

        int pick1 = 0;
        int pick2 = 0;

        while (pick1 != 3 || pick2 != 3) {
            System.out.println("Stick onthe table");
            System.out.println("1. " + stick1);
            System.out.println("2. " + stick2);
            System.out.println("3. " + stick3);
            System.out.println("4. " + stick4);
            System.out.println("5. " + stick5);

            while (pick1 != 3 || pick2 != 3) {
                System.out.print("The 1 player turn \nPlease choose the stick number: ");
                pick1 = scan.nextInt();
                
                if (pick1 == pick2) {
                    System.out.println("Error you entered the wrong number. Please enter again");
                } else if (pick1 == 1) {
                    stick1 = "";
                    break;

                } else if (pick1 == 2) {
                    stick2 = "";
                    break;

                } else if (pick1 == 4) {
                    stick4 = "";
                    break;

                } else if (pick1 == 5) {
                    stick5 = "";
                    break;

                } else if (pick1 == 3) {
                    break;

                } else {
                    System.out.println("Error you entered the wrong number. Please enter again");
                }
            }
            System.out.println("Stick onthe table");
            System.out.println("1. " + stick1);
            System.out.println("2. " + stick2);
            System.out.println("3. " + stick3);
            System.out.println("4. " + stick4);
            System.out.println("5. " + stick5);

            while (pick2 != 3 || pick1 != 3) {
                System.out.print("The 2 player turn \nPlease choose the stick number: ");
                pick2 = scan.nextInt();

                if (pick1 == pick2) {
                    System.out.println("Error you entered the wrong number. Please enter again");
                } else if (pick2 == 1) {
                    stick1 = "";
                    break;

                } else if (pick2 == 2) {
                    stick2 = "";
                    break;

                } else if (pick2 == 4) {
                    stick4 = "";
                    break;

                } else if (pick2 == 5) {
                    stick5 = "";
                    break;

                } else if (pick2 == 3) {
                    break;

                } else {
                    System.out.println("Error you entered the wrong number. Please enter again");
                }
            }

        }

        if (pick1 == 3) {
            System.out.println("The winner is player 2 \nThe loser is player 1");
        } else if (pick2 == 3) {
            System.out.println("The winner is player 1 \nThe loser is player 2");
        }

    }
}
