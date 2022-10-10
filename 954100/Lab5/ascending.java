import java.util.Scanner;
public class ascending {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Number 1: ");
        int num1 = scan.nextInt();
        System.out.print("Number 2: ");
        int num2 = scan.nextInt();
        System.out.print("Number 3: ");
        int num3 =scan.nextInt();

        int sorted = 0;

        for(int i = 0; sorted < 3; i++){
            int NumeberSorted = 0;
            if(i == num1 || i == num2 || i == num3){
                sorted++;
                NumeberSorted++;
            }
            for(int j = 0; j<NumeberSorted; j++){
                System.out.print(i + " ");
            }
        }
    }
}
