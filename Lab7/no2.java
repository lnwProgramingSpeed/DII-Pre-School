import java.util.Scanner;

public class no2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int stu = 0;
        while (stu <= 0) {
            System.out.print("How many student: ");
            stu = scan.nextInt();
        }

        String[][] info = new String[stu][3];
        for (int row = 0; row < stu; row++) {
            System.out.print("Name: ");
            info[row][0] = scan.next();
            System.out.print("Weight: ");
            info[row][1] = scan.next();
            System.out.print("Height: ");
            info[row][2] = scan.next();
        }
        for (int row = 0; row < info.length; row++) {
            for (int col = 0; col < info[0].length; col++) {
                System.out.print(info[row][col] + " ");
            }
            System.out.println();
        }
    }
}
