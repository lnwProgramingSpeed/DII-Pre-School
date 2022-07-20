import java.util.Scanner;

public class cmuShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("His/Her membership status: ");
        String member = scan.nextLine().toUpperCase();
        System.out.print("The money that He/Her spend: ");
        double spend = scan.nextDouble();

        double[] discount = { 0, 0, 0 };

        if (member.equals("SILVER")) {
            discount[0] = .02;
            discount[1] = .03;
            discount[2] = .05;
            if (spend > 0 && spend <= 1000) {
                spend = spend - spend * discount[0];
            } else if (spend > 1000 && spend <= 10000) {
                spend = spend - spend * discount[1];
            } else if (spend > 10000) {
                spend = spend - spend * discount[2];
            }
        } else if (member.equals("GOLD")) {
            discount[0] = .05;
            discount[1] = .08;
            discount[2] = .1;
            if (spend > 0 && spend <= 1000) {
                spend = spend - spend * discount[0];
            } else if (spend > 1000 && spend <= 10000) {
                spend = spend - spend * discount[1];
            } else if (spend > 10000) {
                spend = spend - spend * discount[2];
            }
        }

        System.out.print(spend);
    }
}
