import java.util.Scanner;

public class SavingsAccountImpl {
    public static void main(String[] args) {
        int a;
        Scanner sc = new Scanner(System.in);
        SavingsAccount s1 = new SavingsAccount("324322334232", "P Sai Pranay Reddy", "Savings", 323265, "active", 6000, 1000, 10000, 1234);
        do {
            System.out.println("Enter 1 to Withdraw Cash, 2 to Deposit Cash, 3 to View Your Account Balance");

            int choice = sc.nextInt();
            switch(choice)
            {
                case 1:
                    s1.debitCash();
                    break;
                case 2:
                    s1.creditCash();
                    break;
                case 3:
                    s1.retriveBalance();
                    break;
                default:
                    System.out.println("Enter the correct Input");

            }
            System.out.println("Enter 1 to continue and any integer to exit");
            a = sc.nextInt();
        } while (a == 1);
            s1.displayBalance();
    }
}
