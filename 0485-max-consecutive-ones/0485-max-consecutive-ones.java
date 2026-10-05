class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        int max=0;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                count++;
                ans=count;
            }
            
            else {
                //ans=count;
                count=0;
            }
            
            if(ans>max){
                max=ans;
            }
        }
        
        return max;
    }
}