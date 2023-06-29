import java.util.Scanner;

public class exercise19 {
    public static void main(String[] args) {
        String name;
        Integer gender,male_amount,female_amount;
        Scanner scanner = new Scanner(System.in);
        male_amount = 0;
        female_amount = 0;

        for (int i=1; i<=56; i++){
            System.out.print("Write the name of the "+(i)+"th person: ");
           name = scanner.nextLine();
          System.out.print("Write the gender of "+name+" | (1 for M/ 2 for F): ");
          gender= scanner.nextInt();
          if (gender==1) {
            male_amount = male_amount+1;
            System.out.println(name+" it's a man");
          } else{
            female_amount = female_amount+1;
            System.out.println(name+" it's a woman");
          }
          scanner.nextLine();
        } 
        System.out.println("Summarized, there are "+male_amount+" men and "+female_amount+" women");
    }
}
