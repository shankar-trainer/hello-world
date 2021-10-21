package org.com;

public class RaceResults {

	int starttime, finishtime;

	String tagNumber;
	TimeDuration resultTime;

	public RaceResults() {

	}

	public RaceResults(int starttime, int finishtime) {
		this.starttime = starttime;
		this.finishtime = finishtime;
	}

	void onNewResult(String tagNumber, TimeDuration resultTime) {
		this.tagNumber = tagNumber;
		this.resultTime = resultTime;
	}

	void printResults() {
		System.out.println("Result is ");
		System.out.println(tagNumber + "   " + resultTime);
	}

	public static void main(String[] args) throws BadBadValueException {

		RaceResults raceResults[] = new RaceResults[4];

		int st_time[] = { 2, 4, 6, 10 };
		int fn_time[] = { 20, 24, 46, 47 };
		int diff[] = new int[st_time.length];

		for (int i = 0; i < raceResults.length; i++) {
			diff[i] = fn_time[i] - st_time[i];
		}

		int temp;
		
		for (int x = 0; x < diff.length; x++) {
			for (int y = 0; y < diff.length - 1 - x; y++) {
				if (diff[y] > diff[y + 1]) {
					temp = diff[y];
					diff[y] = diff[y + 1];
					diff[y + 1] = temp;
				}
			}
		}
		for (int i = 0; i < raceResults.length; i++) {
			raceResults[i] = new RaceResults(st_time[i], fn_time[i]);
			
			raceResults[i].onNewResult("tag no " + (i + 1), new TimeDuration(diff[i]));
			raceResults[i].printResults();
			
		}
	}
}
