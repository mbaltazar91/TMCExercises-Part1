public class LyyraCard {

    private double balance;

    public LyyraCard(double balance){
        this.balance = balance;
    }
    @Override
    public String toString(){
        String printCard = String.format("The card has %.1f euros",balance);
        return printCard;
    }

    public void payEconomical() {
        if (balance >= 2.50) {
            balance -= 2.50;
        }
    }

    public void payGourmet() {
        if (balance >= 4.00) {
            balance -= 4.00;
        }
    }

    public void loadMoney(double amount){
        if(amount>=0){
            balance+=amount;
        }
        if(balance>150.00){
            balance = 150.00;
        }
    }
}
