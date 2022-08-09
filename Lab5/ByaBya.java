import java.util.Scanner;

public class ByaBya {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many number you want to input: ");
        int i = scan.nextInt();

        // Even number
        String even = "";

        // Largest Number
        int largestNum = 0;

        for (int count = 0; count < i; count++) {
            System.out.print("Number: ");
            int userNum = scan.nextInt();

            // Even number
            if (userNum % 2 == 0) {
                even = userNum + " " + even;
            }

            // Prime
            boolean flag = false;
            for (int j = 2; j <= userNum / 2; ++j) {
                // condition for nonprime number
                if (userNum % j == 0) {
                    flag = true;
                    break;
                }
            }

            if (!flag) {
                System.out.println(userNum + " is a prime number.");
            } else {
                System.out.println(userNum + " is not a prime number.");
            }

            // Largest Number
            if (largestNum < userNum) {
                largestNum = userNum;
            }
        }
        System.out.println(even + " is even");
        System.out.println(largestNum + " is largest");
    }
}
