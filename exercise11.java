import java.util.Scanner;
public class exercise11 {
    public static void main(String[] args) {
        Double cost_price,addition,selling_price;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the cost price: R$ "); 
        cost_price = scanner.nextDouble();
        System.out.print("Write the addition (%) to the price: ");
        addition = scanner.nextDouble();
        selling_price = cost_price+(addition/100*cost_price);
        System.out.println("The selling price will be: "+ selling_price);   
    }
}
