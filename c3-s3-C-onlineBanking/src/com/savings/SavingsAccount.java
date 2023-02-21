package com.savings;

public class SavingsAccount {

    //private String accountName;

    private String accountStatus;
    private double accountBalance;
    private boolean onlineBanking;
    private double intrestRate;
    private String modeOfOperation;
    private double debit_amt;
    private double credit_amt;

    static final String ACCOUNT_NAME="Sai Pranay Reddy";
    static final long ACCOUNT_NUMBER=344343442;
    static final String ACCOUNT_OPENING_DATE="17/9/21";


    public double getDebit_amt() {
        return debit_amt;
    }

    public void setDebit_amt(double debit_amt) {
        this.debit_amt = debit_amt;
    }

    public double getCredit_amt() {
        return credit_amt;
    }

    public void setCredit_amt(double credit_amt) {
        this.credit_amt = credit_amt;
    }

    public String getAccountStatus() {
        return accountStatus;
    }

    public void setAccountStatus(String accountStatus) {
        this.accountStatus = accountStatus;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public void setAccountBalance(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public boolean isOnlineBanking() {
        return onlineBanking;
    }

    public void setOnlineBanking(boolean onlineBanking) {
        this.onlineBanking = onlineBanking;
    }

    public double getIntrestRate() {
        return intrestRate;
    }

    public void setIntrestRate(double intrestRate) {
        this.intrestRate = intrestRate;
    }

    public String getModeOfOperation() {
        return modeOfOperation;
    }

    public void setModeOfOperation(String modeOfOperation) {
        this.modeOfOperation = modeOfOperation;
    }
    public double debit()
    {
        if(getDebit_amt()<=getAccountBalance()&&getAccountStatus().equals("active")&&getDebit_amt()>0)
        {
        return getAccountBalance()-getDebit_amt();
        //return getAccountBalance();

    }
        else {
            return getAccountBalance();
        }
        }
    public double credit()
    {
        if(getCredit_amt()>0&&getAccountStatus().equals("active"))
        {
            return getAccountBalance()+getCredit_amt();
            //return getAccountBalance();

        }
        else
        {
            return getAccountBalance();
        }

    }
    public double retrive()
    {
        return getAccountBalance();
    }
    public void display()
    {
        System.out.println("Account Number : "+ACCOUNT_NUMBER);
        System.out.println("Account Name : "+ACCOUNT_NAME);
        System.out.println("Account Opening Date : "+ACCOUNT_OPENING_DATE );
        System.out.println("Account Status : "+getAccountStatus());
        System.out.println("Online Banking : "+isOnlineBanking());
        System.out.println("Mode Of Operation : "+getModeOfOperation());
        System.out.println("Rate of Intrest : "+getIntrestRate());

    }
}
