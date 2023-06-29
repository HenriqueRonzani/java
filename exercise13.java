import java.util.Scanner;
public class exercise13 {
    public static void main(String[] args) {
    Double number;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Write a number ");
    number = scanner.nextDouble();
    if (number>10){
        System.out.println("The written number is bigger than 10");
    } else{
    System.out.println("The written number is equal or smaller than 10");
    }
    }
}
