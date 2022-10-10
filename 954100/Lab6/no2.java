import java.util.Scanner;
public class no2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] myarr = new double[10];
        boolean check = true;

        for(int i = 0; i<=9; i++){
            System.out.print("Input "+(i+1)+" number in array: ");
            myarr[i] = scan.nextDouble();
        }

        System.out.print("Enter number: ");
        double guest = scan.nextDouble();

        for(int j = 0; j<=9; j++){
            if(guest==myarr[j]){
                check = !check;
                break;
            }
        }
        if(check==false){
            System.out.print("Your number are in Array.");
        } else {
            System.out.print("None of your number are in Array.");
        }
        
    }
}
