
public class NumberStatistics {

    private int amountOfNumbers;
    private int sum;

    public NumberStatistics(){
        amountOfNumbers = 0;
        sum = 0;
    }

    public void addNumber(int num){
        amountOfNumbers+=1;
        sum += num;
    }

    public int amountOfNumbers(){
        return amountOfNumbers;
    }

    public int sum(){
        return sum;
    }

    public double average(){
        return(amountOfNumbers()==0)?0.0:(double)sum()/amountOfNumbers();


    }
}
