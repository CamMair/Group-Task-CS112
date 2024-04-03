import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SavingsAccountTest {


        @Test
        public void setRateTest(){
            SavingsAccount savingsAccount = new SavingsAccount("Steve", "5", 2.00f);
            savingsAccount.setHighRate(5.00f);
            savingsAccount.setLowRate(1.00f);
            assertTrue(savingsAccount.getRate() > savingsAccount.getLowRate());
            assertTrue(savingsAccount.getRate() < savingsAccount.getHighRate());


            SavingsAccount savingsAccount1 = new SavingsAccount("steve", "5", 7.00f);
            savingsAccount1.setHighRate(5.00f);
            savingsAccount1.setLowRate(1.00f);
            System.out.println(savingsAccount1.getRate());
            assertTrue(savingsAccount.getRate() > savingsAccount.getLowRate());
            assertTrue(savingsAccount.getRate() <= savingsAccount.getHighRate());



        }

        @Test
        public void addInterestTest(){
            SavingsAccount savingsAccount = new SavingsAccount("Steve", "5", 5.00f);
            savingsAccount.setBalance(100.00f);
            savingsAccount.addInterest(5.00f, savingsAccount.getBalance());
            assertTrue(savingsAccount.getBalance() == 105.00f);
        }
    }

}
