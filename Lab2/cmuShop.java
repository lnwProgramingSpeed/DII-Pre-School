import java.util.Scanner;

public class cmuShop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("His/Her membership status: ");
        String member = scan.nextLine().toUpperCase();
        System.out.print("The money that He/Her spend: ");
        double spend = scan.nextDouble();

        if(member.equals("SILVER")){
            if(spend>0 && spend<=1000){
            spend = spend-spend*.02;
        } else if(spend>1000 && spend<=10000){
            spend = spend-spend*.03;
        } else if(spend>10000){
            spend = spend-spend*.05;
        }
        } else if(member.equals("GOLD")){
            if(spend>0 && spend<=1000){
                spend = spend-spend*.05;
            } else if(spend>1000 && spend<=10000){
                spend = spend-spend*.08;
            } else if(spend>10000){
                spend = spend-spend*.1;
            }
        }

        
        System.out.print(spend);
    }
}
