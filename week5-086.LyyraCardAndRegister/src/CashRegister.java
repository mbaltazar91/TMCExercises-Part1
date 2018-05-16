
public class CashRegister {

    private double cashInRegister;
    private int economicalSold;
    private int gourmetSold;

    public CashRegister() {
        cashInRegister = 1000;
        economicalSold = 0;
        gourmetSold = 0;
    }

    public double payEconomical(double cashGiven) {
        if(cashGiven>=2.50){
            cashInRegister+=2.50;
            economicalSold+=1;
            return(cashGiven-2.50);
        }
        return cashGiven;
    }

    public double payGourmet(double cashGiven) {
        if(cashGiven>=4.00){
            cashInRegister+=4.00;
            gourmetSold+=1;
            return(cashGiven-4.00);
        }
        return cashGiven;
    }

    public boolean payEconomical(LyyraCard card){
        if(card.balance()>=2.50){
            card.pay(2.50);
            economicalSold++;
            return true;
        }
        return false;
    }

    public boolean payGourmet(LyyraCard card){
        if(card.balance()>=4.00){
            card.pay(4.00);
            gourmetSold++;
            return true;
        }
        return false;
    }

    public void loadMoneyToCard(LyyraCard card, double sum){
        if(sum>=0){
            card.loadMoney(sum);
            cashInRegister+=sum;
        }
    }



    public String toString() {
        return "money in register " + cashInRegister + " economical lunches sold: " + economicalSold + " gourmet lunches sold: " + gourmetSold;
    }
}
