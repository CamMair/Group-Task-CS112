public abstract class BankAccount {
    private float lowRate;
    private float highRate;

    private float balance;
    private String accountName;
    private String accountNumber;

    public BankAccount(String accountName, String accountNumber) {
        this.accountName = accountName;
        this.accountNumber = accountNumber;
    }

    public float getBalance() {
        return balance;
    }
    public void setBalance(float balance){this.balance = balance;}

    public String getAccountName() {
        return accountName;
    }

    public void setAccountName(String accountName) {
        this.accountName = accountName;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public float getLowRate() {
        return lowRate;
    }

    public float getHighRate() {
        return highRate;
    }

    public void setLowRate(float newLowRate) {
        lowRate = Math.max((float) 0, Math.min(highRate, newLowRate));
    }

    public void setHighRate(float newHighRate) {
        highRate = Math.max(lowRate, Math.min(10, newHighRate));
        System.out.println(highRate);
    }

    public void deductBalance(float amount) {
        this.balance -= amount;
    }

    public boolean withdraw(float amount) {
        if (this.balance > amount) {
            this.deductBalance(amount);
            return true;
        }
        return false;
    }


    public abstract void printDetails();
}
