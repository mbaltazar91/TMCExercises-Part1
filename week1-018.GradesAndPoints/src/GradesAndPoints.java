
import java.util.Scanner;

public class GradesAndPoints {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int points = Integer.parseInt(reader.nextLine());
        String grade;


        if(points<=29){
            grade = "failed";
        }
        else if(points<=34){
            grade = "1";
        }
        else if(points<=39){
            grade = "2";
        }
        else if(points<=44){
            grade = "3";
        }
        else if(points<=49){
            grade = "4";
        }
        else{
            grade = "5";
        }

        System.out.println("Grade: " + grade);



    }
}