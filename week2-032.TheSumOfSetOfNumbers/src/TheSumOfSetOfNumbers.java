
import java.util.Scanner;

public class TheSumOfSetOfNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Until what? ");
        int lastNum = Integer.parseInt(reader.nextLine());
        int firstNum = 1;
        int sum = 0;
        while(firstNum <= lastNum){
            sum += firstNum;
            firstNum++;
        }
        System.out.println(sum);

    }
}
