import java.util.Scanner;

public class TomGPA {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double Mgrade=0,Sgrade=0;

        System.out.print("Math credits: ");
        double Math = scan.nextDouble();
        System.out.print("Social credits: ");
        double Social = scan.nextDouble();

        System.out.print("Tom's math grade: ");
        String MathGrade = scan.next();

        switch(MathGrade){
            case "A":
                Mgrade = 4;
                break;
            case "B":
                Mgrade = 3;
                break;
            case "C":
                Mgrade = 2;
                break;
            case "D":
                Mgrade = 1;
                break;
            case "F":
                Mgrade = 0;
                break;

        }

        System.out.print("Tom's social grade: " );
        String SocGrade = scan.next();

        switch(SocGrade){
            case "A":
                Sgrade = 4;
                break;
            case "B":
                Sgrade = 3;
                break;
            case "C":
                Sgrade = 2;
                break;
            case "D":
                Sgrade = 1;
                break;
            case "F":
                Sgrade = 0;
                break;

        }

        double GPA = ((Mgrade*Math)+(Sgrade*Social))/(Math+Social);

        System.out.print("Tom's GPA is " + GPA);
    }
}
