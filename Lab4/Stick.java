import java.util.Scanner;
public class Stick {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String stick1 = "------";
        String stick2 = "------";
        String stick4 = "------";
        String stick5 = "------";

        System.out.print("Stick onthe table");
        System.out.print("1. " + stick1);
        System.out.print("2. " + stick2);
        System.out.print("3. ------");
        System.out.print("4. " + stick4);
        System.out.print("5. " + stick5);
        while(true){
            System.out.print("The 1 player turn \n Please choose the stick number: ");
            int pick = scan.nextInt();
            
        }
    }
}
