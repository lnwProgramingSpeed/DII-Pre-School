import java.util.Scanner;

public class Q3 {
    /*************************************
     * oddOrEven accepts one integer.
     * Method will return EVEN if integer devided by 2 get 0
     * otherwise return ODD.
     */
    public static void oddOrEven(int num){
        if(num%2==0){
            System.out.print("EVEN");
        } else {
            System.out.print("ODD");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("input the number: ");
        int num = scan.nextInt();

        oddOrEven(num);
    }
}
