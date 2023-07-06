import java.util.ArrayList;
import java.util.List;

public class NewBank {
    List<Account> accounts;

    public NewBank(){
        accounts=new ArrayList<>();
    }
    public void addAccount(Account account) {
        accounts.add(account);
    }

    public double getTotalBankBalance() {
        double totalBalance = 0.0;
        for (Account account : accounts) {
            totalBalance += account.getBalance();
        }
        return totalBalance;
    }

    public Account getAccountById(int id) {
        for (Account account : accounts) {
            if (account.getId() == id) {
                return account;
            }
        }
        return null;
    }

    public void transferAmount(Account sourceAccount, Account destinationAccount, double amount) {
        if (sourceAccount != null && destinationAccount != null) {
            sourceAccount.withdraw(amount);
            destinationAccount.deposit(amount);
            System.out.println("Amount transferred successfully");
        } else {
            System.out.println("Invalid accounts");
        }
    }

    public void closeAccount(Account account) {
        if (account != null) {
            accounts.remove(account);
            System.out.println("Account closed successfully");
        } else {
            System.out.println("Invalid account");
        }
    }

}
