public class CurrentAccount{
    private Integer overdrawAmount;
    private String accountName;
    private String accountID;

    public CurrentAccount(String accountName, String accountID, Integer overdrawAmount) {
        this.overdrawAmount = overdrawAmount;
        this.accountName = accountName;
        this.accountID = accountID;
    }

    public Integer getOverdrawAmount() {
        return overdrawAmount;
    }

    public void setOverdrawAmount(Integer overdrawAmount) {
        this.overdrawAmount = overdrawAmount;
    }
}