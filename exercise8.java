import java.util.Scanner;
public class exercise8 {
    public static void main(String[] args) {
      Double quotation,dolar,real;
      Scanner scanner = new Scanner(System.in);
      System.out.println("Write the quotation of U$ dolar in BR R$ ");
      quotation = scanner.nextDouble();
      System.out.println("Write the value in dolars ");
      dolar = scanner.nextDouble();
      real = quotation*dolar;
      System.out.println("U$ "+dolar+" are equivalent to R$ "+real);
    }
}
