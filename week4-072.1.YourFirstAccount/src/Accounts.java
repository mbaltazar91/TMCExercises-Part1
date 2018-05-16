
import java.util.Scanner;

public class Accounts {

    public static void main(String[] args) {
        Account myAccount = new Account("Mitch", 100.00);
        myAccount.deposit(20.00);
        System.out.println(myAccount);
    }

}
