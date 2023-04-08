package BankAccount;

public class Account {
    private static long accountNumbers;
    private static long number;
    private long balance;
    public Account() {
        accountNumbers++;
        number = accountNumbers;
        balance = 0;
    }
    public boolean reduceBalance(long cash){
        if(cash > 0 && balance > cash) {
            balance -= cash;
            return true;
        }
        return false;
    }

    public boolean increaseBalance(long cash){
        if(cash > 0) {
            this.balance += cash;
            return true;
        }
        return false;
    }

    public long getAccountNumber(){
        return number;
    }

    public long getAccountBalance(){
        return balance;
    }

    public static void main(String[] args) {
        Account accountMike = new Account();
        Account accountJoe = new Account();

        accountMike.increaseBalance(10000);
        accountJoe.reduceBalance(500);
        System.out.println(accountMike.getAccountBalance());
        System.out.println(accountJoe.getAccountBalance());
    }

}
