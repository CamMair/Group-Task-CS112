public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();
        CurrentAccount ca = new CurrentAccount("Cameron Mair", "CA1", 500);
        bank.addAccount("ca", ca);
        bank.printAllAccounts();
    }
}
