package com.meeran.gs.learning;

/*
 * dp[M][K]means that, given K eggs and M moves,
	what is the maximum number of floor that we can check.
	
	The dp equation is:
	dp[m][k] = dp[m - 1][k - 1] + dp[m - 1][k] + 1,
	which means we take 1 move to a floor,
	if egg breaks, then we can check dp[m - 1][k - 1] floors.
	if egg doesn't breaks, then we can check dp[m - 1][k] floors.
	
	dp[m][k] is the number of combinations and it increase exponentially to N
*/
public class EggDrop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("REsult 2-->"+superEggDrop(1, 2));
		System.out.println("REsult 3-->"+superEggDrop(2, 6));
		System.out.println("REsult 4-->"+superEggDrop(3, 14));
	}
	
	static int superEggDrop(int K, int N) {
        int dp[] = new int[K + 1], m = 0;
        for (; dp[K] < N; ++m)
            for (int j = K; j > 0; --j)
                dp[j] += dp[j - 1] + 1;
        return m;
    }

}
