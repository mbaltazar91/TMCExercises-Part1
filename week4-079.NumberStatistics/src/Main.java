import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        NumberStatistics stats = new NumberStatistics();
        NumberStatistics evens = new NumberStatistics();
        NumberStatistics odds = new NumberStatistics();
        System.out.println("Type numbers: ");
        while(true){
            int num = Integer.parseInt(reader.nextLine());
            if(num==-1){
                break;
            }
            stats.addNumber(num);
            if(num%2==0){
                evens.addNumber(num);
            }
            else{
                odds.addNumber(num);
            }
        }
        System.out.println("sum: " + stats.sum());
        System.out.println("sum of even: " + evens.sum());
        System.out.println("sum of odd: " + odds.sum());
    }
}
