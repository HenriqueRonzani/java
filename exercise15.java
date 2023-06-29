import java.util.Scanner;
public class exercise15 {
    public static void main(String[] args) {
        Integer number;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Write a integer number: ");
        number = scanner.nextInt();
        if (number>100 && number<200){
            System.out.println(number+" is between 100 and 200");
        } else{
            System.out.println(number+" isnt't between 100 and 200");
        }
    }
}
