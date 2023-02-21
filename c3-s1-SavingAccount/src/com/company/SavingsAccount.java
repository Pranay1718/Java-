package com.company;

import java.util.Scanner;

class SavingsAccount {
    long accNumber;
    String accName;
    double accBalance;
    String accStatus;
    int age;
    int accpin;
    double withdraw_amt;
    double deposit_amt;
    double transfer_amt;


    public void input()
    {

    }
    public void debitCash()
    {

        if(withdraw_amt<=accBalance&&accpin==1234&&accStatus=="active")
        {
            accBalance=accBalance-withdraw_amt;
            System.out.println("Your remaining Balance is"+accBalance);
        }
        else
            System.out.println("insufficient Balance or incorrect pin or Inactive Account");
    }
    public void creditCash()
    {

        if(deposit_amt>0&&accStatus.equals("active")&&accpin==1234)
        {
            System.out.println("Enter the amount you want to deposit");

            accBalance=deposit_amt+accBalance;
            System.out.println("Your account balance is "+accBalance);

        }
        else
            System.out.println("Incorrect pin or Inactive Account");

    }
    public void transferFunds()
    {
        System.out.println("Enter the amount to be transfered");
        if(transfer_amt<=accBalance&&accStatus=="active"&&accpin==1234)
        {
            System.out.println("Transfer is successful of rupees "+transfer_amt);
            accBalance=accBalance-transfer_amt;=
            System.out.println("Your remaining balance is "+accBalance);

        }

    }
    public void checkBalance()
    {
        if(accStatus=="active"&&accpin==1234)
        {
            System.out.println("Your Account Balance is "+accBalance);
        }
    }
    public static void main(String[] args) {
        SavingsAccount s1=new SavingsAccount();
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter your account Number");
        long accNumber= sc.nextLong();

        System.out.println("Enter your account Name");

        System.out.println("Enter your account Balance");
        double accBalance=sc.nextDouble();

        System.out.println("Enter your age");
        int age= sc.nextInt();

        System.out.println("Enter your pin");
        int accpin= sc.nextInt();

        System.out.println("Enter 1 to Withdraw , 2 to Deposit , 3 to transfer ");
        int choice= sc.nextInt();

        switch (choice)
        {
            case 1:

                System.out.println("Enter the amount to be withdrawn");
                double withdraw_amt=sc.nextDouble();
                s1.debitCash();
                break;
            case 2:

                System.out.println("Enter the amount to be deposited");
                double deposit_amt=sc.nextDouble();
                s1.creditCash();
                break;
            case 3:

                System.out.println("Enter the amount to be transfered");
                double transfer_amt= sc.nextDouble();
                s1.transferFunds();
                break;

        }

    }
}


