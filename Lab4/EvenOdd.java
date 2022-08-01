import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double sumOdd = 0;
        double sumEven = 0;

        while (true) {
            System.out.print("Input number: ");
            char s = scan.next().charAt(0);

            if (s == 'Z') {
                break;
            }

            double randomNum = s;
            randomNum = randomNum - 48;
            //Char change into int make them binary form so minus 48 which is 0 in int made them a round number

            if (randomNum % 2 == 0) {
                sumEven = sumEven + randomNum;

            } else if (randomNum % 2 != 0) {
                sumOdd = sumOdd + randomNum;

            }

        }

        System.out.println(sumEven);
        System.out.println(sumOdd);

    }
}
