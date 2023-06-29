import java.util.Scanner;
public class exercise14 {
    public static void main(String[] args) {
        Integer number1, number2;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write the first integer number: ");
        number1 = scanner.nextInt();
        System.out.print("Write the second integer number: ");
        number2 = scanner.nextInt();
        if (number1>number2){
            System.out.println(number1+" is bigger");
        } else if (number2>number1){
            System.out.println(number2+" is bigger");
        } else{
            System.out.println("Both numbers are equal");
        }
    }
}
