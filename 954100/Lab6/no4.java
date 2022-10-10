import java.util.Scanner;
public class no4{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[] stuname = new String[5];
        double[] height = new double[5];
        String name = "";
        double tallest = 0;

        for(int i = 0; i<5; i++){
            System.out.print("Name of " + (i+1) + " student: ");
            stuname[i] = scan.next();
            System.out.print("height:");
            height[i] = scan.nextDouble();
            if(height[i] > tallest){
                name = stuname[i];
                tallest = Math.round(height[i]);
            }
        }
        for(int i = 0; i<5; i++){
            System.out.println(stuname[i] + " : " + Math.round(height[i]));
        }
        System.out.println("Tallest student is " + name + " tall " + tallest);
    }
}