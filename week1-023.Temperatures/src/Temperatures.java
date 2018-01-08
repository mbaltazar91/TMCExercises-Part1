
import java.util.Scanner;

public class Temperatures {

    public static void main(String[] args) {

        Scanner reader = new Scanner(System.in);
        while (true) {
            System.out.println("Enter a number: ");
            double num = Double.parseDouble(reader.nextLine());
            if (num >= -30.0 && num <= 40.0) {
                Graph.addNumber(num);
            }
        }
    }
}

