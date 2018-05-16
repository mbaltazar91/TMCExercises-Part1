public class DecreasingCounter {
    private int value;
    private int valueAtStart;

    public DecreasingCounter(int valueAtStart) {
        value = valueAtStart;
        this.valueAtStart = valueAtStart;
    }

    public void printValue() {

        System.out.println("value: " + value);
    }

    public void decrease() {
        value-=(value>0)?1:0;
    }

    public void reset(){
        value = 0;
    }

    public void setInitial(){
        value = valueAtStart;
    }
}
