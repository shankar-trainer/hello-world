package cts.com.i18n;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.TimeZone;

public class Program4 {

	public static void main(String[] args) {
		LocalDateTime time = LocalDateTime.now();

		
		System.out.println(time);
		
		ZoneId zoneId = TimeZone.getTimeZone("America/Los_Angeles").toZoneId();
		
		LocalDateTime time1 = LocalDateTime.now(zoneId);
		
		
		System.out.println(time1);
		
	}
}
