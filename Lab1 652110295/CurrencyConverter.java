import java.util.Scanner;
public class CurrencyConverter {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Amount of money in Bath currency : ");
        Double Bath = scanner.nextDouble();

        System.out.println("Amount of money in yen is " + Bath*3.79);
    }
}
