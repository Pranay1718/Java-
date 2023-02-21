package com.savings;

public class BankAccount {

    private long accountNumber;
    private String dateOfOpening;
    private String accountStatus;
    private double accountBalance;
    private double withdraw_amt;
    private double deposit_amt;

    public double getWithdraw_amt() {
        return withdraw_amt;
    }

    public void setWithdraw_amt(double withdraw_amt) {
        this.withdraw_amt = withdraw_amt;
    }

    public double getDeposit_amt() {
        return deposit_amt;
    }

    public void setDeposit_amt(double deposit_amt) {
        this.deposit_amt = deposit_amt;
    }

    public long getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(long accountNumber) {
        this.accountNumber = accountNumber;
    }

    public String getDateOfOpening() {
        return dateOfOpening;
    }

    public void setDateOfOpening(String dateOfOpening) {
        this.dateOfOpening = dateOfOpening;
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



    public BankAccount(long accountNumber,String dateOfOpening,String accountStatus,double accountBalance)
    {
        this.accountNumber=accountNumber;
        this.dateOfOpening=dateOfOpening;
        this.accountStatus=accountStatus;
        this.accountBalance=accountBalance;
    }

    public double debit()
    {
        if(getAccountStatus().equals("active")&&getAccountBalance()>0)
        {
            getAccountBalance() = getAccountBalance() - getWithdraw_amt();
            return getAccountBalance()
        }
        else
            return getAccountBalance();
    }
    public double credit()
    {
        if (getAccountStatus().equals("active"))
        {
            getAccountBalance() = getAccountBalance() - getDeposit_amt();
            return getAccountBalance();
        }
        else
        {
            return getAccountBalance();
        }
    }

}
