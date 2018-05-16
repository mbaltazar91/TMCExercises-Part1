public class Counter {
    private int value;
    private boolean check;

    public Counter(int startingValue, boolean check){
        value = startingValue;
        this.check = check;
    }
    public Counter(int startingValue){
        value = startingValue;
        check = false;
    }
    public Counter(boolean check){
        value = 0;
        this.check = check;
    }
    public Counter(){
        value = 0;
        check = false;
    }

    public int value(){
        return value;
    }
    public void increase(){
        value++;
    }
    public void decrease(){

        value--;
        if(check&&value<0){
            value = 0;
        }

    }
    public void increase(int increaseAmount){
        if(increaseAmount>=0){
            value += increaseAmount;
        }
    }
    public void decrease (int decreaseAmount){
        if(decreaseAmount>=0){
            value -= decreaseAmount;
            }
        if(check&&value<0){
            value = 0;
        }
    }
}



