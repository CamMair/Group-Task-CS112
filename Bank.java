import java.util.ArrayList;
import java.util.HashMap;

public class Bank {
    private HashMap<String, BankAccount> idAccountMap;
    private ArrayList<String> idList;

    public Bank() {
        idAccountMap = new HashMap<>();
        idList = new ArrayList<>();
    }

    public void addAccount(String id, BankAccount account) {
        idAccountMap.put(id,account);
        idList.add(id);
    }

    public void removeAccount(String id) {
        if(idList.contains(id)) {
            BankAccount bankAccount = idAccountMap.get(id);
            idAccountMap.remove(id,bankAccount);
            idList.remove(id);
        }
    }

/*
    public void printAllAccounts() {
        for(String id : idList) {
            if(idAccountMap.containsKey(id)) {
                BankAccount account = idAccountMap.get(id);
                account.printDetails();
            }
        }
    }

    public void printAllSavingsAccounts() {
        for(String id : idList) {
            if(idAccountMap.containsKey(id)) {
                SavingsAccount account  = (SavingsAccount) idAccountMap.get(id);
                account.printDetails();
            }
        }
    }

    public void printAllCurrentAccounts() {
        for(String id : idList) {
            if(idAccountMap.containsKey(id)) {
                CurrentAccount account = (CurrentAccount)idAccountMap.get(id);
                account.printDetails();
            }
        }
    }
*/

}