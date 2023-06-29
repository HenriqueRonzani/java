import java.util.Scanner;

public class exercise18 {
    public static void main(String[] args) {
        Integer age;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 75; i++){
            System.out.print("Write the age of the "+i+"th person: ");
            age = scanner.nextInt();
            if (age>=18){
                System.out.println("This person is older than 18 years");
            } else{
                System.out.println("This person is youger than 18 years");
            }
        }
    }
}
