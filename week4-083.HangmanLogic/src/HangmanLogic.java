
public class HangmanLogic {

    private String word;
    private String guessedLetters;
    private int numberOfFaults;

    public HangmanLogic(String word) {
        this.word = word.toUpperCase();
        this.guessedLetters = "";
        this.numberOfFaults = 0;
    }

    public int numberOfFaults() {
        return this.numberOfFaults;
    }

    public String guessedLetters() {
        return this.guessedLetters;
    }

    public int losingFaultAmount() {
        return 12;
    }

    public void guessLetter(String letter) {
        if(!guessedLetters.contains(letter)){
            guessedLetters += letter;
            if(!word.contains(letter)){
                numberOfFaults++;
            }
        }

    }

    public String hiddenWord() {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i<word.length(); i++){
            if(guessedLetters.contains("" + word.charAt(i))){
                str.append(word.charAt(i));
            }
            else{
                str.append("_");
            }
        }
        return str.toString();
    }
}
