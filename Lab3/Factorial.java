import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 1;
        int fac = 0;
        int contain = 1;
        while (true) {
            System.out.print("Factorial convert: ");
            fac = input.nextInt();
            if (fac < 0) {
                System.out.println("Number can't be negative");
            } else {
                break;
            }
        }

        while(count<=fac){
            contain = contain * count;
            count++;
        }

        System.out.print("= " + contain);

    }
}
