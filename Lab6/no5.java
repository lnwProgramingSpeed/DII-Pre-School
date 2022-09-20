import java.util.Scanner;

public class no5{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1, 5, 9, 11, 12, 13, 14, 15, 19, 22};

        System.out.print("Input number in array: ");
        int num = scan.nextInt();
        arr[9] = num;

        for(int i = 0; i < arr.length; i++){
            int tmp = 0;
            if(arr[9]<arr[i]){
                tmp = arr[i];
                arr[i] = arr[9];
                arr[9] = tmp;
            }
        }
        for(int i = 0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for(int i = arr.length-1; i>=0; i--){
            System.out.print(arr[i] + " ");
        }
    }
}