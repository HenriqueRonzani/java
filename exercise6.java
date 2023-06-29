import java.util.Scanner;
public class exercise6 {
    public static void main(String[] args) {
        String a,b,exchange;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first value ");
        a = scanner.nextLine();
        System.out.println("Write the second value: ");
        b = scanner.nextLine();
        System.out.println("A = "+a+" B = "+b);
        exchange = b;
        b = a;
        a = exchange;
        System.out.println("A = "+a+" B = "+b);
    }
}
