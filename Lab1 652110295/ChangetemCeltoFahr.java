import java.util.Scanner;
public class ChangetemCeltoFahr {

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Temperature in celsius : ");
        double celsius = scanner.nextDouble();
        double fahrenheit = (9.0/5.0)*celsius + 32;

        System.out.println("The temperature in Fahrenheit for Celsius value -5 is  " + fahrenheit);
    }
}
