import java.util.Scanner;

public class no4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("How many student: ");
        int stu = scan.nextInt();

        double[][] score = new double[stu][5];
        for (int row = 0; row < score.length; row++) {
            System.out.print("Enter the " + (row + 1) + " student Physics score: ");
            score[row][0] = scan.nextDouble();
            System.out.print("Enter the " + (row + 1) + " student Biology score: ");
            score[row][1] = scan.nextDouble();
            System.out.print("Enter the " + (row + 1) + " student Chemistry score: ");
            score[row][2] = scan.nextDouble();

            // Total
            score[row][3] = score[row][0] + score[row][1] + score[row][2];
            score[row][3] = Math.floor(score[row][3]);
            // Average
            score[row][4] = (score[row][0] + score[row][1] + score[row][2]) / 3;
            score[row][4] = Math.floor(score[row][4]);
        }

        // Show all info
        System.out.println("Physics, Biology, Chemistry | Total | Average");
        for (int row = 0; row < score.length; row++) {
            System.out.print("Student " + (row + 1) + " : ");
            for (int col = 0; col < score[row].length; col++) {
                if (col >= 3) {
                    System.out.print(" | ");
                }
                System.out.print(score[row][col] + " ");
            }
            System.out.println("");
        }

        // Average score for each subjects
        System.out.println("---------------------------------");
        System.out.println("Average scores for Physics, Biology, and Chemistry");

        for (int i = 0; i < 3; i++) {
            double average = 0;
            for (int j = 0; j < stu; j++) {
                average = score[j][i] + average;
            }
            average = average / stu;
            System.out.print(String.format("%.1f", average) + " ");
        }

        // Pass or not
        double ave = 0;
        for (int i = 0; i < stu; i++) {
            System.out.print("\nStudent " + (i + 1) + " : ");
            for (int j = 0; j < 3; j++) {
                for (int k = 0; k < stu; k++) {
                    ave = ave + score[k][j];
                }
                ave = ave / stu;
                if (score[i][j] > ave) {
                    System.out.print(" Pass");
                } else {
                    System.out.print(" No");
                }

            }
        }

    }
}
