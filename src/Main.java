public class Main {
    public static void main(String[] args) {
        SavingsAccount savingsAccount = new SavingsAccount("steve", "5", 2.00f);
        savingsAccount.setRate(2.00f);


        System.out.println(savingsAccount.getRate());
    }
}