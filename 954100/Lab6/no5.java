import java.util.Scanner;

public class no5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = { 1, 5, 9, 11, 12, 13, 14, 15, 19, 22 };

        System.out.print("Input number into Array: ");
        int num = scan.nextInt();
        arr[9] = num;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] > arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
        System.out.println("");
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int tmp = 0;
                if (arr[i] < arr[j]) {
                    tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
            System.out.print(arr[i] + " ");
        }
    }
}
