import java.util.Scanner;
public class exercise7{
    public static void main(String[] args) {
        Double celsius, fahrenheit;
        Scanner valor = new Scanner(System.in);  
        System.out.print("Write the temperature in Celsius: ");
        celsius = valor.nextDouble();
        fahrenheit = ((9*celsius)+160)/5;
        System.out.println(celsius+" to fahrenheit is: "+fahrenheit);
        
    }
}
