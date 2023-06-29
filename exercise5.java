import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args) {
        double grade1, grade2, grade3, average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the grade of the first test ");
        grade1 = scanner.nextDouble();
        System.out.println("Write the grade of the second test ");
        grade2 = scanner.nextDouble();
        System.out.println("Write the grade of the third test ");
        grade3 = scanner.nextDouble();
        average = (grade1+grade2+grade3)/3;
        System.out.println("The average is: "+average);
    }
}
