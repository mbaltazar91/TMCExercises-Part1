
import java.util.Random;
import java.util.Scanner;

public class GuessingNumberGame {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        int numberDrawn = drawNumber();
        int count = 0;
        while(true){
            System.out.println("Guess a number: ");
            int numGuess = Integer.parseInt(reader.nextLine());
            if(numGuess==numberDrawn){
                break;
            }
            count++;
            if(numGuess<numberDrawn){
                System.out.println("The number is greater, guesses made: " + count);

            }
            else if(numGuess>numberDrawn){
                System.out.println("The number is lesser, guesses made: " + count);

            }


        }
        System.out.println("Congratulations, your guess is correct!");
    }


    private static int drawNumber() {

        return new Random().nextInt(101);
    }
}
