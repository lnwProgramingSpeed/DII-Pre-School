import java.util.Scanner;

public class no6 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int index = 0;

        while (index <= 5) {
            System.out.print("How many array index: ");
            index = scan.nextInt();
            if (index <= 5) {
                System.out.println("More than 5 please.");
            }
        }
        int[] arr = new int[index];

        for (int i = 0; i < arr.length; i++) {
            System.out.println((i + 1) + " index would be: ");
            arr[i] = scan.nextInt();
        }

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
