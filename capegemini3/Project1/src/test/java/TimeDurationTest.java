import org.com.BadBadValueException;
import org.com.TimeDuration;
import org.junit.Test;

public class TimeDurationTest {

	TimeDuration duration;

	@Test(expected = BadBadValueException.class)
	public void Test1() throws BadBadValueException {
		duration = new TimeDuration(0);
	}

	@Test(expected = BadBadValueException.class)
	public void Test2() throws BadBadValueException {
		duration = new TimeDuration(742);

	}
}
