import java.util.Scanner;
public class exercise1 {
    public static void main(String[] args) {

        Integer num1,num2,num3;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the first number ");
        num1 = scanner.nextInt();
        System.out.println("Write the second number ");
        num2 = scanner.nextInt(); 
        num3 = num1+num2;
        System.out.println("The sum of the numbers is : "+num3);

    }

}
