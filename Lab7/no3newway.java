import java.util.Scanner;

public class no3newway {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Row: ");
        int row = scan.nextInt();
        System.out.print("Colume: ");
        int col = scan.nextInt();

        int[][] table = new int[row][col];
        int[] sumrow = new int[row];
        int[] sumcol = new int[col];
        int total = 0;

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print("Enter the value of a[" + i + "][" + j + "]:");
                table[i][j] = scan.nextInt();
                sumrow[i] = sumrow[i] + table[i][j];
                sumcol[j] = sumcol[j] + table[i][j];
            }

        }

        for (int i = 0; i < table.length; i++) {
            for (int j = 0; j < table[i].length; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.print(" | " + sumrow[i]);
            System.out.println("");
        }
        System.out.println("--------------------");
        for(int i = 0; i <table[0].length; i++){
            System.out.print(sumcol[i] + " ");
            total += sumcol[i];
        }
        System.out.print(" | " + total);

    }
}
