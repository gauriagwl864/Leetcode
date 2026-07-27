class Solution {
    public void sortColors(int[] nums) {
        int[] ans=new int[nums.length];
        int i=0;
        int j=nums.length-1;
        for(int k=0;k<nums.length;k++){
            //ans[k]=1;
            if(nums[k]==0){
                ans[i]=nums[k];
                i++;
            }
            else if(nums[k]==2){
                ans[j]=nums[k];
                j--;
            }
        }
        while (i<=j){
            ans[i]=1;
            i++;
        }
        for(int k=0;k<nums.length;k++){
            nums[k]=ans[k];
        }
        //System.out.print(nums);
    }
}