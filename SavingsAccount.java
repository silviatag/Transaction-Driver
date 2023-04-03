public class SavingsAccount extends BankAccount{
private double interestRate;
public SavingsAccount()
{
    interestRate = 0;
}
public SavingsAccount(double i)
{
    interestRate = i;
}
public SavingsAccount(double i, double b)
{
    interestRate = i;
    setBalance(b);
}
public double addCompoundInterest()
{
    double i= (getBalance()*interestRate)/100;
    deposit(i);
    return i;
}

}
