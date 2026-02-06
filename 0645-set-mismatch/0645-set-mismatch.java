class Solution {
    public int[] findErrorNums(int[] nums) {
        int[] ans = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int count = 0;          
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    count++;
                }
            }
            if (count == 2) {
                ans[0] = nums[i];   
                break;
            }
        }

        for (int i = 1; i <= nums.length; i++) {
            boolean found = false;
            for (int j = 0; j <nums.length; j++) {
                if (nums[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                ans[1] = i;        
                break;
            }
        }

        return ans;
    }
}
