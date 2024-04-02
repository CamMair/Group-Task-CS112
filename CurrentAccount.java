public class CurrentAccount{
    private Integer overdrawAmount;
    private String accountName;
    private String accountID;

    public CurrentAccount(String accountName, String accountID, Integer overdrawAmount) {
        this.overdrawAmount = setOverdrawAmount();
        this.accountName = accountName;
        this.accountID = accountID;
    }

    public void withdraw() {
        
    }

    public void printDetails(CurrentAccount account){
        System.out.println("Account Name: " + account.accountName);
        System.out.println("Account id: " + accountID);
        System.out.println("Balance: " );
        System.out.println("Account Type: AccountType");
        System.out.println("Overdraw: " account.overdrawAmount);

    }
    public Integer getOverdrawAmount() {
        return overdrawAmount;
    }

    public void setOverdrawAmount(Integer overdrawAmount) {
        if (overdrawAmount < 0 ){
            this.overdrawAmount = 0;
        } if (overdrawAmount > 300) {
            this.overdrawAmount = 300;
        } else {
            this.overdrawAmount = overdrawAmount;
        }
    }
}