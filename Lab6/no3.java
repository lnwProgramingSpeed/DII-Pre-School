import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] myarr = new double[15];

        for(int i = 0; i<=14; i++){
            System.out.print("Input "+(i+1)+" number in array: ");
            myarr[i] = scan.nextDouble();
        }

        System.out.print("Which index of array you want to change: ");
        int index = scan.nextInt();
        System.out.print("What number you want to change it into: ");
        int num = scan.nextInt();
        myarr[index] = num;

        for(int i = 0; i<=14; i++){
            System.out.print(myarr[i] + " ");
        }
        System.out.print("\n");
        for(int i = 14; i>=0; i--){
            System.out.print(myarr[i] + " ");
        }
    }
}
