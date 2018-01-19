
import java.util.Scanner;


public class UpToCertainNumber {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int num = Integer.parseInt(reader.nextLine());
        
        int num2 = 1;
        while(num2 <= num){
            System.out.println(num2);
            num2++;
        }
        
    }
}
