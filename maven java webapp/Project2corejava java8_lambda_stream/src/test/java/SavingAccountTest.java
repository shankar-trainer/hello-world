import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SavingAccountTest {

    SavingAccount account;

    @BeforeEach
    public void init() {
        account = new SavingAccount(1001, "amit kumar", 45000, 0.05f, 4, "jaipur");
    }

    @Test
    public void testGetActId() {
        Assertions.assertEquals(account.getActId(), 1001);
    }

    @Test
    public void testGetActName() {
        Assertions.assertEquals(account.getActName(), "amit kumar");
    }

    @Test
    public void testGetRate() {
        Assertions.assertEquals(account.getRate(), 0.05f);
    }

    @Test
    public void testGetLocation() {
        Assertions.assertEquals(account.getLocation(), "jaipur");
    }

    @Test
    public void testGetBalance() {
        Assertions.assertEquals(account.getBalance(), 45000);
        account.deposit(10000);
        Assertions.assertEquals(account.getBalance(), 55000);
        account.withdraw(100);
        Assertions.assertEquals(account.getBalance(), 54900);
    }

    @Test
    public void testGetTime() {
        Assertions.assertEquals(account.getTime(), 4);
    }


}
