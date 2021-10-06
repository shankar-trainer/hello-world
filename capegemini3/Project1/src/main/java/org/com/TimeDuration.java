package org.com;

public class TimeDuration {
	int inputSecond;

	public TimeDuration(int inputSecond) throws BadBadValueException {
		if (inputSecond < 0)
			throw new BadBadValueException();
		else {
			this.inputSecond = inputSecond;

		}
	}

	@Override
	public String toString() {
		
		int seconds=inputSecond;
		  int hours,minutes;
		  int remainingSeconds;
		  int secondsInHour = 60 * 60;
		  int secondsInMinute = 60;
		  hours = (inputSecond/secondsInHour);
		  remainingSeconds = inputSecond - (hours * secondsInHour);
		  minutes = remainingSeconds/secondsInMinute;
		  remainingSeconds = remainingSeconds - (minutes*secondsInMinute);
		  //seconds = remainingSeconds;

		if (seconds == 0)
			return "0s";
		else if(seconds>=0)
			return seconds+"s";
		else if (seconds >= 3600)
			return hours + "h" + minutes + "m " + remainingSeconds + "s";
		else if (seconds >= 60)
			return minutes + "m " + remainingSeconds + "s";
		
		return null;
	}
	public static void main(String[] args) {
		try {
			//System.out.println(new TimeDuration(0).toString());
			System.out.println(new TimeDuration(732).toString());
			//System.out.println(new TimeDuration(7242).toString());
			
		} catch (BadBadValueException e) {
		
		}
	}
}

