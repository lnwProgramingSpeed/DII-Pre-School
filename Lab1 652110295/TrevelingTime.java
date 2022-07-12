import java.util.Scanner;
public class TrevelingTime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter distance between 2 city : ");
        Double distance = scanner.nextDouble();
        System.out.print("Enter speed that you used : ");
        Double velocity = scanner.nextDouble();
        /* Didnt finish
        System.out.print("How many time do you rest : ");
        int Rest = scanner.nextInt();*/

        Double Time = velocity/distance;
        System.out.println("traveling time from a city to another city is " + Time + " Hours or " + Time*60 + " mins.");
    }
}
