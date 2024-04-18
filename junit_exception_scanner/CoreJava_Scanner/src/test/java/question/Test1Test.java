package question;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class Test1Test {

    Test1 t1;
    @BeforeEach
    public void init(){
        t1=new Test1();
    }

    @Test
    public void checkEven(){
         Assert.assertTrue(t1.checkEven());

    }

}
