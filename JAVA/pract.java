import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.ArrayList;

public class pract {
    private double balance = 5000.00; // Initial Balance
    private final int PIN = 1234;

    public void start() {
        cls();
        Scanner scanner = new Scanner(System.in);
        ArrayList<String>thistory = new ArrayList<>();
        
        System.out.print("Enter your 4-digit PIN: ");
        try{
            int enteredPin = scanner.nextInt();
            if (enteredPin != PIN) {
            System.out.println("❌ Incorrect PIN! Access Denied.");
            scanner.close();
            return;
            }
        }catch(InputMismatchException e){
            System.out.println("❌ Incorrect WORD! Access Denied.");
            scanner.close();
            return;
        }
        
        cls();
        System.out.println("========== WELCOME TO JAVA ATM ==========");
        int choice;
        do {
            System.out.println("--- MENU ---");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Show ALL Transaction History");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:cls();
                    System.out.println("💰 Current Balance: ₹" + balance);
                    System.out.print("\n press any key.....");
                    scanner.nextLine();
                    cls();
                    break;

                case 2:cls();
                    System.out.print("Enter deposit amount: ₹");
                    double deposit = scanner.nextDouble();
                    balance += deposit;cls();;
                    thistory.add("Deposit: "+deposit+", Bal: "+balance);
                    System.out.println("✅ Deposited successfully!");
                    break;
                    
                    case 3:cls();
                        System.out.print("Enter withdrawal amount: ₹");
                        double withdraw = scanner.nextDouble();cls();
                        if(withdraw > balance){
                            System.out.println("<<<<INSUFFICIENT BALANCE>>>>");
                        }else{
                            balance -= withdraw;
                            thistory.add("Withdrawal: "+withdraw+", Bal: "+balance);
                            System.out.println("✅ Withdrawal successfully!");

                    }
                    break;

                case 4:cls();
                    for (String o : thistory){
                        System.out.println(o);
                    }
                    System.out.print("\npress anyKey.....");
                    break;
                case 5:cls();
                    System.out.println("Thank you for using Java ATM. Goodbye! 👋");
                    break;

                default:cls();
                    System.out.println("Invalid option! Try again.");
            }
        } while (choice != 5);

        scanner.close();
    }
    final public void cls(){
        System.out.print("\033c");
    }

    public static void main(String[] args) {
        new pract().start();
    }
}