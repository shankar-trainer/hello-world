package junit;

import org.junit.Assert;

public class MoneyTest {

  //  @Test
    public void check() throws Exception {
     Money money=new Money(34,"Rs");

        Assert.assertEquals(34,money.getAmount());
        Assert.assertEquals("Rs",money.getCurrency());
   }
}
