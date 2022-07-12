import java.util.Scanner;
public class CircleRadius{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius of circle : ");
        double radius = scanner.nextDouble();

        double area = 3.1416 *radius * radius; 
        double circumference = 2*3.1416 * radius; 
        System.out.println("The area of this circle is " + area); 
        System.out.println("The circumference is " + circumference);
    }
}