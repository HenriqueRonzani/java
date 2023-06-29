
import java.util.Scanner;
public class exercise12 {
    public static void main(String[] args) {
        Double factory_price,selling_price;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the manufacture price: R$ ");
        factory_price = scanner.nextDouble();
        selling_price = (factory_price*1.45) * 1.28;
        System.out.println("The selling price will be: R$ "+selling_price);
    }
}
