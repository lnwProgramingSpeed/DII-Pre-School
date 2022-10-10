import java.util.Scanner;

public class Q1 {
    /*************************************
     * labMethodQ1 accepts two integers.
     * it will return 0 when both integers are negative, otherwise return the
     * summation.
     */
    public static int labMethodQ1(int x, int y) {
        /* calculate the summation here */
        int sum = x + y;

        if (sum >= 0) {/* modify the condition here */
            return sum;
        } else {
            return 0;
        }
    }

    public static void main(String[] args) {
        int x, y;
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter integer 1:");
        x = scan.nextInt();
        System.out.print("Enter integer 2:");
        y = scan.nextInt();
        System.out.println(labMethodQ1(x, y));
    }
}