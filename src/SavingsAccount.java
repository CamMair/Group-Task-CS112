public class SavingsAccount extends BankAccount {
    private Float rate;


    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
     //   this.rate = Math.max((float) BankAccount.getLowRate(), Math.min(BankAccount.getHighRate(), rate));
        if (rate < BankAccount.getLowRate())
    }

    public SavingsAccount(String accountName, String accountId,Float rate){
        super(accountName, accountId);
//        this.accountName = new BankAccount().;
//        this.accountId = accountId;
          setRate(rate);

    }

    public void addInterest(Float rate, Float currentBalance){

        float newBalance = (currentBalance) + (currentBalance / rate);

    }

    public void printDetails(){
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Account ID: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + getRate());
    }
}
