class Solution {
    public int maximumCandies(int[] candies, long k) {

        int lo = 1;
        int hi = 0;

        for (int i = 0; i < candies.length; i++) {
            if (candies[i] > hi) {
                hi = candies[i];
            }
        }

        int ans = 0;

        while (lo <= hi) {

            int mid = lo + (hi - lo) / 2;

            long children = 0;

            for (int i = 0; i < candies.length; i++) {
                children += candies[i] / mid;
            }

            if (children >= k) {
                ans = mid;
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }

        return ans;
    }
}