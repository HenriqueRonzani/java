
import java.util.Scanner;
public class exercise2 {
    public static void main(String[] args) {

        double num1,num2;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Write the first number ");
        num1 = scanner.nextDouble();
        System.out.println("Write the second number ");
        num2 = scanner.nextDouble();
        
        System.out.println("Sub: "+ (num1+num2));
        System.out.println("Subtraction: "+ (num1-num2));
        System.out.println("Multiplication: "+ (num1*num2));
        
        if(num2==0){
            System.out.println("Cannot divide by 0");
        }
        else{
        System.out.println("Division: "+ (num1/num2));
        }
    }

}
