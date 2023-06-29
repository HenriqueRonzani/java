import java.util.Scanner;
public class exercise10 {
    public static void main(String[] args) {
        Double total_value,installment;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the price of the product ");
        total_value = scanner.nextDouble();
        installment = total_value/5;
        System.out.println("Divided in 5 installments, the price of each of them is equal to: $s"+installment);
    }
}
