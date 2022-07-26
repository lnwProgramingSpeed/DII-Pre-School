import java.util.Scanner;
public class Number {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        double summation = 0;
        System.out.print("How many number you want to input: ");
        int userWant = input.nextInt();
        while(count<userWant){
            System.out.print("Your number: ");
            double userNum = input.nextDouble();
            if(userNum%2==0){
                System.out.println("Even Number");
            } else {
                System.out.println("Odd Number");
            }
            summation = summation + userNum;
            count++;
        }
        System.out.println("Summation of number " + summation);
        summation = summation/userWant;
        System.out.println("Average of these number " + summation);
    }
}
