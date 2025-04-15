package mockito;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.HashMap;

public class Test2 {

  /*  // @Test
    public void disp() {

        List<String> list1 = Mockito.mock(List.class);
        list1.add("one");
        list1.clear();

        Mockito.verify(list1).add("one");
        Mockito.verify(list1).clear();
    }*/

    @Mock
    HashMap<String, Integer> mockHashMap;

    @Before
    public void setup(){
        MockitoAnnotations.initMocks(this);
    }


    @Test
    public void saveTest() {
        mockHashMap.put("A", 1);

        Mockito.verify(mockHashMap, Mockito.times(1)).put("A", 1);
        Mockito.verify(mockHashMap, Mockito.times(0)).get("A");

        Assert.assertEquals(0, mockHashMap.size());
    }
}

