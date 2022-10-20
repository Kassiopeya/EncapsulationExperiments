public class ChildBankAccount {
    private double balance;
    private double maxBalance;

    public ChildBankAccount (double maxBalance){
        this.maxBalance = maxBalance;
    }

    public boolean depositMoney (double value) {
        double toppedUpBalance = balance + value;

        if (value > 0 & toppedUpBalance < maxBalance ){
            balance += value;
            return true;
        } else {
            return false;
        }
    }

    public boolean debitMoney (double value){
        double reducedBalance = balance - value;

        if (value > 0 & reducedBalance > 0){
            balance -= value;
            return  true;
        } else {
            return false;
        }
    }

    public double getBalance (){
        return balance;
    }
}
