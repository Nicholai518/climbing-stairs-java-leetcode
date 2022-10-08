public class Solution {
    public int climbStairs(int n) {
        // only 1 step possible
        if (n == 1) {
            return 1;
        }
        // to hold how many distinct ways for each step
        int[] distinctWays = new int[n + 1];

        // only 1 step possible for 1 stair
        distinctWays[1] = 1;

        // two possible ways to climb 2 stairs
        distinctWays[2] = 2;

        // from stair 3 up to stair n we can use this logic:
        // distinct ways for this step:
        // distinct ways from previous step + distinct ways from the step before previous step
        for (int i = 3; i <= n; i++) {
            distinctWays[i] = distinctWays[i - 1] + distinctWays[i - 2];
        }

        // return the last int value from the array
        return distinctWays[n];
    }
}
