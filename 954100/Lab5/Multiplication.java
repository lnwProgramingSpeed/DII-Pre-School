import java.util.Scanner;

public class Multiplication {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number plz: ");
        int num = scan.nextInt();

        for(int i=1; i<=12; i++){
            System.out.println(num + " * " + i + " = " + num*i);
        }
    }
}
