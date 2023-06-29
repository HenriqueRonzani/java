import java.util.Scanner;
public class exercise3 {
    public static void main(String[] args) {
        Double distance,fuel;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the traveled distance ");
        distance = scanner.nextDouble();
        System.out.println("Write the consumed fuel "); 
        fuel = scanner.nextDouble();
        System.out.print("The consumption per kilometer is : "+(fuel/distance));   
    }
    
}
