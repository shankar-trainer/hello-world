package mockito;

import org.junit.Assert;
import org.junit.Test;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class Test1 {
   static class MyClass{
       public int getUniqueId() {
                   return 43;
       }
   }

    @Test
    public void test1() {
        //  create mock
        MyClass test = mock(MyClass.class);

        // define return value for method getUniqueId()
        when(test.getUniqueId()).thenReturn(43);

        // use mock in test....
        Assert.assertEquals(test.getUniqueId(), 43);
    }

}
