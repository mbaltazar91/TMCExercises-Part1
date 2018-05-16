
import java.util.Scanner;

public class WordInsideWord {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("Type the first word: ");
        String first = reader.nextLine();
        System.out.println("Type the second word: ");
        String second = reader.nextLine();

        if(first.indexOf(second)!=-1){
            System.out.printf("The word '%s' is found in the word '%s'.\n",second,first);
        }
        else{
            System.out.printf("The word '%s' is not found in the word '%s'.\n",second,first);
        }
    }
}
