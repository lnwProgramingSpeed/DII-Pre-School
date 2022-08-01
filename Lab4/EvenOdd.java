import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int randomNum = 0;
        int sumOdd = 0;
        int sumEven = 0;
        char s = (char) randomNum;
        while (s != 'Z') {
            System.out.print("Input number: ");
            randomNum = scan.nextInt();

            if (randomNum % 2 == 0) {
                sumEven = sumEven + randomNum;
            } else {
                sumOdd = sumOdd + randomNum;
            }
        }

        System.out.print(sumEven);
        System.out.print(sumOdd);

    }
}
