package junit;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

@RunWith(Parameterized.class)
public class MoneyTestParameter {
    private int amount;
    private String currency;
    private Money money;

   @Parameterized.Parameters()
    public static final Object[] getMoney() {
        return new Object[]{
                new Object[]{10, "Rs"},
                new Object[]{20, "USD"}
        };
    }

/*    @Parameterized.Parameters
    public static Collection getMoney() {
        return Arrays.asList(new Object[][] {
                new Object[]{10, "Rs"},
                new Object[]{20, "USD"}
        });
    }*/

    public MoneyTestParameter(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
        money = new Money(amount, currency);
    }

    @Test
    public void check() throws Exception {
        Assert.assertEquals(amount, money.getAmount());
        Assert.assertEquals(currency, money.getCurrency());
    }
}
