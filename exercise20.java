import java.util.Scanner;
public class exercise20 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Integer int_num;
        System.out.println("Write an integer number");
        int_num = scanner.nextInt();
        
        for (int i = 0; i <=10 ; i++) {
            System.out.println(int_num + " x " + i + " = " + int_num*i);
        }
        
    }
}
