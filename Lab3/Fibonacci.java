import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int count = 0;
        int num1 = 0, num2 = 1, num3 = 1;

        System.out.print("index: ");
        int index = input.nextInt();
        
        while (count < index) {
            if (index == 0) {
                System.out.print("0");
            } else {
                System.out.print(num3 + " ");
                num3 = num1 + num2;
                num1 = num2;
                num2 = num3;
            }
            count++;
        }

    }
}
