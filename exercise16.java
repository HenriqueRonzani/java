import java.util.Scanner;
public class exercise16 {
    public static void main(String[] args) {
        Double grade1,grade2,grade3,average;
        String name,result;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write the student's name: ");
        name= scanner.nextLine();
        System.out.print("Write the student's first grade: ");
        grade1 = scanner.nextDouble();
        System.out.print("Write the student's second grade: ");
        grade2 = scanner.nextDouble();
        System.out.print("Write the student's third grade: ");
        grade3 = scanner.nextDouble();

        average = (grade1+grade2+grade3)/3;

        if (average>=7){
            result="aproved";
        } else if(average<=5) {
            result="not aproved";
        } else{
            result="in recovery";
        }
        System.out.print(name+" is "+result+" with an average of "+average);
    }
}
