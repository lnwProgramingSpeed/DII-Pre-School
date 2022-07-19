import java.util.Scanner;

public class Driving {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("what is your age ?");
        System.out.print("Answer ");
        int age = scan.nextInt();
        if (age < 18) {
            System.out.println("You are not allowed to apply for a driving license");
        } else {
            System.out.println("You are an adult. What is your name ?");
            System.out.print("My name is ");
            String name = scan.next();
            System.out.println("That's is a very good name :), " + name);
        }
        System.out.println("The end of the program");
    }
}
