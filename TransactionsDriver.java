public class TransactionsDriver {
    public static void main(String[] args) {
        SavingsAccount dadsSavings = new SavingsAccount(0.3);
        CheckingAccount kidsChecking = new CheckingAccount();
        dadsSavings.deposit(10000);
        System.out.println("dads balance  "+dadsSavings.getBalance());
        dadsSavings.transferMoney(kidsChecking,3000);

        System.out.println("dads balance  "+dadsSavings.getBalance());
        System.out.println("kids balance  "+kidsChecking.getBalance());
        kidsChecking.withdraw(200);
        kidsChecking.withdraw(400);
        kidsChecking.withdraw(300);
        kidsChecking.withdraw(500);
        kidsChecking.withdraw(400);
        System.out.println("kids balance    "+kidsChecking.getBalance());

        System.out.println("interest for dads savings account "+dadsSavings.addCompoundInterest());
        System.out.println("dads balance after added interest "+dadsSavings.getBalance());
        System.out.println("transactions fees for kids checking account "+kidsChecking.chargeFees());
        System.out.println("kids balance after removing transactions fees "+kidsChecking.getBalance());

    }
}
