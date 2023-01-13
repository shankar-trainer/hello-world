import java.sql.Time;
import java.util.Timer;
import java.util.TimerTask;

public class TimerProgram    extends TimerTask{

	@Override
	public void run() {
		 System.out.println("after timer its running ");
	}

	public static void main(String[] args) {
		 Timer timer=new Timer();
		 System.out.println("it will call after 5 seconds ");
		 timer.schedule(new TimerProgram(), 1000*5);
	}
}
