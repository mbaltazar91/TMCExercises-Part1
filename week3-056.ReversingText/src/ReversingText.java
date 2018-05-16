
import java.util.Scanner;

public class ReversingText {

    public static String reverse(String text) {
        StringBuilder reverse = new StringBuilder();
        for(int i = text.length()-1; i>=0; i--){
            reverse.append(text.charAt(i));
        }
        String reversedText = reverse.toString();
        return reversedText;
    }

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.print("Type in your text: ");
        String text = reader.nextLine();
        System.out.println("In reverse order: " + reverse(text));
    }
}
