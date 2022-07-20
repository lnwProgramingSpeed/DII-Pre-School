import java.util.Scanner;

public class TomGPA {

    public static double GradeChange(String Grade) {
        double GradePoint = 0;
        switch (Grade) {
            case "A":
            GradePoint = 4;
                break;
            case "B":
            GradePoint = 3;
                break;
            case "C":
            GradePoint = 2;
                break;
            case "D":
            GradePoint = 1;
                break;
            case "F":
            GradePoint = 0;
                break;

        }
        return GradePoint;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Mgrade = 0, Sgrade = 0;

        System.out.print("Math credits: ");
        double Math = scan.nextDouble();
        System.out.print("Social credits: ");
        double Social = scan.nextDouble();

        System.out.print("Tom's math grade: ");
        String MathGrade = scan.next();
        Mgrade = GradeChange(MathGrade);

        System.out.print("Tom's social grade: ");
        String SocGrade = scan.next();
        Sgrade = GradeChange(SocGrade);

        double GPA = ((Mgrade * Math) + (Sgrade * Social)) / (Math + Social);

        System.out.print("Tom's GPA is " + GPA);
    }
}
