public class BankAccount{
    private double balance;
    private int accountID;
    private String password;
  public BankAccount(double startBalance, int startAccountID, String startPassword) {
    balance = startBalance;
    accountID = startAccountID;
    password = startPassword;
  }
  public double getBalance() {
    return balance;
  }
  public int getAccountID() {
    return accountID;
  }
  public String toString() {
    return (accountID + "/t" + balance);
  }
  public boolean deposit(double depositAmount) {
    if (depositAmount >= 0) {
      balance += depositAmount;
      return true;
    }
    return false;
  }
  public boolean withdraw(double withdrawAmount) {
    if (withdrawAmount <= balance) {
      balance -= withdrawAmount;
      return true;
    }
    return false;
  }

}
