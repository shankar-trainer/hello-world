package edu.abc;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;
import com.abc.bean.CalculatorTest;
import com.abc.dao.UserDaoTest;

@RunWith(Suite.class)
@SuiteClasses({ CalculatorTest.class, UserDaoTest.class })

public class MyTestSuite {

}
