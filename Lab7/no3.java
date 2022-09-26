import java.util.Scanner;

public class no3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Row: ");
        int row = scan.nextInt();
        System.out.print("Colume: ");
        int col = scan.nextInt();

        int[][] table = new int[row][col];

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("Enter the value of a[" + i + "][" + j + "]:");
                table[i][j] = scan.nextInt();
            }
        }
        int total = 0;
        for (int i = 0; i < table.length; i++) {
            int sumcol = 0;
            for (int j = 0; j < table[0].length; j++) {
                System.out.print(table[i][j] + " ");
                sumcol = table[i][j] + sumcol;
            }
            System.out.print(" | " + sumcol);
            System.out.println();
        }

        System.out.println("-------------------------");
        for (int j = 0; j < col; j++) {
            int sumrow = 0;
            for (int i = 0; i < row; i++) {
                sumrow = sumrow + table[i][j];
            }
            System.out.print(sumrow + " ");
            total = total + sumrow; 
        }
        System.out.print(" | " + total);

    }
}
