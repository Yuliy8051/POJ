public class Account {
    private String accountName;
    private double balance;

    public Account(String accountName, double initialBalance) throws Exception{
        checkAccount(accountName, initialBalance);
        this.accountName = accountName;
        this.balance = initialBalance;
    }

    public int withdraw(int amount) throws InsufficientFundsException{
        balance-=amount;
        if (balance < 0)
            throw new InsufficientFundsException("You want to withdraw more than you have");
        return amount;
    }

    public double getBalance() {
        return balance;
    }

    public void checkAccount(String accountName, double initialBalance) throws Exception{
        if (accountName == null)
            throw new Exception("Account name is not set");
        if (initialBalance < 0)
            throw new Exception("You entered a negative number");
    }
}