
import java.util.Scanner;

public class PositiveValue {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        String positive = "The number is positive.";
        String notPositive = "The number is not positive.";

        System.out.println((num>0)?positive:notPositive);



    }
}
