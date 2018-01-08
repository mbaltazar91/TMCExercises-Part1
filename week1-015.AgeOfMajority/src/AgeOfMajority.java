
import java.util.Scanner;

public class AgeOfMajority {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);

        System.out.println("How old are you? ");
        int age = Integer.parseInt(reader.nextLine());

        String notMajority = "You have not reached the age of majority yet!";
        String majority = "You have reached the age of majority!";

        System.out.println((age<18)?notMajority:majority);
    }
}
