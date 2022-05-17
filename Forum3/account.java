public class account {
    public double balance;

    public Account(double balance){
        this.balance = balance;
    }

    public boolean deposit(double amount){
        if (amount > 0){
            this.balance += amount;
            return true;
        }
        return false;
    }

    public boolean withdraw(double amount){
        if (amount > 0 && this.balance > amount){
            this.balance -= amount;
            return true;
        }
        return false;
    }
}
