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

        boolean player1Status = true;
        boolean player2Status = true;

        int roundCount = 0;

        int player1Stick = 0;
        int player2Stick = 0;

        while (player1Status == true && player2Status == true) {//Chech if both plyer are still lives

            System.out.println("Stick onthe table");
            System.out.println("1. " + stick1);
            System.out.println("2. " + stick2);
            System.out.println("3. " + stick3);
            System.out.println("4. " + stick4);
            System.out.println("5. " + stick5);            

            while (pick1 != 3 || pick2 != 3) {

                System.out.print("The 1 player turn \nPlease choose the stick number: ");
                pick1 = scan.nextInt();
                roundCount += 1;

                if (pick1 == pick2) {
                    roundCount -= 1;
                    System.out.println("Error you entered the wrong number. Please enter again");
                } else if (pick1 == 1) {
                    stick1 = "";
                    player1Stick += 1;
                    break;

                } else if (pick1 == 2) {
                    stick2 = "";
                    player1Stick += 1;
                    break;

                } else if (pick1 == 4) {
                    stick4 = "";
                    player1Stick += 1;
                    break;

                } else if (pick1 == 5) {
                    stick5 = "";
                    player1Stick += 1;
                    break;

                } else if (pick1 == 3) {
                    player1Status = false;
                    player1Stick += 1;
                    break;

                } else {
                    roundCount -= 1;
                    System.out.println("Error you entered the wrong number. Please enter again");
                }

            }
            if (player1Status == true && player2Status == true) {

                System.out.println("Stick onthe table");
                System.out.println("1. " + stick1);
                System.out.println("2. " + stick2);
                System.out.println("3. " + stick3);
                System.out.println("4. " + stick4);
                System.out.println("5. " + stick5);

                while (pick2 != 3 || pick1 != 3) {

                    System.out.print("The 2 player turn \nPlease choose the stick number: ");
                    pick2 = scan.nextInt();
                    roundCount += 1;

                    if (pick1 == pick2) {
                        roundCount -= 1;
                        System.out.println("Error you entered the wrong number. Please enter again");
                    } else if (pick2 == 1) {
                        stick1 = "";
                        player2Stick += 1;
                        break;

                    } else if (pick2 == 2) {
                        stick2 = "";
                        player2Stick += 1;
                        break;

                    } else if (pick2 == 4) {
                        stick4 = "";
                        player2Stick += 1;
                        break;

                    } else if (pick2 == 5) {
                        stick5 = "";
                        player2Stick += 1;
                        break;

                    } else if (pick2 == 3) {
                        player2Status = false;
                        player2Stick += 1;
                        break;

                    } else {
                        roundCount -= 1;
                        System.out.println("Error you entered the wrong number. Please enter again");
                    }

                }
            }
        }

        //Result
        if (pick1 == 3) {
            System.out.println("The winner is player 2 \nThe loser is player 1");
        } else if (pick2 == 3) {
            System.out.println("The winner is player 1 \nThe loser is player 2");
        }

        System.out.println("The total rounds " + roundCount);
        System.out.println("Player 1 picked " + player1Stick + " stick(s).");
        System.out.println("Player 2 picked " + player2Stick + " stick(s).");

    }
}