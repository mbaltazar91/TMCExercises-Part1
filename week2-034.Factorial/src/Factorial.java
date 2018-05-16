import java.util.Scanner;

public class Factorial {

    public static int fact(int num){
        int fact = 1;
        if(num>=1){
            fact *= num * fact(num-1);
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type a number: ");
        int num = Integer.parseInt(reader.nextLine());
        System.out.println("Factorial is " + fact(num));

    }
}
