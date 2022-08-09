import java.util.Scanner;

public class ascending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number ascending: ");
        int num1 = scan.nextInt();
        int num2 = scan.nextInt();
        int num3 = scan.nextInt();

        int sorted = 0;
        for (int i = 0; sorted < 3; i++) {
            int ascendingNum = 0;
            if (i == num1 || i == num2 || i == num3) {
                sorted++;
                ascendingNum++;
                for (int j = 0; j < ascendingNum; j++) {
                    System.out.print(i + " ");
                }
            }
        }
    }
}
