
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public String toString() {
        return this.day + "." + this.month + "." + this.year;
    }

    public boolean earlier(MyDate compared) {
        if (this.year < compared.year) {
            return true;
        }

        if (this.year == compared.year && this.month < compared.month) {
            return true;
        }

        if (this.year == compared.year && this.month == compared.month
                && this.day < compared.day) {
            return true;
        }

        return false;
    }

    public void advance(){
        day++;
        if(day>30){
            day = 1;
            month++;
        }
        if(month>12){
            month = 1;
            year++;
        }

    }

    public void advance(int numberOfDays){
        for(int i = 0; i<numberOfDays; i++){
            advance();
        }
    }

    public MyDate afterNumberOfDays(int numberOfDays) {
        MyDate date = new MyDate(this.day,this.month,this.year);
        date.advance(numberOfDays);
        return date;

    }

}
