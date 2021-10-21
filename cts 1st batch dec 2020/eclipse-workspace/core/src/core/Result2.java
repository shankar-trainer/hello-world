package core;
//https://www.geeksforgeeks.org/count-the-number-of-ways-to-divide-n-in-k-groups-incrementally/
public class Result2 {

	static int calculate(int pos, int prev, int left, int k) {

// Base Case 
		if (pos == k) {
			if (left == 0)
				return 1;
			else
				return 0;
		}

// If N is divides completely 
// into less than k groups 
		if (left == 0)
			return 0;

		int answer = 0;

// Put all possible values  
// greater equal to prev 
		for (int i = prev; i <= left; i++) {
			answer += calculate(pos + 1, i, left - i, k);
		}
		return answer;
	}

	public static long countOptions(int people, int groups) {
		return calculate(0, 1, people, groups);

	}

	public static void main(String[] args) {
		System.out.println(countOptions(7, 3));//
		System.out.println(countOptions(8, 4));//
	}
}
