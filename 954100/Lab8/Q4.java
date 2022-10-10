import java.util.Scanner;

public class Q4 {
    static double currentNum;

    public static double add(double x, double y) {
        currentNum = x + y;
        return currentNum;
    }

    public static double subtract(double x, double y) {
        currentNum = x - y;
        return currentNum;
    }

    public static double multiply(double x, double y) {
        currentNum = x * y;
        return currentNum;
    }

    public static double divide(double x, double y) {
        currentNum = x / y;
        return currentNum;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter number: ");
        currentNum = scan.nextDouble();

        while (true) {

            System.out.print("Enter a word (add,subtract,multiply,divide,exit): ");
            String word = scan.next();
            
            if (word.equals("multiply")) {
                System.out.print("Enter number: ");
                double inputNum = scan.nextDouble();
                multiply(currentNum, inputNum);
                System.out.println("Currently, num : " + currentNum);

            } else if (word.equals("add")) {
                System.out.print("Enter number: ");
                double inputNum = scan.nextDouble();
                add(currentNum, inputNum);
                System.out.println("Currently, num : " + currentNum);

            } else if (word.equals("divide")) {
                System.out.print("Enter number: ");
                double inputNum = scan.nextDouble();
                divide(currentNum, inputNum);
                System.out.println("Currently, num : " + currentNum);

            } else if (word.equals("subtract")) {
                System.out.print("Enter number: ");
                double inputNum = scan.nextDouble();
                subtract(currentNum, inputNum);
                System.out.println("Currently, num : " + currentNum);

            } else if (word.equals("exit")) {
                System.out.println("Currently, num : " + currentNum);
                break;

            } else {
                System.out.println("ERROR");
                System.out.println("Currently, num : " + currentNum);
                break;
            }
        }

    }
}