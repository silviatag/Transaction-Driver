public class CheckingAccount extends BankAccount{
    private final int ALLOWED_TRANS=2;
    private final int TRANS_FEE = 3;
    private int transactionCount;
    public CheckingAccount()
    {
        super();
        transactionCount=0;
    }
    public CheckingAccount(double b)
    {
        super();
        transactionCount=0;
    }
    @Override
    public void deposit(double d)
    {
        super.deposit(d);
        transactionCount++;
    }
    @Override
    public void withdraw(double d)
    {
        super.withdraw(d);
        transactionCount++;
    }
    public double chargeFees()
    {
        if(transactionCount>ALLOWED_TRANS)
        {
            setBalance(getBalance()-(TRANS_FEE*(transactionCount-2)));
            return TRANS_FEE*(transactionCount-2);
        }
        return 0;
    }
}
