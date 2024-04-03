//Murray Bryce

public class SavingsAccount extends BankAccount {
    private Float rate;


    public Float getRate() {
        return rate;
    }

    public void setRate(Float rate) {
        this.rate = Math.max((float) BankAccount.getLowRate(), Math.min(BankAccount.getHighRate(), rate));

    }

    public SavingsAccount(String accountName, String accountId,Float rate){
        super(accountName, accountId);
          setRate(rate);

    }

    public void addInterest(Float rate, Float currentBalance){

         Float newBalance = (currentBalance*(1+(rate/100)));
        newBalance = (float) Math.round(newBalance * 100) / 100;
        this.setBalance(newBalance);

    }

    public void printDetails(){
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Account ID: " + getAccountNumber());
        System.out.println("Balance: " + getBalance());
        System.out.println("Account Type: Savings Account");
        System.out.println("Interest Rate: " + getRate());
    }
}
