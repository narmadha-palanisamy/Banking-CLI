import java.util.Scanner;
interface AccountType {
    void accountType();
}
public class user{
    
    String name;
    int accountnumber;
    private int balance;

    user(String name,int accountnumber,int balance){
        this.name=name;
        this.accountnumber=accountnumber;
        this.balance=balance;
    }
    void deposit(int amount) {
        balance=balance+amount;
    }

    void withdrawal(int amount){
        if(amount<=balance){
            balance=balance-amount;
        }else{
            System.out.println("Insufficient balance");
        }
    }

    int getBalance(){
        return balance;
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        
        savingsaccount user1=new savingsaccount("Narmadha",12345,123,2000);
        savingsaccount user2=new savingsaccount("Yamini", 23456, 456,1000);
        savingsaccount user3=new savingsaccount("veena", 34567,789, 3000);

        System.out.print("Enter account number:");
        int account=sc.nextInt();

        System.out.print("Enter PIN:");
        int pin_no=sc.nextInt();
        
        if(account==user1.accountnumber&&user1.checkPin(pin_no)){
            System.out.println("Login successful!");

    int choice;

    do {
        System.out.println("\n----- ATM MENU -----");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check Balance");
        System.out.println("4. Change PIN");
        System.out.println("5. Account Type");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch (choice) {

            case 1:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();
                user1.deposit(deposit);
                System.out.println("Balance: " + user1.getBalance());
                break;

            case 2:
                System.out.print("Enter withdrawal amount: ");
                int withdrawal = sc.nextInt();
                user1.withdrawal(withdrawal);
                System.out.println("Balance: " + user1.getBalance());
                break;

            case 3:
                System.out.println("Balance: " + user1.getBalance());
                break;

            case 4:
                user1.changepin(321);
                System.out.println("PIN changed successfully.");
                break;

            case 5:
                user1.accountType();
                break;

            case 6:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice.");
        }

    } while (choice != 6);


        }else if(account==user2.accountnumber&&user2.checkPin(pin_no)){
           System.out.println("Login successful!");

    int choice;

    do {
        System.out.println("\n----- ATM MENU -----");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check Balance");
        System.out.println("4. Change PIN");
        System.out.println("5. Account Type");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();

                user2.deposit(deposit);

                System.out.println("Amount deposited successfully.");
                System.out.println("Balance: " + user2.getBalance());
                break;

            case 2:
                System.out.print("Enter withdrawal amount: ");
                int withdrawal = sc.nextInt();

                user2.withdrawal(withdrawal);

                System.out.println("Balance: " + user2.getBalance());
                break;

            case 3:
                System.out.println("Balance: " + user2.getBalance());
                break;

            case 4:
                user2.changepin(321);
                System.out.println("PIN changed successfully.");
                break;

            case 5:
                user2.accountType();
                break;

            case 6:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice.");
        }

    } while(choice != 6);

        }else if(account==user3.accountnumber&&user3.checkPin(pin_no)){
             System.out.println("Login successful!");

    int choice;

    do {
        System.out.println("\n----- ATM MENU -----");
        System.out.println("1. Deposit");
        System.out.println("2. Withdrawal");
        System.out.println("3. Check Balance");
        System.out.println("4. Change PIN");
        System.out.println("5. Account Type");
        System.out.println("6. Exit");

        System.out.print("Enter your choice: ");
        choice = sc.nextInt();

        switch(choice) {

            case 1:
                System.out.print("Enter deposit amount: ");
                int deposit = sc.nextInt();

                user3.deposit(deposit);

                System.out.println("Amount deposited successfully.");
                System.out.println("Balance: " + user3.getBalance());
                break;

            case 2:
                System.out.print("Enter withdrawal amount: ");
                int withdrawal = sc.nextInt();

                user3.withdrawal(withdrawal);

                System.out.println("Balance: " + user3.getBalance());
                break;

            case 3:
                System.out.println("Balance: " + user3.getBalance());
                break;

            case 4:
                user3.changepin(321);
                System.out.println("PIN changed successfully.");
                break;

            case 5:
                user3.accountType();
                break;

            case 6:
                System.out.println("Thank you!");
                break;

            default:
                System.out.println("Invalid choice.");
        }

    } while(choice != 6);

        }else{
            System.out.println("\nlogin error");
        }
    }
}
    


    class savingsaccount extends user implements AccountType{
    private int pin;
    savingsaccount(String name, int accountnumber, int pin, int balance) {
        super(name, accountnumber, balance);
        this.pin = pin;
    }

    boolean checkPin(int pin_no) {
        return pin==pin_no;
    }

    void changepin(int newpin) {
        pin = newpin;
    }

    @Override
    public void accountType() {
    System.out.println("Savings Account");
    }
}



