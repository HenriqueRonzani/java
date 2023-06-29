import java.util.Scanner;
public class exercise4 {
    public static void main(String[] args) {
        String name;
        Double salary,sales,comission;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the salesman name ");
        name = scanner.nextLine(); 
        System.out.println("Write the number of sales ");
        sales = scanner.nextDouble(); 
        System.out.println("Write the salary of "+name+" ");
        salary = scanner.nextDouble();
        comission = sales * 0.15;
        System.out.println("The salesman "+name+", with the salary of "+salary+" had $"+comission+" as comission having a total wage of $"+(salary+comission));
    }
    
}
