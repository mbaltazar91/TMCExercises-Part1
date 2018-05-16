import java.util.ArrayList;
import java.util.Random;

public class LotteryNumbers {
    private ArrayList<Integer> numbers;

    public LotteryNumbers() {
        this.drawNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void drawNumbers() {
        Random random = new Random();
        this.numbers = new ArrayList<Integer>();
        while(numbers.size()<7){
            int num = random.nextInt(39)+1;
            if(!containsNumber(num)){
                numbers.add(num);
            }
        }
    }

    public boolean containsNumber(int number) {
        return numbers.contains(number);
    }
}
