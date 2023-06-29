import java.util.Scanner;
public class exercise9 {
    public static void main(String[] args) {
        Double deposit,fee_income;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the deposited value ");
        deposit = scanner.nextDouble();
        //simple taxes
        fee_income = deposit*0.007;
        System.out.println("The total ammount, after the fee income is equal to: $"+ (deposit+fee_income));
    }
}
