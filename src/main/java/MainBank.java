// Java Program to illustrate Rookie Approach
// In Banking transaction system

class MainBank {


    public static void main(String[] args) {

        Account account1 = new Account(1, "User1");
        Account account2 = new Account(2, "User1");
        account1.deposit(40);
        account1.withdraw(20);
        account2.deposit(50);
        NewBank newBank = new NewBank();
        newBank.addAccount(account1);
        newBank.addAccount(account2);
        newBank.getTotalBankBalance();
        newBank.transferAmount(account1,account2,10);


        System.out.print(account1.getBalance());

    }
}
