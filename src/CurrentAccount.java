//Cameron Mair
public class CurrentAccount extends BankAccount{
    private Integer overdrawAmount;

    public CurrentAccount(String accountName, String accountID, Integer overdrawAmount) {
        super(accountName, accountID);
        setOverdrawAmount(overdrawAmount);
    }



    public void printDetails(CurrentAccount account){
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Account id: " + getAccountNumber());
        System.out.println("Balance: " + getBalance() );
        System.out.println("Account Type: Current");
        System.out.println("Overdraw: " + getOverdrawAmount());

    }
    public Integer getOverdrawAmount() {

        return overdrawAmount;
    }

    public void setOverdrawAmount(Integer overdrawAmount) {
        if (overdrawAmount < 0 ){
            this.overdrawAmount = 0;
        } else if (overdrawAmount > 300) {
            this.overdrawAmount = 300;
        } else {
            this.overdrawAmount = overdrawAmount;
        }
    }

    @Override
    public boolean withdraw(float amount) {
        float availableFunds = this.getBalance() + this.overdrawAmount;
        float balanceBefore = this.getBalance();
        if (balanceBefore > (this.getBalance() - amount)) {
            if (availableFunds >= amount) {

                this.deductBalance(amount);
                return true;
            }
        }
        return false;
    }

    @Override
    public void printDetails() {
        System.out.println("Account Name: " + getAccountName());
        System.out.println("Account id: " + getAccountNumber());
        System.out.println("Balance: " + getBalance() );
        System.out.println("Account Type: Current");
        System.out.println("Overdraw: " + getOverdrawAmount());

    }
}