import java.util.Scanner;
public class exercise5 {
    public static void main(String[] args) {
        double score1, score2, score3, average;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write the score of the first test ");
        score1 = scanner.nextDouble();
        System.out.println("Write the score of the second test ");
        score2 = scanner.nextDouble();
        System.out.println("Write the score of the third test ");
        score3 = scanner.nextDouble();
        average = (score1+score2+score3)/3;
        System.out.println("The average is: "+average);
    }
}
