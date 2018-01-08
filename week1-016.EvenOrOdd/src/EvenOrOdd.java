
import java.util.Scanner;

public class EvenOrOdd {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());

        String even = "Number " + num + " is even.";
        String odd = "Number " + num + " is odd.";

        System.out.println((num%2==0)?even:odd);

    }
}
