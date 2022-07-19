import java.util.Scanner;
public class cmuRegulation {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("The total numbers of classes: ");
        double classes = scan.nextDouble();
        System.out.print("How many times the student came late: ");
        double late = scan.nextDouble();
        System.out.print("How many times student was absent: ");
        double absent =scan.nextDouble();

        double absent_1 = absent + late/2;

        if(classes-classes*.8 > absent_1){
            System.out.print("Student can take the exam.");
        } else {
            System.out.print("Student can't take the exam.");
        }
        System.out.println("Benkyou shi mashou");
    }
}
