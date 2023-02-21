package com.savings;

import java.util.Scanner;

public class SavingsAccountImpl {
    public static void main(String [] args)
    {
        int a;
        Scanner sc=new Scanner(System.in);
        SavingsAccount s1=new SavingsAccount();
        s1.setAccountBalance(554343);
        s1.setAccountStatus("active");
        s1.setIntrestRate(3);
        s1.setModeOfOperation("Self");
        s1.setOnlineBanking(true);
        s1.display();

        do
        {
            System.out.println("Enter 1 to Debit amount, 2 to Credit amount, 3 to view balance");
            int choice= sc.nextInt();

            switch(choice)
            {
                case 1:
                    s1.setDebit_amt(6000);

                    System.out.println("Your Remaining Balance is "+s1.debit());
                    break;
                case 2:
                    s1.setCredit_amt(3500);
                    double deposit=s1.credit();
                    System.out.println("The Acoount Balance after crediting is "+deposit);
                    break;
                case 3:
                    System.out.println("Your account balance is "+s1.retrive());
                    break;
                default:
                    System.out.println("Enter correct output");
                    break;

            }

            System.out.println("Enter 1 to continue and any interger to exit");
            a= sc.nextInt();

        }while(a==1);

    }
}
