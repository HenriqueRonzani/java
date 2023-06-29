import java.util.Scanner;
public class exercise17 {
    public static void main(String[] args) {
        Integer number,amount;
        Scanner scanner = new Scanner(System.in);
        amount = 0;
        for (int i = 1; i<=80; i++ ){
            System.out.print("Writhe the "+i+"th number: ");
            number = scanner.nextInt();
            if(number>=10 && number<=150){
                amount=amount+1;
            }
        }
        System.out.println("The amount of the written numbers that are equal or bigger than and equal or smaller than 150 is: "+amount);
    }
}