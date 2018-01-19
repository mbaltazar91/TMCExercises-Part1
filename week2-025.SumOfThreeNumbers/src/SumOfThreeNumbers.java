
import java.util.Scanner;

public class SumOfThreeNumbers {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int sum = 0;
        for(int i = 0; i<3; i++) {
            int read = Integer.parseInt(reader.nextLine());
            sum += read;
        }

        System.out.println("Sum: " + sum);
    }
}
