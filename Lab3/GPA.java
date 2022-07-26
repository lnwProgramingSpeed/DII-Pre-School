import java.util.Scanner;

public class GPA {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double sumGrade = 0;
        double allCredits = 0;
        while (true) {
            System.out.print("Your grade: ");
            double Grade = input.nextDouble();
            System.out.print("Your credit: ");
            double Credit = input.nextDouble();
            double b = Grade * Credit;
            allCredits = allCredits + Credit;
            sumGrade = sumGrade + b;

            System.out.print("Enter Z to end program or A to continued: ");
            String Z = input.next();
            if(Z.equals("Z")){
                break;
            }
        }
        double finalGrade = sumGrade/allCredits;
        System.out.println("You got " + finalGrade);

    }
}
