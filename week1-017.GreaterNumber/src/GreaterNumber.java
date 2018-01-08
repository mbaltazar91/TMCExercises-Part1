import java.util.Scanner;
import java.lang.Math;

public class GreaterNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num1 = Integer.parseInt(reader.nextLine());
        int num2 = Integer.parseInt(reader.nextLine());

        System.out.println((num1==num2)?"The numbers are equal!" : "Greater number: " + Math.max(num1,num2));


    }
}
