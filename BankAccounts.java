package Arrays;

public class BankAccounts {
    static int noOfAccounts = 0;
    static double totalBalance = 0;
    public static class Account{
        String accountNumber;
        double balance;
        public Account(String accountNumber, double balance){
            this.accountNumber = accountNumber;
            this.balance = balance;
            noOfAccounts++;
            totalBalance += balance;
        }

    }
    static void displayBankSummary(){
        System.out.println("\nNumber of accounts: "  + noOfAccounts);
        System.out.println("Total balance: " + totalBalance);
    }
    public static void main(String[] args) {
        Account account1 = new Account("PK1234567", 55000.50);
        displayBankSummary();
        Account account2 = new Account("PK4445555", 657000.50);
        displayBankSummary();
        Account account3 = new Account("PK09091111", 432500.20);
        displayBankSummary();
        Account account4 = new Account("PK09222211", 434412.50);
        displayBankSummary();
        Account account5 = new Account("PK09312311", 770999.56);
        displayBankSummary();
    }
}
