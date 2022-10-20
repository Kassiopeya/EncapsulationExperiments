public class Main {
    public static void main(String[] args) {
        ChildBankAccount account = new ChildBankAccount(100);
        account.depositMoney(-1);
        account.depositMoney(10);
        account.debitMoney(2);
        System.out.println("Current balance:" + account.getBalance());
    }
}