class Solution {
    public int minOperations(int n) {
        int ans = 0;

        while (n > 0) {

            if ((n & 1) == 0) {
                n >>= 1;
            } 
            else {
                if ((n & 3) == 1) {
                    n -= 1;
                } else {
                    n += 1;
                }
                ans++;
            }
        }

        return ans;
    }
}