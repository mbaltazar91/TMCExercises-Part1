
import java.util.Scanner;

public class LeapYear {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int year = Integer.parseInt(reader.nextLine());

        System.out.println((year%4==0 && (!(year%100==0) || year%400==0))?"The year is a leap year": "The year is not a leap year.");



    }
}
