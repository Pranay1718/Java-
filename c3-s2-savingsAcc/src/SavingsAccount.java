public class SavingsAccount {
    String accountNumber;
    String accountName;
    String accountType;
    double accountBalance;

    String accountStatus;
    double withdraw_amt;
    double deposit_amt;
    double tranfer_amt;
    int accpin;



    public SavingsAccount(String accountNumber,String accountName,String accountType,double accountBalance,String accountStatus,double withdraw_amt,double deposit_amt,double tranfer_amt,int accpin)
    {
        this.accountNumber=accountNumber;
        this.accountName=accountName;
        this.accountType=accountType;
        this.accountBalance=accountBalance;
        this.accountStatus=accountStatus;
        this.withdraw_amt=withdraw_amt;
        this.deposit_amt=deposit_amt;
        this.tranfer_amt=tranfer_amt;
        this.accpin=accpin;

    }
    public double debitCash()
    {

        if(withdraw_amt>0&&withdraw_amt<=accountBalance&&accpin==1234&&accountStatus.equals("active"))
        {
            accountBalance = accountBalance-withdraw_amt;
            System.out.println("Your remaining Balance is"+accountBalance);
        }
        else
            System.out.println("insufficient Balance or incorrect pin or Inactive Account");

        return accountBalance;
    }
    public double creditCash()
    {
        if(deposit_amt>0&&deposit_amt<=accountBalance&&accpin==1234&&accountStatus.equals("active"))
        {
            accountBalance = accountBalance+deposit_amt;
            System.out.println("Your deposited amount is "+deposit_amt+"and your remaining Balance is"+accountBalance);
        }
        else
            System.out.println("insufficient Balance or incorrect pin or Inactive Account ");

        return accountBalance;
    }
    public double retriveBalance()
    {

        return accountBalance;
    }
    public void displayBalance()
    {
        System.out.println("Account Number : "+accountNumber);
        System.out.println("Account Name : "+accountName);
        System.out.println("Account Type : "+accountType);
        System.out.println("Account Balance : "+accountBalance);
        System.out.println("Account Status : "+accountStatus);

    }
}
