package src;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;



public class CurrentAccountTest {
    private CurrentAccount ca = new CurrentAccount("Cameron Mair", "CA1", 500);

    @Test
    public void setWithdrawAmountTest(){
        assertEquals( 300, ca.getOverdrawAmount());
        ca.setOverdrawAmount(200);
        assertEquals(200, ca.getOverdrawAmount());
        ca.setOverdrawAmount(-400);
        assertEquals(0, ca.getOverdrawAmount());
    }

    @Test
    public void withdrawTest(){
        ca.setBalance(600);
        assertTrue(ca.withdraw(50));
        assertEquals(550, ca.getBalance());
        ca.setBalance(500);
        assertFalse(ca.withdraw(1100));
        assertEquals(500, ca.getBalance());
        ca.setBalance(400);
        assertTrue(ca.withdraw(700));
        assertEquals(-300, ca.getBalance());
        ca.setBalance(300);
        assertFalse(ca.withdraw(-100));
        assertEquals(300, ca.getBalance());
    }
}
