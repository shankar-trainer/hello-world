/*Given N magnets are kept in a row one after another, either with a negative pole on the left and a positive pole on the right (01) or a positive pole on the left and a negative pole on the right (10). Considering the fact that if 2 consecutive magnets have different poles facing each other, they form a group and attract each other, find the total number of groups possible.

Examples:  

Input : N = 6, magnets = {10, 10, 10, 01, 10, 10}
Output : 3
Explanation: The groups are formed by the following magnets: {1, 2, 3},  {4}, {5, 6}

Input : N = 5, magnets = {10, 10, 10, 10, 10, 01}
Output : 2
*/

 
class GFG{ 
     
// Function to count number of groups of
// magnets formed from N magnets
static int countGroups(int n, String m[])
{
    // Intinially only a single group
    // for the first magnet
    int count = 1;
   
    for (int i = 1; i < n; i++)
   
        // Different configuration increases
        // number of groups by 1
        if (m[i] != m[i - 1])
            count++;
   
    return count;
}
   
// Driver Code
public static void main(String args[])
{
    int n = 6;
   
    String []m = { "10", "10", "10", "01", "10", "10" };
   
    System.out.println( countGroups(n, m));
   
}
}
//Output
//3