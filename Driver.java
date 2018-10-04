public class Driver{
  public static void main(String[]args) {
    BankAccount a = new BankAccount(200.00, 2345, "mittens2008");
    System.out.println("Current balance: " + a.getBalance());
    a.deposit(100.00);
    System.out.println("Current balance: " + a.getBalance());
    System.out.println("Account ID: " + a);
  }
}
