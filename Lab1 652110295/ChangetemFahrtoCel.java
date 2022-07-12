import java.util.Scanner;
public class ChangetemFahrtoCel {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature in fahrenheit : ");
        double fahrenheit = scanner.nextDouble();
        double celsius = (5.0/9.0)*(fahrenheit - 32);

        System.out.println("Temperature in celsius " + celsius);
    }
}
