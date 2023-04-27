import java.io.*;

class GFG2 {

// Function for finding
// distance between pivots
	static int pivotDis(int x0, int y0, int x1, int y1) {
		return (int) Math.sqrt((x1 - x0) * (x1 - x0) + (y1 - y0) * (y1 - y0));
	}

// Function for
// minimum distance
	static int minDis(int D, int r1, int r2) {
		return Math.max((D - r1 - r2), 0);
	}

// Function for
// maximum distance
	static int maxDis(int D, int r1, int r2) {
		return D + r1 + r2;
	}
/*
 * input 
 * 6 4 
 * 0 3 4 7 10m 9 
 * output  
 * 3
 * 
 * input 
 * 5 2 
 * 4 2 1 3 6
 * 5
 */
	
	
// Driver Code
	public static void main(String[] args) {
		int x0 = 0, y0 = 0, x1 = 8, y1 = 0, r1 = 4, r2 = 5;
		int D = pivotDis(x0, y0, x1, y1);
		System.out.print("Distance while " + "repulsion = " + maxDis(D, r1, r2));
		System.out.print("\nDistance while " + "attraction = " + minDis(D, r1, r2));
	}
}