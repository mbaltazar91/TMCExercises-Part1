
public class Accounts {

    public static void main(String[] args) {
        Account mattsAcount = new Account("Matt's account",1000.0);
        Account myAccount = new Account("My account",0);
        mattsAcount.withdrawal(100.0);
        myAccount.deposit(100.0);
        System.out.println(mattsAcount);
        System.out.println(myAccount);
    }

}
