import java.util.Scanner;

public class Q2 {
    /*************************************
     * powerBy accepts one integer.
     * Method will return 1 if integer is 0
     * otherwise return 2 power by the integer
     * or 2 power by the negative of that integer.
     */
    public static double powerBy(int num) {
        double pownum = 1;

        if (num > 0) {
            for (int i = 0; i < num; i++) {
                pownum = 2 * pownum;
            }
            return pownum;
        } else if (num < 0) {
            num = num * -1;
            for (int i = 0; i < num; i++) {
                pownum = 2 * pownum;
            }
            pownum = 1 / pownum;
            return pownum;
        } else {
            return pownum;
        }

    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Input the number: ");
        int num = scan.nextInt();

        System.out.print(powerBy(num));

    }
}
