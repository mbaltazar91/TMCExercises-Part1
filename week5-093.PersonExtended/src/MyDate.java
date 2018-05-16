
public class MyDate {

    private int day;
    private int month;
    private int year;

    public MyDate(int pv, int kk, int vv) {
        this.day = pv;
        this.month = kk;
        this.year = vv;
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

    /*
     * In assignment 92 method differneceInYears was added to MyDate 
     * Copy the method here since it eases this assignment considerably.
     */
    public int differenceInYears(MyDate compared) {
        int years = 0;

        if (!earlier(compared)) {
            if (this.month < compared.month) {
                years += 1;
            } else if(this.day < compared.day&&this.month==compared.month) {
                years += 1;
            }
            return this.year - compared.year - years;
        }

        else{
            if (compared.month < this.month) {
                years += 1;
            }
            else if (compared.day < this.day&&this.month==compared.month) {
                years += 1;
            }
            return compared.year - this.year - years;
        }

    }

  
}
