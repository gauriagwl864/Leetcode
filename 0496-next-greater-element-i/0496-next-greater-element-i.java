class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int k=0;
        int[] ans=new int[nums1.length];
        for(int i=0;i<nums1.length;i++){
            for(int j=0;j<nums2.length;j++){
                if(nums1[i]==nums2[j]){
                    int nextGreater= -1;
                    for (int x=j+1;x<nums2.length;x++){
                        if(nums2[x]>nums2[j]){
                        nextGreater=nums2[x];
                        break;
                    }
                    
                    }
                    ans[k]=nextGreater;
                    k++;
                    
                }
            }
        }
        return ans;
        
    }
}