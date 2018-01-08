
import java.util.Scanner;

public class Password {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        String password = "carrot";
        String secret = "Correct password!";

        while(true) {
            System.out.println("Type the password: ");
            String input = reader.nextLine();
            if (!input.equals(password)) {
                System.out.println("Wrong!");

            }
            else{
                System.out.println("Right!");
                System.out.println("The secret is: " + secret);
                break;
            }
        }






    }
}




