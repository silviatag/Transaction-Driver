public class BankAccount {
    private double balance;
    public BankAccount()
    {
        balance =0;
    }
    public BankAccount(double b)
    {
        balance=b;
    }
    public double getBalance()
    {
        return balance;
    }
    public void setBalance(double b)
    {
        balance =b;
    }
    public void deposit(double d)
    {
        balance +=d;
    }
    public void withdraw(double d)
    {
        balance -=d;
    }
    public void transferMoney(BankAccount acc, double amount)
    {
        acc.deposit(amount);
        balance -=amount;
    }
    public void display()
    {
        System.out.println(balance);
    }
}
